package com.example.codealpha_project_onlinebookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.codealpha_project_onlinebookstore.adapter.RecyclerViewAdapter;
import com.example.codealpha_project_onlinebookstore.model.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class page extends AppCompatActivity {
    public final static String idBook="bookName.com";
    public final static String idAuthor="authorName.com";
    public final static String idName="Name.com";

    Button logout;
    List<BookDetails> bookDetailsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        Intent intent=getIntent();
        String name=intent.getStringExtra(Login.id);
        logout=findViewById(R.id.LogOut);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Account",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("check",false);
                editor.apply();
                startActivity(new Intent(page.this,MainActivity.class));
                finish();
            }
        });
        bookDetailsList=new ArrayList<>();
        addItems();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,bookDetailsList,name);
        recyclerView.setAdapter(adapter);



    }
    private void addItems()
    {
        for(int i=1;i<=10;i++)
        {
            BookDetails book=new BookDetails();
            book.setBookName("DemoBook"+i);
            book.setAuthorName("DemoAuthor"+i);
            bookDetailsList.add(book);
        }
    }
}
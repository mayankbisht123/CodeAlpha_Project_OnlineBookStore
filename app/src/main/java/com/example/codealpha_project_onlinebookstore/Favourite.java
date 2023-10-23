package com.example.codealpha_project_onlinebookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.codealpha_project_onlinebookstore.adapter.RecyclerViewAdapter;
import com.example.codealpha_project_onlinebookstore.adapter.RecyclerViewAdapter2;
import com.example.codealpha_project_onlinebookstore.model.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class Favourite extends AppCompatActivity {

    List<BookDetails> bookDetailsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        Intent intent=getIntent();
        BookDetails bookDetails=(BookDetails)intent.getSerializableExtra(Purchase.idPurchase);
        bookDetailsList=new ArrayList<>();
        addBook(bookDetails);
        RecyclerView recyclerView=findViewById(R.id.favbook);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter2 recyclerViewAdapter=new RecyclerViewAdapter2(this,bookDetailsList,null);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    private void addBook(BookDetails bookDetails)
    {
        bookDetailsList.add(bookDetails);
    }
}
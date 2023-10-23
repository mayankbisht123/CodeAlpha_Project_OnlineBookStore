package com.example.codealpha_project_onlinebookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.codealpha_project_onlinebookstore.adapter.RecyclerViewAdapter;
import com.example.codealpha_project_onlinebookstore.model.BookDetails;

public class Purchase extends AppCompatActivity {
    final static String idPurchase="purchase.com";
    Button purchase;
    TextView Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);
        purchase=findViewById(R.id.purchase);
        Name=findViewById(R.id.Name);
        Intent intent1=getIntent();
        Name.setText(intent1.getStringExtra(page.idName));
        purchase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                BookDetails bookDetails=new BookDetails();
                bookDetails.setBookName(intent1.getStringExtra(page.idBook));
                bookDetails.setAuthorName(intent1.getStringExtra(page.idAuthor));
                Intent intent2=new Intent(Purchase.this, Favourite.class);
                intent2.putExtra(idPurchase,bookDetails);
                startActivity(intent2);
                finish();
            }
        });



    }
}
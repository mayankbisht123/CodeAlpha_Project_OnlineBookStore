package com.example.codealpha_project_onlinebookstore.adapter;

import static com.example.codealpha_project_onlinebookstore.page.idAuthor;
import static com.example.codealpha_project_onlinebookstore.page.idBook;
import static com.example.codealpha_project_onlinebookstore.page.idName;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.codealpha_project_onlinebookstore.Favourite;
import com.example.codealpha_project_onlinebookstore.Purchase;
import com.example.codealpha_project_onlinebookstore.R;
import com.example.codealpha_project_onlinebookstore.model.BookDetails;

import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder>{

    private Context context;
    private List<BookDetails> bookList;
    private String Name;

    public RecyclerViewAdapter2(Context context,List<BookDetails> bookList,String Name){
        this.context=context;
        this.bookList=bookList;
        this.Name=Name;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter2.ViewHolder holder, int position) {
        BookDetails cont=bookList.get(position);
        holder.bookName.setText(cont.getBookName());
        holder.AuthorName.setText(cont.getAuthorName());
        holder.iconButton.setImageResource(R.drawable.book);

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView bookName;
        public TextView AuthorName;
        public ImageView iconButton;

        public ViewHolder(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(this);
            bookName=itemView.findViewById(R.id.bookName);
            AuthorName=itemView.findViewById(R.id.authorName);
            iconButton=itemView.findViewById(R.id.bookImage);

        }
        @Override
        public void onClick(View v) {

        }
    }
}



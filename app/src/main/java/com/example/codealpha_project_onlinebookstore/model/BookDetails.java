package com.example.codealpha_project_onlinebookstore.model;

import java.io.Serializable;

public class BookDetails implements Serializable {
    private String bookName;
    private String AuthorName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
}

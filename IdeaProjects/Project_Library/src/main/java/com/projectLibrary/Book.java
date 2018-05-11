package com.projectLibrary;

import java.sql.Date;

public class Book {
    long id;
    String title;
    String author;
    int dateOfPublication;
    int ISBN;
    String cover;       //format???
    boolean status;
    String nameOfCustomer;
    Date dateOfReturn;      //format???

    public Book(long id, String title, String author, int dateOfPublication, int ISBN, String cover, boolean status, String nameOfCustomer, Date dateOfReturn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
        this.ISBN = ISBN;
        this.cover = cover;
        this.status = status;
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfReturn = dateOfReturn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}

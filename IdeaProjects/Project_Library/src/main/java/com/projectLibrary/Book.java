package com.projectLibrary;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Library")  //add annotation to change table name
public class Book {

    @Id
    @GeneratedValue //auto create ID
            long id;
    // @Transient -- add annotation if u want ignore field, hibernate dont create this column
    @Column(name = "BookTitle") //add annotation to change column name, annotation have more parameters eg.
            // nullable = false -- field can not be null
            // length = 10 -- max length is 10 chars
            // columnDefinition = "VARCHAR(10) NOT NULL" -- u can put part of SQL instruction
            // precision = 10 -- max numbers length eg. 1234567890 (eg. for BigDecimal type)
            // scale = 2 -- max decimal precision eg. 17.25 (eg. for BigDecimal type)
    private String title;
    private String author;
    private int yearOfPublication;
    private String ISBN;
    private String cover;       //format???
    private boolean available;
    private String nameOfCustomer;

    @Temporal(TemporalType.DATE)   // you can set type: date/time/timestamp
    private java.util.Date dateOfReturn;

    public Book(){

    }
    public Book(long id, String title, String author, int dateOfPublication, String ISBN, String cover, boolean available, String nameOfCustomer, Date dateOfReturn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = dateOfPublication;
        this.ISBN = ISBN;
        this.cover = cover;
        this.available = available;
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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

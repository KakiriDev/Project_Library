package com.projectLibrary;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databasePersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //create new Book object and set all attribution
        Book book = new Book();

        //book.setId(1L); //if we set annotation "@GeneratedValue" in Book.class we dont need fillup ID field
        book.setAuthor("J.R.R. Tolkien");
        book.setCover("władcaPierścieni.png");
        book.setYearOfPublication(2013);
        book.setISBN("9788324148622");
        book.setDateOfReturn(null);
        book.setNameOfCustomer("");
        book.setAvailable(true);
        book.setTitle("The Lord of The Rings");

        entityManager.getTransaction().begin(); // start transaction, always when we add something to database we must start transaction before operation "persist"
        entityManager.persist(book);
        entityManager.getTransaction().commit(); // finish and close transactions

        entityManager.close();
        entityManagerFactory.close();
    }
}


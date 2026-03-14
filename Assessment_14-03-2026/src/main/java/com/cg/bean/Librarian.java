package com.cg.bean;

public class Librarian {
    private int librarianId;
    private String librarianName;
    private Book book;

    public Librarian(int librarianId, String librarianName, Book book) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.book = book;
    }

    public Librarian() {}

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void issueBook() {
        System.out.println("Librarian ID: "+librarianId);
        System.out.println("Librarian Name: "+librarianName);
        System.out.println("Book Details: ");
        book.displayBookDetails();
    }
}

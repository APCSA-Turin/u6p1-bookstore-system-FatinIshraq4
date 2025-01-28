package com.example.project;

public class Book{
    //5 attributes: String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //1 constructor with 5 arguments that intitializes the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.isbn=isbn;
        this.quantity=quantity;
    }

    //returns title
    public String getTitle() {return title;}

    //updates title with new value 
    public void setTitle(String title) {this.title=title;}

    //returns author
    public String getAuthor() {return author;}

    //updates author with new value
    public void setAuthor(String author) {this.author=author;}

    //returns yearPublished
    public int getYearPublished() {return yearPublished;}

    //updates yearPublished with new value
    public void setYearPublished(int yearPublished) {this.yearPublished=yearPublished;}

    //returns isbn
    public String getIsbn() {return isbn;}

    //updates isbn with new value
    public void setIsbn(String isbn) {this.isbn=isbn;}

    //returns quantity
    public int getQuantity() {return quantity;}

    //updates quantity with new value
    public void setQuantity(int quantity) {this.quantity=quantity;}

    //returns all the attributes in the format: "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
       
}
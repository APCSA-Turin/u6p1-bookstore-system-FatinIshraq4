package com.example.project;

public class User{
    //3 private attributes: String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book = new Book[5];

    //1 contructor with two parameters that initializes the name and id
    public User(String name, String Id) {
        this.name=name;
        this.Id=Id;
    }
 
    //returns the name
    public String getName() {return name;}

    //update name
    public void setName(String name) {this.name=name;}

    //returns Id
    public String getId() {return Id;}

    //update Id
    public void setId(String Id) {this.Id=Id;}

    //returns book
    public Book[] getBooks() {return book;}

    //updates book with new value
    public void setBooks(Book[] bookList) {
        this.book = bookList;
    }

    //returns a booklist for the user, if empty, output "empty"
    public String bookListInfo() {
        String result = ""; 
        for (Book book : book) { // Loop through books
            if (book == null) {
                result += "empty\n"; 
            } else {
                result += book.bookInfo() + "\n"; // Add book info
            }
        }
        return result;
    }

    //returns attributes in the format: "Name: []\nID: []\nBooks:\n[]"
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo(); 
    }
}

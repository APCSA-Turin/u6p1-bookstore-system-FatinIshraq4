package com.example.project;

public class BookStore{

    //2 attributes: Book[] books, and User[] users which is initialized to an empty array of 10 max users
    private Book[] books = new Book[0];
    private User[] users = new User[10];

    //empty constructor
    public BookStore(){}

    //returns users
    public User[] getUsers() {return users;}

    //update users with new value 
    public void setUsers(User[] users) {this.users=users;}

    //returns books
    public Book[] getBooks() {return books;}

    //adds in a user to users
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) { //checks for empty item
                users[i] = user; // Add user to the open space
                consolidateUsers();
                return;
            }
        }
    }

    //removes a user
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) { //checking to find the correct user to remove
                users[i] = null; //Removes user
                consolidateUsers();
                return;
            }
        }
    }

    //consolidates users
    public void consolidateUsers() {
        int nextEmpty = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (i != nextEmpty) {
                    users[nextEmpty] = users[i];
                    users[i] = null;
                }
                nextEmpty++;
            }
        }
    }

    //adds a book to books
    public void addBook(Book book) {
        int len = books.length+1;
        Book[] newBooks = new Book[len];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i]; //copy original list
        }
        newBooks[len - 1] = book; //add in new book
        books = newBooks;
    }

    //insert a book into books at a certain index
    public void insertBook(Book book, int idx) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < idx; i++) { //copy all the books before index
            newBooks[i] = books[i]; 
        }
        for (int i = idx + 1; i < newBooks.length; i++) {
            newBooks[i] = books[i - 1]; //move all the books over
        }
        newBooks[idx] = book; //put in the book into index
        books = newBooks;
    }

    //removes a book from books
    public void removeBook(Book book) {
        int idx = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                idx = i; //sets index to the location of the book being removed
               
            }
        }
        if (idx!=-1) {
            if (books[idx].getQuantity() == 1) {
                Book[] newBooks = new Book[books.length - 1];
                for (int i = 0; i < idx; i++) { //copy books before index
                    newBooks[i] = books[i]; 
                }
                for (int i = idx + 1; i < books.length; i++) {
                    newBooks[i - 1] = books[i]; // Shift books
                }
                books = newBooks;
            } else {
                books[idx].setQuantity(books[idx].getQuantity() - 1);
            }
        }
    }

       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}
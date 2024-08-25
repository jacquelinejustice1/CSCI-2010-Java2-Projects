/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab2;

import java.util.Scanner;

/**
 *CSCI 2011 Lab Assignment 2 Library Class
 * @author Jacqueline Justice
 */
public class Library {

    
    Scanner kb = new Scanner(System.in);

    /*
    private instance variables for the number of books in the library and
    an array of Book objects, representing the books in the library
    */
    private int numBooks;
    private Book[] library;
    private boolean flag;

    /*
    a constructor that takes an int representing the number of books 
    as a parameter and initializing the number of book and the Library array
    to a new array with the size of the number of books
    */
    public Library(int numBooks) {
        this.numBooks = numBooks;
        this.library = new Book[numBooks];
        /*
        boolean variable declared as true to represent the 
        status of the library
        */
        this.flag = true;
    }
    /*
    accessor method for the number of books
    */
    public int getNumBooks() {
        return numBooks;
    }
    /*
    a public display method that displays whether the library is empty
    or not, depending on the users inputs and displays the book information
    */
    public void display() {
        
        if(flag){
            System.out.println("Library is Empty\n");
        }else if(!flag){
            for(Book newBook : library){
                newBook.display();
            }
        }

    }
    /*
    public method addBook() that uses a for-loop to prompt the users
    for the book information and changes the boolean variable to false 
    when the book information is entered
    */
    public void addBook() {
        flag = false;

        for (int i = 0; i < library.length; i++) {

            System.out.println("Book " + (i + 1) + " title: ");
            String title = kb.next();
            kb.nextLine();
            System.out.println("Book " + (i + 1) + " author: ");
            String author = kb.next();
            kb.nextLine();
            System.out.println("Book " + (i + 1) + " year of publication:");
            int year = kb.nextInt();
            System.out.println();
            Book newBook = new Book(title, author, year);
            this.library[i] = newBook;

        }
    }

}

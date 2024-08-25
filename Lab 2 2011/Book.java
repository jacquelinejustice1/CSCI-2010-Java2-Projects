/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci2011.justicelab2;

/**
 *CSCI 2011 Lab Assignment 2 Book Class
 * 
 * @author Jacqueline Justice
 */
public class Book {
    
    /*instance variables representing the title, author and 
    year of publication for the books 
    */
    private String title;
    private String author;
    private int year;
    
    //three-parameter constructor 
    public Book(String title, String author, int yearNew){
        this.title = title;
        this.author = author;
        year = yearNew;
    }
    //accessors and mutator methods
    public String getTitle(){
        return title;
    }
    public String setTitle(String title){
       return this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public String setAuthor(String author){
        return this.author = author;
    }
    public int getYear(){
        return year;
    }
    public int setYear(int year){
        return this.year = year;
    }
    //display method that displays the inputs in a specific order
    public void display(){
        System.out.println(title + " by " + author + " (" + year + ")");
        
    }
    
}

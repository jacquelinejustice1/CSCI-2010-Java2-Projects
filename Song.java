/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci2011.justicelab1;

/**
 *CSCI 2011 Lab Assignment 1
 * Class for the JusticeLab1 assignment
 * 
 * @author Jacqueline Justice
 */
public class Song {
    private String title;
    private String artist;
    private int length; 
    
    //default constructor 
    public Song(){
        
        //initliazing the default variables
        title = "untitled";
        artist = "unknown";
        length = 0;
    }
    //a constuctor that takes four arguments
    public Song(String newtitle, String artist, int minutes, int seconds){
        
        //initliazing the variables and calculating the minutes and seconds
        title = newtitle;
        this.artist = artist;
        length = minutes * 60 + seconds; 
        
        /*
        if the seconds are greater an 59, displays error message and
        quits the program
        */
        if(seconds > 59){
            System.out.println("Error: Invalid running time value");
            System.exit(0);
        }
        /*
        if seconds or minutes are less that 0, also displays and error
        message and quits the program
        */
        if(seconds < 0 || minutes < 0){
            System.out.println("Error: Invalid running time value");
            System.exit(0);
        }
    }
    
    //getter method
    public String getTitle(){
        return title;
    }
    //mutator method
    public void setTitle(String title){
        this.title = title;
    }
    //getter method
    public String getArtist(){
        return artist;
    }
    //mutator method
     public void setArtist(String artist){
        this.artist = artist;
    }
    //getter method
    public int getLength(){
        return length;
    }
    //mutator method
    public void setLength(int length){
         this.length = length;
    }
    
    //dispaly song method
    public void display(){
        //initliazing seconds
        int seconds = 0;
        
        //if the seconds are greater or equal to 10, displays the song
        if(seconds >= 10 ){
        System.out.println("\"" + title + "\"" + " (" + artist + ") - "
                +(length / 60)+ ":" + (length%60));
        }
        /*
        if the seconds are less that 10, places a 0 in 
        front of the single seconds value
        */
        if(seconds < 10){
            System.out.println("\"" + title + "\"" + " (" + artist + ") - "
                +(length/60) + ":0" + (length%60));
        }
    }
    
}





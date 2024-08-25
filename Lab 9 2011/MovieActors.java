/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci2011.justicelab9;

/**
 *
 * @author Jacqueline Justice
 * 
 */

public class MovieActors {
    //private instance variables
    private String actorName;
    private String movieName;
    private int year;
    /*
     a parameterized constructor that takes 3 parameters as input and initializes
     the respective instance variable
    */
    public MovieActors(String actorName, String movieName, int year){
        this.actorName = actorName;
        this.movieName = movieName;
        this.year = year;
    }
    //accessors and mutator methods
    public String getActorName(){
        return actorName;
    }
    public void setActorName(String actorName){
        this.actorName = actorName;
    }
    public String getMovieName(){
        return this.movieName;
    }
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public int getYear(){
        return year;
    }
    public void getYear(int year){
        this.year = year;
    }
    /*
    Overrided toString method that displays the actors name, the movie
    name and the year of either the movie or the actor
    */
    @Override
    public String toString(){
       return "Actor Name: "+ getActorName() + ", Movie Name: " + getMovieName()+
               ", Year: " + getYear(); 
    }

} 

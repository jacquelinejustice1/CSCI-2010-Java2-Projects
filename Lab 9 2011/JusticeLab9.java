package csci2011.justicelab9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //importing keyboard
        Scanner kb = new Scanner(System.in);
      

        //creating an ArrayList of type MovieActors
        ArrayList<MovieActors> data = new ArrayList<MovieActors>();

        //do-while loop to continuously prompt the user to enter actors info
        String ans;
        do {

            /*
            using the ArrayList to add the movie actors data
            */
           data.add(addMovieActors());
          
           //asking the user if they want to continue
            System.out.println("Would you like to add another actor? (Y/N):");
            ans = kb.next();

        } while (ans.equalsIgnoreCase("Y"));
        
        /*
        after entering all of the data, displaying all of the data, displaying
        unique movies by calling the displayMove method, and displaying
        unique actors by valling the displayActor method
        */
        System.out.println(data);
        
         displayMovie(data);
        
         displayActor(data);
        
    }
    /*
    a public static MovieActors method called addMovieActors that has
    no parameters and prompts the user to enter the name of the actor,
    movie name, and year of the movie, and uses those values to create an 
    object of type MovieActors and returns the object
    */
    public static MovieActors addMovieActors() {
        Scanner kb = new Scanner(System.in);

        //prompting the user for the name of the actor
        System.out.println("Enter the name of the actor: ");
        String actorName = kb.nextLine();
        
        //prompting the user for the name of the movie
        System.out.println("Enter the name of the movie: ");
        String movieName = kb.nextLine();
       
        //prompting the user to enter the year of the movie
        System.out.println("Enter the year of the movie: ");
        int movie = kb.nextInt();

        //creating a MovieActors object and using the values from the user
        MovieActors actors = new MovieActors(actorName, movieName, movie);

        //returning the object
        return actors;
    }
    /*
    a public static void method called displayMovie that takes an
    ArrayList of type MovieActors and creates a Hashset of type
    String object to print all of the values
    */
    public static void displayMovie(ArrayList<MovieActors> actors) {
        //HashSet of type String object
        HashSet<String> movies = new HashSet<>();

        //adding the movie actor and year data
        for (MovieActors actor : actors) {
            movies.add(actor.getMovieName() + " - " + actor.getYear());

            //displaying the movie names/years
            for (String movieNameYear : movies) {
                System.out.println(movieNameYear);
            }
        }
    }
    /*
    a public static void method called displayActor that takes an object of 
    type ArrayList that is type MovieActors and creates an object of HashSet 
    of type String to display the movie actor data
    */
    public static void displayActor(ArrayList<MovieActors> movies) {
        //HashSet object of type String
        HashSet<String> actors = new HashSet<>();

        //adding the movie actors and their information
        for (MovieActors movie : movies) {
            actors.add(movie.getActorName() + " - " + movie.getYear());

            //displaying the actor and year information
            for (String actorNameYear : actors) {
                System.out.println(actorNameYear);
            }
        }

    }
    

}

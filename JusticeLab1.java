
package csci2011.justicelab1;
/**
 *CSCI 2011 Lab Assignment 1
 * 
 * A program that displays and tests the title, artist and length of 
 * a song using private methods in a class. 
 * 
 * @author Jacqueline Justice
 */
public class JusticeLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testsing the methods and constructors from the Song class
        testSongDefaultConstructor();
        System.out.println();
        testSongFourParameterConstructor();
        System.out.println();
        testDisplayMethod();
        System.out.println();
        test4ParameterConstructor();
        
    }
    /*
    static because it is independent 
    private static void methods that test the default constructor 
    method in the Song class
    */
    private static void testSongDefaultConstructor(){
        System.out.println("Testing default constructor");
        Song unknownSong = new Song();
        System.out.println("title: " + unknownSong.getTitle());
        System.out.println("artist: " + unknownSong.getArtist());
        System.out.println("length: " + unknownSong.getLength());
    }
    /*
    private static void method that tests the four-parameter constructor
    in the Song class, creating an object of the class and calling the getter
    methods in the Song class for display 
    */
    private static void testSongFourParameterConstructor(){
       System.out.println("Testing four-parameter constructor");
       Song forWhat = new Song("For What It's Worth",
               "Buffalo Springfield", 2, 37);
       
       System.out.println("title: " + forWhat.getTitle());
       System.out.println("artist: " + forWhat.getArtist());
       System.out.println("length: " + forWhat.getLength());
       
    }
    //two objects
    /*
    private static void method that tests the display method in the Song
    class
    */
    private static void testDisplayMethod(){
        System.out.println("Testing display method");
        Song songs = new Song("untitled", "unknown", 0,0);
        Song parameter = new Song("Blue Canadian Rockies", "The Byrds", 2, 2);
        songs.display();
        parameter.display();
        
    }
    /*
    private static void method that tests the four-parameter constructor
    with invalid second inputs
    */
     private static void test4ParameterConstructor(){
         System.out.println("Testing four-parameter "
                 + "constrcutor with invalid seconds");
        Song invalid = new Song("Blue Canadian Rockies", "The Byrds", 2, 100); 
        invalid.display();
    }

}

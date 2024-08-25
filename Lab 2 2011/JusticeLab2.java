
package csci2011.justicelab2;
import java.util.Scanner;
/**
 *CSCI 2011 Lab Assignment 2
 * 
 * @author Jacqueline Justice
 */
public class JusticeLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 
       
        /*
        creating an object of the book class,
        calling the testBookConstructor() method on the object that it
        takes an as argument
        */
        Book testBookCon = new Book("Parable of the Sower", "Octavia Butler", 1993);
        testBookConstructor(testBookCon);
        System.out.println();
        /*
        creating another object of the book class, and calling the
        testBookDisplay() method that takes the object as an arguement
        */
        Book testBookDisplay = new Book("Parable of the Sower", "Octavia Butler", 1993);
        testBookDisplay(testBookDisplay);
        System.out.println();
        
        /*
        creating an object of the library class, and calling the 
        testLibraryGetNumBooks() method that takes the object as an 
        argument
        */
        Library testLibNumBooks = new Library(2);
        testLibraryGetNumBooks(testLibNumBooks);
        System.out.println();
        
        /*
        creating another object of the library class and testing out
        the testLibraryDisplay() method on the object 
        */
        Library testLibDis = new Library(2);
        testLibraryDisplay(testLibDis);
        
        /*
        creating another object of the library class, and calling 
        the testLibraryAddBooks method on the object 
        */
        Library testLibAddBooks = new Library(2);
        testLibraryAddBooks(testLibAddBooks);
        System.out.println();
        
        /*
        displaying the books inputed by the user using the same 
        object of the library class testLibAddBooks 
        */
        testLibraryDisplay(testLibAddBooks);
        System.out.println();
        
    }
    /*
    a private static void method that takes an object of the
    book class as an arguement and displays the title, author
    and year of publication of the book.
    */
    private static void testBookConstructor(Book testBooks){
        
        System.out.println("Testing Book constructor");
        System.out.println("book title: " + testBooks.getTitle());
        System.out.println("book author: " + testBooks.getAuthor());
        System.out.println("year published: " + testBooks.getYear());
    }
    /*
    a private static void method that takes an object of the book
    class as an argument and displays the book information using
    the display method from the book class
    */
    private static void testBookDisplay(Book testBookDisplay){
        System.out.println("Testing Book.display()");
        testBookDisplay.display();
    }
    /*
    a privates static void method that takes an object of the library
    class as an argument and displays the number of books using the 
    getNumBooks() method
    */
    private static void testLibraryGetNumBooks(Library testLibraryNumBooks){
        System.out.println("Testing Library.getNumBooks()");
        System.out.println("Number of books: " +
                testLibraryNumBooks.getNumBooks());
        
    }
    /*
    a private static void method that takes an object of the library class 
    as an arguemnt and prompts the user to add books to the library
    using the addBook() method
    */
    private static void testLibraryAddBooks(Library libAddBooks){
        System.out.println("Testing Library.addBooks()");
        libAddBooks.addBook();
    }
    /*
    a private static void method that takes an object of the library class
    and displays the books using the display() method from the library
    class
    */
    private static void testLibraryDisplay(Library libDisplay){
        System.out.println("Testing Library.display()");
        libDisplay.display();
    }
   
    
    

}

package csci2011.justicelab7;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.File;

/**
 *CSCI Lab Assignment 7 
 * A program that opens, reads, and appends files 
 * @author Jacqueline Justice
 */
public class JusticeLab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        A PrintWriter object called testFile that is used for
        the method openFileForWriting() with the name testfile.txt
        */
        PrintWriter testFile = openFileForWriting("testfile.txt");
        
        //opening the writeLinesToFile using the returned int value
        int lines = writeLinesToFile(testFile);
        
        //using the return value for the number of lines
        System.out.println("Wrote " + lines + " lines to testfile.txt");
        //closing the file
         testFile.close();
        
         //telling the user that the file was opened for reading
        System.out.println("\nOpened file testfile.txt for reading");
        
       /*
        using the openFileForReading method to open the file to
        be read using a new Scanner object
        */
        Scanner scanner = openFileForReading("testfile.txt");
        //reading the lines from the scanner object
        lines = readLinesFromFile(scanner);
        //displaying that the scanner read the returned value of lines to the file
        System.out.println("Read " + lines + " lines from testfile.txt");
        //closing the file
         scanner.close();
        
        
        /*
        opening the testfile for appending
        */
         //telling the user that the file was opened for appending
        System.out.println("\nOpened file testfile.txt for appending");
        /*
        using the openFileForAppending method to open the file to 
        append using the PrintWriter object
        */
        testFile =  openFileForAppending("testfile.txt");
       
        //calling the writeLinesToFile() method to add them to the file
        lines = writeLinesToFile(testFile);
        //closing the file again
        testFile.close();
         //displaying that the scanner read the returned value of lines to the file
        System.out.println("Wrote " + lines + " lines to testfile.txt");
        
        /*
        opening the file again with the openFileForReading method
        */
        scanner = openFileForReading("testfile.txt");
        //reading the lines from the file with the readLinesFromFile method
        lines = readLinesFromFile(scanner);
        //showing the user how many lines were read from the file
        System.out.println("Read " + lines + " lines from testfile.txt");
        //closing the file again
        scanner.close();
    }

    /*
    A public static method called openFileForWriting 
    that takes a String representing a file name
     */
    public static PrintWriter openFileForWriting(String fileName) {
        
        //displaying that the file was open for writing
         System.out.println("Opened file testfile.txt for writing");

        //try-catch block for the FileNotFoundException
        try {

            //creates a new PrintWriter object using the given file name
            PrintWriter print = new PrintWriter(fileName);
            return print;
            

        } catch (FileNotFoundException e) {
            //displaying error message
             System.out.println("File Not Found");
            //exits the program 
            System.exit(0);
        }
        //returning the value
        return null;
    }

    /*
    a public static PrintWriter method called openFileForAppending
    that takes a string representing the file name 
    */
    public static PrintWriter openFileForAppending(String fileName) {

        //try-catch block fot the FileNotFoundException
        try {
            /*
            creating a new PrintWrtier object from a new 
            FileOutputStream using the given file name 
            */
            
            PrintWriter print = new PrintWriter
                              (new FileOutputStream(fileName, true));
            return print;
            
        } catch (FileNotFoundException e) {
           //error message
            System.out.println("Something also went wrong");  
            System.exit(0);
        }
        //returning the null for the PrintWriter object
        return null;
    }
    /*
    a private static Scanner method called openFileForReading that
    takes a string representing the file name as a paramter 
    */
    public static Scanner openFileForReading(String fileName){
       
        //try-catch block for the FileNotFoundException
        try{
            /*
            using the Scanner object to use a new File
            object using the given file name
            */
            File f = new File(fileName);
            Scanner inputStream = new Scanner(f);
            return inputStream;
            
           
        }catch(FileNotFoundException e){
            //displaying error message
           System.out.println("Error opening the file for reading");
           System.exit(0);
          
        }
        //Otherwise, returning the Scanner object
        return null;
    }
    /*
    a public static int method called readLinesFromFile that takes
    a Scanner object as a parameter
    */
    public static int readLinesFromFile(Scanner obj) {
        //initializing the number of lines to 0
      int lines = 0;
      /*
      while the Scanner object is open for user input, 
      reads each of the lines of the file and displays them
      Also, keeps track of the number of lines
      */
        while(obj.hasNextLine()){
            System.out.println(obj.nextLine());
            lines++;
        }
        //returns the result of lines
        
        return lines;
    }
    /*
    a public static int method called writeLinesToFile that 
    takes a Scanner object as a parameter 
    */
    public static int writeLinesToFile(PrintWriter obj) {

        //importing the keyboard
        Scanner kb = new Scanner(System.in);
        //initializing variables for the lines and number of lines
        String lines;
        int numLines = 0;
        
        //prompting the user to enter the texts
        System.out.println("Enter the text you want to write to the file."
                + " Enter a blank line when you are done");
        
        /*
        a do-while statement that allows the user to enter the lines
        while the number of lines is greater than zero
        and if the lines are greater than 0, it keeps track of the lines
        and prints them out 
        */
        do{
            lines = kb.nextLine();
            if(lines.length() > 0){
                numLines++;
                obj.println(lines);
            }
        }while(lines.length() > 0);
        //returns the number of lines
        return numLines;
    }

}

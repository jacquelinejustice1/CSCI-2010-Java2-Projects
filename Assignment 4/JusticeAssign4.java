
package csci2010.justiceprogram4;
import java.util.Scanner;
/**
 *
 * @author Jacqueline Justice
 */
public class JusticeAssign4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //importing scanner 
        Scanner kb = new Scanner(System.in);
        //instance variable for the users choice
        String choice = "";
        
         //display welcome message
       System.out.println
        ("Welcome to Jacqueline Justice's Hanoi tower simulation!");
        
        /*
        do-while statement to repeat the simulation
        */
       do{
       
       //prompting the user for the number of discs
       System.out.println("\nHow many discs do you wish to simulate?");
        int num = kb.nextInt();
        
        //HanoiSimulation object to run the simulation
         HanoiSimulation run = new HanoiSimulation(num);
         //running the simulation
       
        run.runSim();
       
        //prompting the user to choose if they would like to continue or not
        System.out.println("Would you like to run another simulation? (Y/N)");
        choice = kb.next();
        
       }while(choice.equalsIgnoreCase("Y"));
       
       /*
       if the choice is N, displays thank you messafe and exits 
       the program
       */
        if(choice.equalsIgnoreCase("N")){
            System.out.println("Thank you for using Jacqueline Justice's Hanoi"
                    + "simulation!");
            System.exit(0);
        }
    }

}

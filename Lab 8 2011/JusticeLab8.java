package csci2011.justicelab8;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab8  {

    /**
     * CSCI 2011 Lab Assignment 8
     * 
     * A program that creates contacts by reading and processing data
     * from binary files and writing output to binary files
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance variables
        Scanner kb = new Scanner(System.in);
        int choice;
        //do-while loop 
        do {

            /*
            displaying the menu repeatedly
            */
            displayMenu();
            //prompting the user for their choice
            System.out.println("Enter your choice: ");
            choice = kb.nextInt();

            /*
            if the choice is 1, prompts the user for the contact name 
            and the phone number of the contact, then creates a contact
            object to store the information from the user
            uses the addContact method with the object
             */
            switch (choice) {
                case 1:
                    {
                        System.out.println("Enter contact name: ");
                        String name = kb.next();
                        kb.nextLine();
                        System.out.println("Enter " + name + "'s phone number ");
                        String phoneNo = kb.next();
                        Contact contact = new Contact(name, phoneNo);
                        addContact(contact);
                        break;
                    }
            /*
            if the choice is 2, prompts the user for the contact name that
            they wish to find
            uses the findContact method on the name the user entered
             */ 
                case 2:
                    {
                        System.out.println("Enter contact name: ");
                        String name = kb.next();
                        findContact(name);
                        break;
                    }
            /*
            if the choice is 3, prompts the user for the contact
            name that whos data they wish to update
            uses the updateContact method with the contact name 
            the user entered
             */
                case 3:
                    {
                        System.out.println("Enter contact's name you would like to update: ");
                        String name = kb.next();
                        updateContact(name);
                        break;
                    }
            /*
            if the hoice is 4, prompts the user for the name of the contact
            that they wish to delete
            uses the deleteContact method with the name the user entered
             */
                case 4:
                    {
                        System.out.println("Enter contact's name you would like to "
                                + "delete: ");
                        String name = kb.next();
                        deleteContact(name);
                        System.out.println("Contact was deleted");
                        break;
                    }
            /*
            if the choice is 5, exits the program
             */
                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                default:
                    break;
            }
        } while (choice != 5);
    }

    /*
    a public static void method called addContact
    that takes an object of type Contact as a parameter
     */
    public static void addContact(Contact contact) {
        //try-catch blocks for IOException and ClassNotFoundException
        try {
            //existing contact array
            //reading existing file
            ObjectInputStream objReader = new ObjectInputStream
                                   (new FileInputStream("contacts.dat"));
            //existing contact array
            Contact[] existingContacts = (Contact[])objReader.readObject();
            //objReader.close();
            
            //updating contacts array
            Contact[] updatedContacts = new Contact[existingContacts.length + 1];
            /*
            if there are no existing contacts then the first updated 
            contact is the added contact
            */
            if(existingContacts == null){
                
                updatedContacts[0] = contact;
                  
            } else {
                
            for (int i = 0; i < existingContacts.length; i++) {
                updatedContacts[i] = existingContacts[i];
              }
            
            updatedContacts[updatedContacts.length - 1] = contact;
            
            }
            ObjectOutputStream objWriter = new ObjectOutputStream
                   (new FileOutputStream("contacts.dat"));
            objWriter.writeObject(updatedContacts);
            //objReader.close();
            System.out.println("Contact was added!");
            System.out.println(contact.toString());

        } catch (IOException e) {
          //  e.printStackTrace();
            System.out.println("IO Writing Error!");
        } catch (ClassNotFoundException e) {
            System.out.println("IO Class Error!");
        }
       

    }

    /*
    a public static method called findContact that takes the name of 
    a contact as a parameter and prints the name and phone of that
    contact using the toString method if found in the contacts.dat 
    binary file
    if not found, displays a message that the contact was not found
    */
    public static void findContact(String name) {

        //try-catch block for the reading file
        try {

            //opening the binary file, "contacts.dat" for reading
            ObjectInputStream objReader = new ObjectInputStream
                        (new FileInputStream("contacts.dat"));

            //creating a contact[] object 
            Contact[] contacts = (Contact[]) objReader.readObject();

            //if the name is null, says that theres no contact with that name
            if (name == null) {
                System.out.println("Could Not Find Contact: " + name);
            } else {
                /*
                otherwise, iterates through the contacts to find the 
                index with the mathing name and prints it
                */
                boolean found = false;
                for (int i = 0; i < contacts.length; i++) {
                    if (contacts[i].getName().equalsIgnoreCase(name)) {
                        System.out.println(contacts[i].toString());
                        found = true;
                    }
                    //if not found, says that that contact was not found
                    if (!found) {
                        System.out.println("Contact not found..");
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could not Read Contact: " + name);
        }

    }
    /*
    a public static void method called updateContact that takes a String
    representing the name as a parameter and prompts the user for a new number
    then wrutes the updated contact information to the binary file
    if there is no contact with that name saved in the contact.dat
    file, then it shows the user an error message saying that the contact does
    not exist
    */
    public static void updateContact(String name) {
        //importing scanner object
        Scanner kb = new Scanner(System.in);

        //try-caych block to read and write to the file
        try {
            ObjectInputStream objReader = new ObjectInputStream
                                  (new FileInputStream("contacts.dat"));

            Contact[] contacts = (Contact[]) objReader.readObject();

            //if the contact is null, says it could not find the contact
            if (contacts == null) {
                System.out.println("Could Not Update or Find Contact: " + name);

            } else {

                /*
                otherwise, iterates through the contacts array and file
                to find the index at which the name matches, prompts
                the user for the new phone number, sets the new phone
                number and prints out the countact name
                */
                boolean found = false;
                for (int i = 0; i < contacts.length; i++) {
                    if (contacts[i].getName().equalsIgnoreCase(name)) {
                        System.out.println(contacts[i].toString());
                        found = true;

                        System.out.println("Enter the new phone number: ");
                        String phoneNo = kb.nextLine();
                        contacts[i].setPhoneNo(phoneNo);
                    }
                }
                //if the contact is not found, tells the user that it is not found
                if (!found) {
                    System.out.println("Contact does not exist to update:" + name);
                } else {
                    //otherwise, writes the new information to the contact
                    ObjectOutputStream objWriter = new ObjectOutputStream
                               (new FileOutputStream("contacts.dat", true));
                    objWriter.writeObject(contacts);

                    objReader.close();

                }

            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could Not Update Contact: " + name);
        }
    }
    /*
    a public static void method called deleteContact that takes a String
    representing the name as a parameter, deletes it from the 
    contact.dat file, writes the updated contact array information to
    the same binary file, and replacing its orginal contacts
    if there is no contact found, shows the user a message that the contact
    does not exit
    */
    public static void deleteContact(String name) {
        //try-catch block
        try {
            ObjectInputStream objReader = new ObjectInputStream
                              (new FileInputStream("contacts.dat"));

            //existing contact array
            Contact[] deletedContact = (Contact[]) objReader.readObject();

            //if the contacts are empty, shows the user 
            if (deletedContact == null) {
                System.out.println("Could not find contact to delete: " + name);
                /*
                otherwise, iterates through the array to delete and replace
                the contacts information
                */
            } else {

                boolean found = false;
                //another contact[] object
                Contact[] updatedContacts
                        = new Contact[deletedContact.length - 1];
                for (int i = 0; i < deletedContact.length; i++) {
                    if (deletedContact[i].getName().equalsIgnoreCase(name)) {
                        found = true;
                        for (int j = i; j < deletedContact.length - 1; j++) {
                            updatedContacts[j] = deletedContact[j + 1];
                        }
                    } else if (i != deletedContact.length - 1) {
                        updatedContacts[i] = deletedContact[i];
                    }
                }
                //if it is now found, shows the user that the contact doesn't exist
                if (!found) {
                    System.out.println("Could not find contact to delete: " + name);
                } else {
                    /*
                    otherwise, shows the user that the contact was deleted
                    and writes the new information to the file
                    */
                    System.out.println("Contact was deleted: " + name);
                    ObjectOutputStream objWriter = new ObjectOutputStream
                                (new FileOutputStream("contacts.dat", true));
                    objWriter.writeObject(updatedContacts);

                    objReader.close();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could Not Find the Contact: " + name);
        }

    }
    /*
    public static void method called displayMenu that shows
    the user their options
    */
    public static void displayMenu() {
        System.out.println("Press 1 to add contact");
        System.out.println("Press 2 to find contact");
        System.out.println("Press 3 to update contact");
        System.out.println("Press 4 to delete contact");
        System.out.println("Press 5 to exit from the application");
    }

}

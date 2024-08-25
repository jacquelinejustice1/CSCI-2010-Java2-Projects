package csci2010.justiceprogram2;

import java.util.Scanner;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //declaring the variable of the type Cipher along with other variables
        String choice, ch2, ans = "";
        Cipher ciphVar;

        //displaying welcome message
        System.out.println("Welcome to Jacqueline Justice's cipher program!\n");

        do {

            //ask the user if they want to encrypt or decrypt a message
            System.out.println("Do you want to [E]crypt or [D]ecrypt?");
            choice = kb.next();
            kb.nextLine();

            //ask the user if they want to use a shift cipher or a Vigenere cipher
            System.out.println("Do you want to use a "
                    + "[S]hift cipher a [V]igenere cipher?");
            ch2 = kb.next();
            kb.nextLine();

            /*
        if the user chose to encrypt, prompts for the plaintext, generates
        the ciphertest and displays it to the user
             */
            if (choice.equalsIgnoreCase("E")) {

                /*
            if shift cipher was chosen, askes the user to enter a key
            between 0 and 25, and initialzes the Cipher variable using
            the ShiftCipher constructor 
                 */
                if (ch2.equalsIgnoreCase("S")) {
                    //prompting the user to enter a number for the key 
                    System.out.println("Please enter a number"
                            + " between 0 and 25 to use as a key:  ");
                    int key = kb.nextInt();
                    kb.nextLine();

                    //prompting the user for the plaintext
                    System.out.println("Please enter the"
                            + " plaintext to be encrypted: ");

                    String plainText = kb.nextLine();

                    ciphVar = new ShiftCipher(key);

                    System.out.println("The corresponding ciphertext is: "
                            + ciphVar.encrypt(plainText));

                    /*
                if the Vigenere cipher was chosen, asks the user to enter a
                keyword, and initalize your Cipher variable using the 
                Vigenere cipher constructor 
                     */
                } else if (ch2.equalsIgnoreCase("V")) {
                    //prompting the user to enter a keyword
                    System.out.println("Enter a keyword: ");
                    String keyWord = kb.next();
                    kb.nextLine();

                    //prompting the user to enter a plaintext
                    System.out.println("Please enter the plaintext"
                            + " to be encrypted: ");
                    String plainText = kb.nextLine();

                    //creating the object and displaying the ciphertext 
                    ciphVar = new VigenereCipher(keyWord);

                    System.out.println("The corresponding ciphertext is: "
                            + ciphVar.encrypt(plainText));
                }

                /*
            if the user chose to decrypt, prompts for the ciphertext, generates
            the plaintext and displays it to the user
                 */
            }
            else if (choice.equalsIgnoreCase("D")) {

                /*
            if shift cipher was chosen, askes the user to enter a key
            between 0 and 25, and initialzes the Cipher variable using
            the ShiftCipher constructor 
                 */
                if (ch2.equalsIgnoreCase("S")) {

                    //prompting the user to enter a key/number
                    System.out.println("Please enter a number"
                            + " between 0 and 25 to use as a key:  ");
                    int key = kb.nextInt();
                    kb.nextLine();

                    //prompting the user to enter a plaintext to be encrypted
                    System.out.println("Please enter the ciphertext"
                            + " to be decrypted: ");
                    String cipherText = kb.next();
                    kb.nextLine();

                    //declaring the object and displaying the ciphertext
                    ciphVar = new ShiftCipher(key);
                    System.out.println("The corresponding plaintext is: "
                            + ciphVar.decrypt(cipherText));

                    /*
            if the Vigenere cipher was chosen, asks the user to enter a
            keyword, and initalize your Cipher variable using the 
            Vigenere cipher constructor 
                     */
                } else if (ch2.equalsIgnoreCase("V")) {

                    //prompting the user to enter a  keyword
                    System.out.println("Enter a keyword: ");
                    String keyWord = kb.next();
                    kb.nextLine();
 
                    //prompting the user for ciphertext
                    System.out.println("Please enter the ciphertext "
                            + "to be decrypted: ");
                    String cipherText = kb.next();
                    kb.nextLine();

                    //declaring the object and displaying the plaintext
                    ciphVar = new VigenereCipher(keyWord);
                    System.out.println("The corresponding plaintext is: "
                            + ciphVar.decrypt(cipherText));

                }
            }
            System.out.println("Do you want to continute (Y/N)?: ");
            ans = kb.nextLine();

        } while (ans.equalsIgnoreCase("Y"));
        System.out.println("Thank you for using Jacqueline Justice's Cipher Program!");
        System.exit(0);
    }
}

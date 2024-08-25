/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2010.justiceprogram2;

/**
 *
 * @author Jacqueline Justice
 */
public abstract class SubstitutionCipher implements Cipher {

    //from the Cipher interface
    //takes a plaintext character and returns an encrypted ciphertext
    public abstract char encryptChar(char plainChar);
    //from the Cipher interface
    //takes a ciphertext character and returns an encrypted plaintext
    public abstract char decryptChar(char plainChar2);
    //from the Cipher interface
    //takes no arguments, resets any state maintained by the cipher
    //and returns nothing
    public abstract void reset();

    /*
    a boolean method that takes a character and returns true if it is 
    either an uppercase letter or a lowercase letter and false
    otherwise
    */
    public static boolean alphabetic(char alph) {
        return alph >= 'A' && alph <= 'Z' || alph >= 'a' && alph <= 'z';
    }

    /*
    an int method that takes a character and returns the corresponding
    key number 
    */
    public static int getKeyNum(char ch1) {
        /*
        if the character is an uppercase letter, it subtracts "A"
        from the character and returns the result
        */
        if (Character.isUpperCase(ch1)) {
            return (ch1 - 'A');
        }
        /*
        if the character is a lowercase letter, it subtracts "a" from 
        the character and returns the result
        */
        if (Character.isLowerCase(ch1)) {
            return (ch1 - 'a');
        }else
            return -1;
    }

    /*
    a char method that takes a character and an integer key and returns
    the result od shifting the character by the number of positions
    specified by the key 
    */
    public static char shiftChar(char ch, int key) {
        /*
        if the character is an uppercase letter, it performs the following 
        shift: 
        */
        if (Character.isUpperCase(ch)) {
            return (char) ((ch - 'A' + key) % 26 + 'A');
        }
        /*
        if the character is a lowercase letter, it performs the following
        shift: 
        */
        if (Character.isLowerCase(ch)) {
            return (char) ((ch - 'a' + key) % 26 + 'a');
        }
        //if the character is not alphabetic, it returns the character unchanged
        else {
            return ch;
        }
    }

    /*
    String method from the cipher class that takes a plaintext string
    and generates the corresponding ciphertext 
    */
    @Override
    public String encrypt(String plainText) {
        //call the reset to reset the cipher state
        reset();
        //create a ciphertext string, empty
        String encryptedText = "";
        /*
        for each character in the plaintext, call encryptChar to 
        encrypt it, and add the result to the end of ciphertext 
        string
        */
        for (int i = 0; i < plainText.length(); i++) {
            encryptedText += encryptChar(plainText.charAt(i));
        }
        //return the resulting ciphertext string
        return encryptedText;
    }

    /*
    a String method from the cipher class that takes a ciphertext
    */
    @Override
    public String decrypt(String cipherText) {
        //resets the cipher state 
        reset();
        //create a cipher string, empty
        String cipherString = "";
        /*
        for each character in the plaintext, call the decryptChar method
        to decrypt the, add the result to the end of the plaintext string
        
        */
        for (int i = 0; i < cipherText.length(); i++) {
            cipherString += decryptChar(cipherText.charAt(i));
        }
        //returning the resulting ciphertext 
        return cipherString;
    }
}

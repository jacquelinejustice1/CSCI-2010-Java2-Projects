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
public class VigenereCipher extends SubstitutionCipher {

    //a private String member variable that stores the key
    private String keyValue;
    //a private in member variable that keeps track of the index of the char
    private int keyIndex;


    /*
    a constructor that takes a string keyword value, initalizes the 
    keyword member variable to this value, and sets the keyword
    position member variable to 0
     */
    public VigenereCipher(String keyValue) {
        this.keyValue = keyValue;
        this.keyIndex = 0;

    }

    //accessors
    private int getKeyIndex() {
        return this.keyIndex;
    }

    private String getKeyValue() {
        return this.keyValue;
    }

    /*
    abstract methods from the SubstitutionCipher class
   
    reset method that sets the keyword index member variable to 0
     */
    @Override
    public void reset() {
        keyIndex = 0;
    }

    /*
    encryptChar method that takes a character and encrypts the given
    plaintext character 
     */
    @Override
    public char encryptChar(char plain1) {
        //get the keyword character at the current index 
        char keyChar = getKeyValue().charAt(getKeyIndex());
        //if the plaintext character is alphabetic, increments the keyword index
        if (alphabetic(plain1)) {
            keyIndex++;
        }
        /*
       if the resulting keyword index is equal to the length of the
       string, reset it to zero
         */
        if (getKeyIndex() == getKeyValue().length()) {
            keyIndex = 0;
        }
        /*
      using the inherited getKeyNum method to get the integer
      key that corresponds to the keyword character
         */
        int keyNum = getKeyNum(keyChar);
        /*
      if getKeyNum returns a non-negative value, use the inhereited
      shiftChar method to shift the plaintext characters using the
      key value and return the result
         */
        if (keyNum > 0) {
            return shiftChar(plain1, keyNum);
        } else {
            //otherwise, return the original plaintext character
            return plain1;
        }
    }

    /*
    abstract method decryptChar that decrypts the given ciphertext
    character 
     */
    @Override
    public char decryptChar(char plain2) {
        //get the keyword character at the current index
        char keyChar = getKeyValue().charAt(getKeyIndex());
        //if the ciphertext character is alphabetic, increment the keyword index
        if (alphabetic(plain2)) {
            keyIndex++;
        }
        /*
      if the resulting keyword index is equal to the length of the 
      string, reset it to 0
         */
        if (getKeyIndex() == getKeyValue().length()) {
            keyIndex = 0;
        }
        /*
      using the inherited getKeyNum method to get the integer key
      that corresponds to the keyword character
         */
        int keyNum = getKeyNum(keyChar);
        /*
      if getKeyNum returns a non-negative value, use the inherited 
      shiftChar method to shift the plaintext character using 26 minus
      the key value and return the result
         */
        if (keyNum > 0) {
            return shiftChar(plain2, 26 - keyNum);
        } else {
            //otherwise, returns the original ciphertext character
            return plain2;
        }
    }

}

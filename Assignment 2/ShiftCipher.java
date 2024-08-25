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
public class ShiftCipher extends SubstitutionCipher{

    //a private integer member variable that stores the key
    private int keyValue;

    /*
    a constrctuor that takes an integer key value as an arguement 
    and initializes the key member variable 
    */
    ShiftCipher(int keyValue) {
        this.keyValue = keyValue;
    }
    //accessor method
    public int getKeyValue(){
        return this.keyValue;
    }
    //reset method from the substitutionCipher class that does nothing
    @Override
    public void reset(){
    }
    /*
   uses the inhertied shiftChar method to shift the plaintext character
    using the key member variable
    */
    @Override
    public char encryptChar(char plainChar) {
       return shiftChar(plainChar, getKeyValue());
    }
    /*
    uses the inherited shiftChar method to shift the ciphertext
    character using a value of 26 minus the key member variable
    */
    @Override
    public char decryptChar(char decryptChar) {
        return shiftChar(decryptChar, 26 - keyValue);
    }
    
}

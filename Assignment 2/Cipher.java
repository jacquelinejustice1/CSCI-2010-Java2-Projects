

package csci2010.justiceprogram2;

/**
 *
 * @author Jacqueline Justice 
 */
public interface Cipher {

    //takes a plaintext string and returns the corresponding ciphertext string
    public String encrypt(String plainText);
    //takes a ciphertext string and returns the corresponding plaintext string
    public String decrypt(String plainText2);

    
}

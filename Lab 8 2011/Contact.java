/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab8;

import java.io.Serializable;

/**
 *
 * @author Jacqueline Justice
 */
public class Contact implements Serializable {

    //initializing private instance variables
    private String name;
    private String phoneNo;

    /*
    a parameterized constructor that takes 2 string parameters
    as input and initializes the respective instance variables
    */
    public Contact(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
    //accessors
    public String getName(){
        return name;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    /*
    Overrided toString method that returns the name and phone 
    number of the added contacts
    */
    @Override
    public String toString(){
        
        return "name: " + getName() + ",phone: " + getPhoneNo();
                
    }
}

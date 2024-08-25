/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2010.justiceprogram4;

/**
 *
 * @author Jacqueline Justice
 */
public class HanoiTowers {

    //private instance variables
    private int[] disc;
    private int numOfDiscs;
    private String rod;

    /*
    public constructor that takes an int representing in the max of
    the capacity and a string for the name of the rods
    */
    public HanoiTowers(int max, String name) {
        this.disc = new int[max];
        this.setNumOfDiscs(0);
        this.setRod(name);
    }

    //accessors and mutators
    public int getNumOfDiscs() {
        return numOfDiscs;
    }
    
    private void setNumOfDiscs(int numOfDiscs){
        this.numOfDiscs = numOfDiscs;
    }
    public int[] getDisc(){
        return disc;
    }
    
    public void setDisc(int[] disc) {
      this.disc = disc;  
    }

    public String getRod() {
        return rod;
    }
    
    private void setRod(String rod){
        this.rod = rod;
    }
    
    /*
    a public void method called push that takes an int as an arguement 
    representing a disc and throws TowerOverFlowExceptions and
    IllegalPushExceptions
    */
    public void push(int num) throws TowerOverFlowException, IllegalPushException {
        /*
        if the current number of discs is equal to the capacity of the 
        array, throws a TowerOverflowException
        */
        if(getNumOfDiscs() == disc.length){
            throw new TowerOverFlowException("Tower is overflowing!");
            /*
            if there is at least one disc on the rod and the top disc is
            smaller than the one being added, throws an
            IllegalPushException
            */
        }else if(getNumOfDiscs() >= 1 && disc[getNumOfDiscs() - 1] < num){
            throw new IllegalPushException("Illegal Push!");
        }
        else {
            /*
            Otherwise, stores the disc number in the next empty spot in the 
            array and increment the number of discs
            */
            disc[numOfDiscs] = num;
            numOfDiscs++;
            
        }
    } 
    /*
    a public int method called pop that has no arguements and throws
    an EmptyTowerException
    */
    public int pop() throws EmptyTowerException {
        /*
        if there are no discs on the rod, throws an EmptyTowerException
        */
        if(numOfDiscs == 0){
            throw new EmptyTowerException("Tower is empty!");
        } else {
            //Otherwise, decrements the number of discs
            //and returns the disc on top
            
            int discTop = disc[numOfDiscs - 1];
            numOfDiscs--;
            return discTop;
        }
    }
    /*
    Overrided String method called toString that takes no arguments
    and returns a string containing the name of the HanoiTower
    follwed by the numbers of each disc from the bottom to top
    */
    @Override
    public String toString(){
       return "Rod "+ rod + ": " + numOfDiscs;
      
    }

    
    
    
    

} 

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
public class HanoiSimulation {

    //private instance variables
    private int discs;
    HanoiTowers rod1;
    HanoiTowers rod2;
    HanoiTowers rod3;
    
    /*
    a constructor that takes an integer representing the number of discs
    
     */
    public HanoiSimulation(int discs) {
        //initializes the number of discs
        this.discs = discs;
        //initializes the three towers using the number of discs and 
        //the appropriate name
        this.rod1 = new HanoiTowers(discs, "A");
        this.rod2 = new HanoiTowers(discs, "B");
        this.rod3 = new HanoiTowers(discs, "C");

        /*
        Using the push method to add n discs with the appropriate 
        numbers in the appropriate order to rod A
        
        Push throws an exception, and  pushes in a try-block
         */
        try {
             for(int i = 0; i < discs; i++){
                rod1.push(discs - 1);
             }

        } catch (IllegalPushException | TowerOverFlowException e) {
            System.out.println(e.getMessage());
        }

    }

    //accessors and mutator methods
    public HanoiTowers getRod1() {
        return rod1;
    }

    public void setRod1(HanoiTowers rod1) {
        this.rod1 = rod1;
    }

    public void setRod2(HanoiTowers rod2) {
        this.rod2 = rod2;
    }

    public void setRod3(HanoiTowers rod3) {
        this.rod3 = rod3;
    }

    public HanoiTowers getRod2() {
        return rod2;
    }

    public HanoiTowers getRod3() {
        return rod3;
    }


    /*
    a public void method called runSim that calls the displayTowers() method
    and then the moveDiscs() method with the appropriate arguements
     */
    public void runSim() {
        displayTowers();
        moveDiscs(getRod1(), getRod2(), getRod3(), discs);
    }

    /*
    a private void recursive method called moveDiscs that take
    3 HanoiTower objects and an int representing the number
    of discs to move
     */
    public void moveDiscs(HanoiTowers source,
            HanoiTowers dest, HanoiTowers aux, int discs) {

        /*
        if the number of discs to move is 1, pops the disc from the
        source and push it onto the destitation, then calls 
        displayTowers
        
        Using a recursive call to move the discs from the source
        to the auxiliary using the destination as an auxiliary
         */
        if (discs == 1) {
            try {
                dest.push(source.pop());
                displayTowers();
               
            } catch (EmptyTowerException | TowerOverFlowException
                    | IllegalPushException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                moveDiscs(source, dest, dest, discs - 1);
                //pop the disc from the source 
                //push it onto the destination
                dest.push(source.pop());
                //call display towers
                displayTowers();
                //recursive call that moves discs from aux and then to the dest
                //using the source as an auxiliary
                moveDiscs(source, dest, source, discs - 1);

                //try-catch block for the exceptions
            } catch (EmptyTowerException
                    | IllegalPushException | TowerOverFlowException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    /*
    public void method called displayTowers() that takes no 
    arguments and displays the 3 HanoiTower objects in order
    (A, B, C)
     */
    public void displayTowers() {
        System.out.println(rod1.toString());
        System.out.println(rod2.toString());
        System.out.println(rod3.toString());
        System.out.println();
    }
}

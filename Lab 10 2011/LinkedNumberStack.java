/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci2011.justicelab10;

/**
 *
 * @author Jacqueline Justice
 */
public class LinkedNumberStack implements NumberStack {
    /*
    An inner class to represent a list node 
    */
    public class Node {
        
        //private instance variables
        private double num;
        private Node next;
        
        //2-argument constructer that initializes the variables
        public Node(double num, Node next){
            this.num = num;
            this.next = next;
        }
        //accessors and mutators
       public double getNum(){
           return num;
       }
       public Node getNext(){
           return next;
       }
       public void setNum(double num){
           this.num = num;
       }
       public void setNext(Node next){
           this.next = next;
       }
       
    }
    /*
    two-instance variables
    */
    private Node head;
    private int items;
   // LinkedList<Double> numberStack = new LinkedList<>();
    
    public LinkedNumberStack(){
        this.head = null;
        this.items = 0;
    }
    
    
    @Override
    /*
    public void push method take takes a double for the number
    it is going
    */
    public void push(double item){
        
        head = new Node(item, head);
        ++item;
       
    }
    /*
    public double pop method that throws an EmptyStackException if
    what it is called on is empty, and otherwise removes the head node,
    decrements the number of items and returns the value that was 
    stored at the head node
    */
    @Override
    public double pop() throws EmptyStackException{
        
        if(isEmpty()){
            throw new EmptyStackException("Stack is Empty!");
        } else {
            
            head = head.getNext();
            --items;
            return head.num;
        }
        
    }
    /*
    implementing the overrided isEmpty(), size(), and the clear() methods from
    the NumberStack Interface
    */
    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
    @Override
    public int size(){
       return items;
    }
    @Override
    public void clear() {
       while(!isEmpty()){
           try {
               pop();
           } catch (EmptyStackException ex) {
             System.out.println("Stack Is Empty!");
           }
       }
    }
    
    
   
    
    
    
    
    
    
    
}

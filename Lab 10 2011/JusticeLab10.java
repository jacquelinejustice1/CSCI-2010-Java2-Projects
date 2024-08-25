package csci2011.justicelab10;

import java.util.Scanner;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab10 {

    /**
     * CSCI 2011 Lab Assignment 10
     *
     * A code that uses ArrayList to store data and implement a linked data
     * structure
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        initializing Strings for the numbers and operands
        */
        String n1 = "23 21 +";
        String n2 = "11 78 73 - *";
        String n3 = "8 +";
        String n4 = "7 2 %";
        
        /*
        making ArrayListNumberStack and LinkedNumberStack objects for the
        methods and Strings
        */
        ArrayListNumberStack stack = new ArrayListNumberStack();
        LinkedNumberStack stackLink = new LinkedNumberStack();
        
       /*
        testing the evaluateRPN method with the ArrayListNumberStack
        objects and the declared Strings and operands
        */
        System.out.println("Testing ArrayListNumberStack: \n");
        evaluateRPN(stack, n1);
        System.out.println();
        evaluateRPN(stack, n2);
        System.out.println();
        evaluateRPN(stack, n3);
        System.out.println();
        evaluateRPN(stack, n4);
        System.out.println();
        /*
        testing the evaluateRPN method with the LinkedNumberStack
        objects and the declared Strings and operands
        */
        System.out.println("Testing LinkedNumberStack: \n");
        evaluateRPN(stackLink, n1);
        evaluateRPN(stackLink, n2);
        evaluateRPN(stackLink, n3);
        evaluateRPN(stackLink, n4);
    }

    /*
    a public static void method called doOperation that takes a NumberStack 
    object and a String for the operation as parameters
    also throws the EmptyStackException and UnsupportedOperationeException
     */
    public static void doOperation(NumberStack num, String op) throws EmptyStackException,
            UnsupportedOperationException {
        
        //popping the first two numbers
            double left = num.pop();
            double right = num.pop();
        
        /*
        if the operation string is equal to these symbols then pushes the
        result of performing the operation on the two numbers
        onto the stack
         */ switch (op) {
            case "+":
                num.push(right + left);
                break;
            case "-":
                double minus = right - left;
                num.push(minus);
                break;
            case "*":
                double mult = right * left;
                num.push(mult);
                break;
            case "/":
                double divide = right / left;
                num.push(divide);
                break;
            default:
                /*
                if the operation string is anything else, push
                the two numbers bacl on the stack in the opposite
                order that you popped them off and throw an 
                unsupportedOperationException
                */
                num.push(right);
                num.push(left);
                throw new UnsupportedOperationException("Unsupported!");
        }
        
    }

    /*
    public static void method called evaluateRPN that takes a NumberStack
    object and a String representing an expression in reverse Polish
    notation 
     */
    public static void evaluateRPN(NumberStack num, String rpn) {
        
        //try-catch block for the exceptions
        try {
            //showing the input that the user entered
            System.out.println("input: " + rpn);
            //create a Scanner object to read from the string
            Scanner kb = new Scanner(rpn);
            /*
            use the hasNext method of the Scanner class to loop until
            there are no more tokens in the string
            */
            while (kb.hasNext()) {
                /*
                Inside the loop, use the hasNextDouble to detemine if the
                next token can be read as a double
                */
                if (kb.hasNextDouble()) {
                    //if so, reads a double from the string and push it to the stack
                    num.push(kb.nextDouble());
                } else {
                    /*
                    if notm read a token from the string and pass it and the stack
                    to the doOperation method
                    */
                    doOperation(num, kb.next());
                }
            }
            //closing the Scanner object that was reading the string
            kb.close();
            /*
            while the while-loop is complete, pop a value from the
            stack and display it as the result of the computation
            */
            System.out.println("result: " + num.pop());
            
            //try-catch blocks to handle the exceptions and display messages
        } catch (EmptyStackException e) {
            System.out.println("Too Few Operands!");
        }catch (UnsupportedOperationException e){
            System.out.println("Unsupported Operation!");
            
            /*
            adding a finally block to clear the stack and display a newline
            */
        } finally {
            num.clear();
            System.out.println();
        }
        
    }
    
}

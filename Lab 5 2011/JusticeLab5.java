package csci2011.justicelab5;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //NumberStack object with a capacity of 4
        NumberStack n = new NumberStack(4);

        /*
        testing out the isEmpty and isFull methods before 
        using the push or pop method
        */
        System.out.println("Testing the isEmpty() and isFull() methods: ");
        System.out.println("Testing isEmpty(): " + n.isEmpty());
        System.out.println("Testing isFull(): " + n.isFull());
        //displaying the empty number stack 
        System.out.println("Number Stack:  " + n + "\n");

        //try-catch block testing out the push() method
        try {

            
            System.out.println("Testing push method: ");
            /*
            pushing numbers, 10, 1, 3, and 5, to the 
            number stack with the capicity of 4
            */
            n.push(10);
            n.push(1);
            n.push(3);
            n.push(5);
            //displaying the number stack after pushing the numbers
            System.out.println("Number Stack: " + n);
            //testing the isEmpty and isFull methods after pushing numbers
            System.out.println("Testing isFull(): " + n.isFull());
            System.out.println("Testing isEmpty(): " + n.isEmpty());
            /*
            testing the full stack exception by pushing another number
            over the capicity
            */
            System.out.println("\nTesting the Full Stack Exception: ");
            n.push(2);
            System.out.println("Number Stack: " + n);

        } catch (FullStackException e) {
            //displaying the FullStackException
            System.out.println(e.getMessage());
        }

        //while the number stack is not empty, displays the 
        //removed pop numbers and whether the stack is empty or full
        while (!n.isEmpty()) {
            try {

                System.out.println("\nTesting pop methods: ");
                System.out.println("Removed: " + n.pop());
                System.out.println("Testing isFull(): " + n.isFull());
                System.out.println("Testing isEmpty(): " + n.isEmpty());

            } catch (EmptyStackException e) {
                System.out.println(e.getMessage());

            }
        }

        /*
        testing the EmptyStackException by removing another number
        that is not in the stack 
        */
        try {
            System.out.println("\nTesting Empty Stack Exception: ");
            System.out.println("Removed: " + n.pop());
        } catch (EmptyStackException e) {
            //displaying the exception message
            System.out.println(e.getMessage());

        }

        System.out.println();

        /*
        Displaying that the stack is now empty and how many 
        numbers are in the stack
        */
        System.out.println("Testing isEmpty(): " + n.isEmpty());
        System.out.println("Number stack: " + n);
    }

}

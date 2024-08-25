

package csci2011.justicelab10;

/**
 *
 * @author Jacqueline Justice 
 */
public interface NumberStack {
    //a void method called push that has a double as a parameter
    public void push(double n);
    /*
    a method called pop that has no parameters, returns a double and
    throws an EmptyStackException
    */
    public double pop() throws EmptyStackException;
    //a method called isEmpty that has no parameters and returns a boolean
    public boolean isEmpty();
    //a method called siz that has no parameters and returns an int
    public int size();
    //a void method called clear that has no parameters
    public void clear();
    

}

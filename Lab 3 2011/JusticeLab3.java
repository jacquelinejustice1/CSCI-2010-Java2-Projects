
package csci2011.justicelab3;
import java.util.Scanner;
/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Testing Polygon constructor");
        Polygon shapePolygon = new Polygon(4);
        System.out.println(shapePolygon);
        System.out.println();
         
        System.out.println("Testing RegularPolygon constrcutor");
        RegularPolygon regularPolytest = new RegularPolygon(5, 1.0);
        System.out.println(regularPolytest);
        System.out.println();
        
        System.out.println("Testing side length mutator");
        RegularPolygon sideLengthTestReg = new RegularPolygon(5, 2);
        System.out.println(sideLengthTestReg);
        System.out.println();
        
        System.out.println("Testing RegularTriangle Constructor");
        RegularTriangle triangleShape = new RegularTriangle(4);
        System.out.println(triangleShape);
        System.out.println();
        
        System.out.println("Testing height mutator");
        triangleShape.setHeight(3.0);
        System.out.println(triangleShape);
        System.out.println();
        
        System.out.println("Testing side length mutator");
        triangleShape.setSideLength(4.0);
        System.out.println(triangleShape);
        
        
        
                
        
        
    }

}


package justicelab11;
import javafx.application.Application;
import javafx.stage.Stage;

//importing javafx 
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;     
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab11 extends Application{
    
    /*
    start method for javafx that takes a Stage object as a parameter
    */
    @Override
    public void start(Stage primaryStage){
        //Group object
        Group root = new Group();
        
        //Scene object
        Scene scene = new Scene(root);
        
        //creating the canvas
        Canvas canvas = new Canvas(450, 350);
        
        //graphicContext object
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        /*
        using the GraphicContext object to fill the canvas with an 
        orange color
        */
        gc.setFill(Color.ORANGE);
        gc.fillRect(0, 0, 454, 420);
        
        /*
        using the GraphicContext object to fill the green color
        */
        gc.setFill(Color.LIME);
        gc.fillRect(25, 25, 394, 295);
        
        /*
        Using the strokeLine method to draw the center line in white
        */
        gc.setStroke(Color.WHITE);
        gc.strokeLine(225, 25, 225, 320);
        /*
        using the strokeOval method to draw the center circle, setting the 
        weidth and height to 100 pixels
        */
        gc.strokeOval(175, 115, 100, 100);
        /*
        drawing the penalty area on both sides usind the strokeRect
        method and the width and height od the rectangle will be 54 and 132
        pixels
        */
        gc.strokeRect(25, 100, 54, 132);
        gc.strokeRect(365, 100, 54, 132);
        /*
        using the strokeArc method, setting proper angles, and setting
       ArcType to open.  Calculating and setting appropriate starting
        point of the invisible rectangle and width and height and 
        drawing the arc
        */
        gc.strokeArc(55, 113, 50, 100, 270, 180, ArcType.OPEN);
        gc.strokeArc(340, 113, 50, 100, 90, 180, ArcType.OPEN);
        
        /*
        using the fillText method to display "Soccer Field" at the top
        */
        gc.setFill(Color.WHITE);
        gc.fillText("Soccer Field", 200, 20);
        
        //setting the title of the canvas
        root.getChildren().add(canvas);
        primaryStage.setTitle("Soccer Field: YourLastName: Lab 11: CSCI 2011");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //invoking the launch method 
        launch(args);
    }

}

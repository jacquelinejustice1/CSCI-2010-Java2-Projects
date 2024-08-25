
package justiceprogram6;
//imports from javafx
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
/**
 *
 * @author Jacqueline Justice
 */
public class JusticeProgram6 extends Application {
    
    
    //private static final variables for the monthly payment String
    private static final String MONTHLY_PAYMENT = "  The monthly payment is: ";
    
     @Override
     public void start(Stage stage){
         
         //starting the showMortgageCalculatorWindow method
           showMortgageCalculatorWindow(stage);
         
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
     /*
    private static void method called showMortgagCalculatorWindow that takes
    a Stage object as a parameter and then displays the mortgage calculate
    window
    */
    private static void showMortgageCalculatorWindow(Stage stage){
        
        //label object for the header
        Label headLbl = new Label("\n Jacqueline Justice's Mortgage Rate Calculator ");
        
        //GridPanel object to create the panel
        GridPane panel = new GridPane();
        
        /*
        Label objects for the loan amount, interest rate, number of years, 
        payments per year and the monthly payment
        */
        Label loanAmtLbl = new Label(" Loan Amount:");
        Label interestRateLbl = new Label(" Annual Interest Rate");
        Label yearsLbl = new Label(" No of Years(Loan Term)");
        Label paymentLbl = new Label(" Payments Per Year");
        Label lblMonthPay = new Label(" \n\n\n\n\n\n The monthly payment is ");
        
        
        /*
        TextField objects for the loan amount, interest rate,
        year, and monthly payments
        */
        TextField txtLoanAmount = new TextField();
        TextField txtInterestRate = new TextField();
        TextField txtYear = new TextField();
        TextField txtPayments = new TextField();
        
        //button object
        Button btnCalc = new Button("Calculate");
        
       
       //making the mouse turn into the cursor hand when moved
       //over the head label
        headLbl.setOnMouseMoved(new EventHandler<MouseEvent>(){
        
            @Override
            public void handle(MouseEvent t){
                headLbl.setCursor(Cursor.HAND);
            }
        });
        
        headLbl.setOnMouseExited(new EventHandler<MouseEvent>(){
            
            @Override
            public void handle(MouseEvent t){
                headLbl.setCursor(Cursor.MOVE);
            }
        });
      
        
        //labels and text fields
        panel.add(loanAmtLbl, 0, 2, 3, 4);
        panel.add(txtLoanAmount, 4, 2, 3, 4);
        
        panel.add(interestRateLbl, 0, 5, 1 ,4);
        panel.add(txtInterestRate, 5, 5, 1 ,4);
        
        panel.add(yearsLbl, 0, 8, 1 ,4);
        panel.add(txtYear, 5, 8, 1 ,4);
        
        panel.add(paymentLbl, 0, 11, 1 ,4);
        panel.add(txtPayments, 5, 11, 1 ,4);
        
        //monthly pay
         panel.add(lblMonthPay, 0, 25, 2, 4);
        
        //adding button
        panel.add(btnCalc, 5, 14, 10, 4);
        
        
        /*
        setting the button to calculate the mortgage rate with
        the information the user entered
        */
        btnCalc.setOnAction(new EventHandler<ActionEvent>(){
                              //(ActionEvent t) -> {
            
            @Override
            public void handle(ActionEvent t){
             double monthlyPayments = CalculateHandler.calculateMonthlyPayments
             (Double.parseDouble(txtLoanAmount.getText()), 
             Double.parseDouble(txtInterestRate.getText()),
             Integer.parseInt(txtYear.getText()), 
             Integer.parseInt(txtPayments.getText()));
             
             lblMonthPay.setText(MONTHLY_PAYMENT.concat
             (String.format("%.2f", monthlyPayments)));
                    }
            });
        
        
        //gaps between panels
        panel.setVgap(10);
        panel.setHgap(0);
        
        //creating the canvas
        Canvas canvas = new Canvas(150,150);
        
        //creating the graphicsContext object
        GraphicsContext gc = canvas.getGraphicsContext2D();
         
         
         //house building
         gc.setFill(Color.WHITE);
         gc.fillRect(150, 150, 170, 150);
         
         gc.setFill(Color.SANDYBROWN);
         gc.fillRect(0, 50, 150, 130);
         
         gc.strokeRect(0, 50, 150, 150);
         
         //roof
         gc.setFill(Color.GRAY);
         gc.fillPolygon(new double[]{0,75,150}, new double[]{50,0,50}, 3);
         gc.strokePolyline(new double[]{0,75,150}, new double[]{50,0,50}, 3);
         
         //using the windows method
         drawWindows(15,65,30,gc);
         drawWindows(60,65,30,gc);
         drawWindows(105,65,30,gc);
         drawWindows(15,105,30,gc);
         drawWindows(105,105,30,gc);
         
         //front door
         gc.setFill(Color.TOMATO);
         gc.fillRect(60, 105, 30, 60);
         gc.strokeRect(60, 105, 30, 60);
         
         //chimney
         gc.fillRect(105, 10, 15, 30);
         gc.strokeRect(105, 10, 15, 30);
         
         //door window
         gc.setFill(Color.SKYBLUE);
         gc.fillOval(65, 110, 20, 20);
         gc.strokeOval(65, 110, 20, 20);
         
         //drawing shutters
         drawShutters(15, 65, 7, 30, gc);
         drawShutters(40, 65, 7, 30, gc);
         drawShutters(60, 65, 7, 30, gc);
         drawShutters(85, 65, 7, 30, gc);
         drawShutters(105, 65, 7, 30, gc);
         drawShutters(130, 65, 7, 30, gc);
         
         //window lines
         gc.setStroke(Color.WHITE);
         gc.strokeLine(30, 106, 30, 134);
         gc.strokeLine(120, 106, 120, 134);
         gc.strokeLine(106, 120, 134, 120);
         gc.strokeLine(16, 120, 44, 120);
         
         gc.strokeLine(31, 66, 31, 94);
         gc.strokeLine(121, 66, 121, 94);
         gc.strokeLine(113, 80, 129, 80);
         gc.strokeLine(23, 80, 39, 80);
         
         //BorderPane object for the house and to seperate the 2 parts 
         //of the canvas
         BorderPane bP = new BorderPane();
         
         //setting the calculator part to the left side
         bP.setLeft(panel);
         //setting the house to the right side
         bP.setRight(canvas);
         //setting my head label at the top of the BorderPane
         bP.setTop(headLbl);
         //setting the monthly pay output to the bottom of the BorderPane
         bP.setBottom(lblMonthPay);
         
        //creating the scene and setting the title
         Scene scene = new Scene(bP);
      
        //setting the title
         stage.setTitle("Mortgage calculator");
       
        //showing the graphics
        stage.setScene(scene);
        stage.show();
        
    }
    /*
    public static void method called drawWindows that takes 2
    double for the cordinates, a double for the sides of the
    squares, and then the graphicsContext object to build the
    windows
    */
    public static void drawWindows
        (double x, double y, double side, GraphicsContext gc){
        
            //setting the windows to the color blue
        gc.setFill(Color.SKYBLUE);
        //drawings the windows with the users inputs
        gc.fillRect(x, y, side, side);
        gc.strokeRect(x, y, side, side);
        
    }
       
    public static void drawShutters
        (double x, double y, double side1, double side2, GraphicsContext gc)  {
        
            gc.setFill(Color.DARKCYAN);
            gc.fillRect(x, y, side1, side2);
            gc.strokeRect(x, y, side1, side2);
            
    } 
    
    

}

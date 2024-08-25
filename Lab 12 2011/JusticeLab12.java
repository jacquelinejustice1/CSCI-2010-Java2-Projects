
package justicelab12;

//imports from javafx
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;



/**
 *CSCI 2011 Lab Assignment 12 
 * 
 * Creating a simple even driven JavaFX application using buttons, TextFields,
 * TextArea and organizing different graphical elements using different 
 * layout options
 * 
 * @author Jacqueline Justice
 */
public class JusticeLab12 extends Application {
    
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
        //launhing the start method
       launch(args);
    }
   /*
    private static void method called showMortgagCalculatorWindow that takes
    a Stage object as a parameter and then displays the mortgage calculate
    window
    */
    private static void showMortgageCalculatorWindow(Stage stage){
        
        //label object for the header
        Label headLbl = new Label(" Jacqueline Justice's Mortgage Rate Calculator ");
        
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
        Label lblMonthPay = new Label("  The monthly payment is ");
        
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
        
        
        //adding header label
       //panel.add(headLbl, 0,0,2,4);
       
       
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
        
        
        //gaps between panels
        panel.setVgap(10);
        panel.setHgap(0);
      
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
        
        //creating the scene and setting the title
        Scene scene = new Scene(panel, 450, 300);
        stage.setTitle("Mortgage calculator");
        stage.setScene(scene);
        stage.show();
        
    }
    

}

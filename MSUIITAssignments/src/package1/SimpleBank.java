package package1;
import java.util.Scanner;

public class SimpleBank {
	// create class named simplebank
    public static void main(String[] args) {
    	// put main in class
        SimpleBank bank = new SimpleBank();
        // rename simplebank to bank
        bank.Bank();
    }

    public void Bank() {
        Scanner obj = new Scanner(System.in);
        
        int savings = 25461; 
        int depositAdd;
        int withdrawMinus;
// set ints
        System.out.println("Your Current Account balance is: " + savings);
// First text
        System.out.println("Would you like to deposit or withdraw? (d/w)");
        String choice = obj.next();
        // input indicator and string choice must be below if you have println

        if (choice.equals("d")) {
            System.out.println("Enter the amount to deposit: ");
            //input indicator
            depositAdd = obj.nextInt();
            savings += depositAdd;
            // savings number will be saved and added from deposit number
            System.out.println("New balance after deposit: " + savings);
            // print new number
            
        } else if (choice.equals("w")) {
        	// else if for if input is w
            System.out.println("Enter the amount to withdraw: ");
            withdrawMinus = obj.nextInt();
            
            if (withdrawMinus <= savings) {
            	// if savings are higher than minus then we can minus
                savings -= withdrawMinus;
                // same concept, save savings and minus from withdraw number
                System.out.println("New balance after withdrawal: " + savings);
                // print
                
            } else {
                System.out.println("Insufficient balance for withdrawal.");
                // else for when if savings are lower than the minus
            }
        } else {
            System.out.println("Invalid choice.");
        }

        obj.close();
    }
}

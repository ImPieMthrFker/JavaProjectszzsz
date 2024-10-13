package package1;
import java.util.Scanner;
//start scanenr stuff
public class SimpleCalculator1 {
//create class
    public static void main(String[] args) {
    
    Calculator(); }
    public static void Calculator() {
        Scanner obj = new Scanner(System.in);
        int number1;
           int number2;
           String Operator;
//create ints and the string stuff
           
            System.out.println("Please enter a number: ");
            number1 = obj.nextInt();
//input indicator and the print stuff
            System.out.println("Please enter another number: ");
            number2 = obj.nextInt();
//aother input indicator and print
            
            System.out.println("Please enter operation");
            // for operatior in console
            Operator = obj.next();

            if (Operator.equals("add"))
            {
                System.out.println("your answer is " + (number1 + number2));
            }
            
            if (Operator.equals("minus"))
            {
                System.out.println("your answer is " + (number1 - number2));
            }
            

         if   (Operator.equals("divide"))
            {
                System.out.println("your answer is " + (number1 / number2));
            }
         
            if (Operator.equals("multiply"))
            {
                System.out.println("your answer is " + (number1 * number2));
            }
            
            
            obj.close();
            // close the scanner above
}

    }

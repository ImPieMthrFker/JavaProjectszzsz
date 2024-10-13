package package1;
import java.util.Scanner;
//start scanenr stuff
public class VeryBasicCalculator {
//create class
    public void Calculator() {
        Scanner obj = new Scanner(System.in);
        int addends1;
        int addends2;
//create ints
        try {
            System.out.println("Please enter a number: ");
            addends1 = obj.nextInt();
            Thread.sleep(1000);
//input indicator
            System.out.println("Please enter another number: ");
            addends2 = obj.nextInt();
            Thread.sleep(1000);
//aother input indicator
            // Output the sum
            System.out.println("\nThe sum is: " + (addends1 + addends2));
        } catch (InterruptedException e) {
            System.out.println("Error: Interrupted exception");
        } finally {
            obj.close();
        }
    }

    public static void main(String[] args) {
        VeryBasicCalculator calc = new VeryBasicCalculator();
        calc.Calculator();
    }
}
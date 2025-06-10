package src.javaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tuition
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#,###,###.00");
            String name = "";
            double units;
            double price = 0.0;
            
            double computedTuitionFee = 0.0;
            double discountCash = 0.0; 
            double cashPayment = 0.0;
            double penaltyMinusTwo = 0.0;
            double penaltyTwo = 0.0;
            double penaltyMinusThree = 0.0;
            double penaltyThree = 0.0;

            System.out.print("Enter name of student: ");
            name=input.nextLine();
            System.out.print("Enter number of units enrolled: ");
            units=input.nextDouble();
            System.out.print("Enter price per unit: ");
            price=input.nextDouble();

            computedTuitionFee = units * price;
            discountCash = computedTuitionFee * 0.1;
            cashPayment = computedTuitionFee - discountCash;
            penaltyMinusTwo = computedTuitionFee * 0.05;
            penaltyTwo = computedTuitionFee + penaltyMinusTwo;
            penaltyMinusThree = computedTuitionFee * 0.1;
            penaltyThree = computedTuitionFee + penaltyMinusThree;
            System.out.println();
            System.out.println("Computed Tuition Fee: " + computedTuitionFee);
            System.out.println(name + ", you could avail the following payment mode: ");
            System.out.println();
            System.out.println("Payment Mode: ");
            System.out.println("Cash Payment: " + cashPayment + " dollars");
            System.out.println("2-installment: " + penaltyTwo + " dollars");
            System.out.println("3-installment: " + penaltyThree + " dollars");
        }
}
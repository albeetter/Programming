package src.javaActivity;
import java.util.*;
import java.text.*;
public class Voters {

    public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#,###,###.00 Pesos");

        double discount = 0;
        double additional = 0;
        double fare = 0;

        System.out.print("Enter Discount for Ordinary Passenger: ");
        int ordsc = input.nextInt();
        System.out.print("Business class additional Fare for Ordinary Passenger: ");
        double ordadd = input.nextDouble();

        System.out.println();
        System.out.print("Enter Discount for Student Passenger: ");
        int studsc = input.nextInt();
        System.out.print("Business class additional Fare for Ordinary Passenger: ");
        double stuadd = input.nextDouble();

        System.out.println();
        System.out.print("Enter Discount for Senior Citizen Passenger: ");
        int srdsc = input.nextInt();
        System.out.print("Business class additional Fare for Senior Citizen Passenger: ");
        double sradd = input.nextDouble();

        System.out.println("");
        System.out.print("Enter Fare: ");
        fare = input.nextDouble();

        System.out.print("Passenger type [O,S,C]: ");
        char type = input.next().charAt(0);

        switch(type)
            {
                case 'O': discount = ordsc*0.01; 
                    additional = ordadd;
                    break;
                case 'S': discount = studsc*0.01;
                    additional = stuadd;
                    break;
                case 'C': discount = srdsc*0.01; 
                    additional = sradd;
                    break;
                default: discount = 0; 
                    break;
            }

        System.out.print("Travelling in business class [Y/N]: ");
        String businessStr = input.next();
        businessStr = businessStr.toUpperCase();
        char business = businessStr.charAt(0);

        switch (business)
            {
                case 'Y': ;break;
                case 'N': additional = 0;break;
                default: break;
            }
        double discounted = fare * discount;
        System.out.println("Discount: "+ df.format(discounted));
        System.out.println("Business class charge: "+ df.format(additional));

        System.out.println("New Fare: " + ((fare-discounted) + additional)); 
        
        }
            }

package src.javaActivity;

import java.util.*;
import java.text.*;

public class Fare
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###.00 Pesos");

        System.out.print("Enter Discount for Ordinary Passenger: ");
        int ordsc = input.nextInt();
        System.out.print("Business class additional Fare for Ordinary Passenger: ");
        double ordadd = input.nextDouble();

        System.out.println("");
        System.out.print("Enter Discount for Student Passenger: ");
        int studsc = input.nextInt();
        System.out.print("Business class additional Fare for Student Passenger: ");
        double studadd = input.nextDouble();

        System.out.println("");
        System.out.print("Enter Discount for Senior Citizen Passenger: ");
        int srdsc = input.nextInt();
        System.out.print("Business class additional Fare for Senior Citizen Passenger: ");
        double sradd = input.nextDouble();

        System.out.println("");
        System.out.print("Enter fare: ");
        double fare = input.nextDouble();

        System.out.print("Passenger type [O,S,C]: ");
        char passenger = input.next().charAt(0);

        System.out.print("Travelling in business class [Y/N]: ");
        char busClass = input.next().charAt(0);
        double bclass = 0;
        double discount = 0;

        switch (passenger)
            {
                case 'O':
                case 'o':
                    switch (busClass)
                        {
                            case 'Y':
                            case 'y':
                            	{
                            		bclass = ordadd;
                            		discount = ordsc * .01;
                            	}
                                break;
                            case 'N': 
                            case 'n':
                            	{
                            		bclass = 0;
                            		discount = ordsc * .01;
                            	}
                                break;
                        }
                    break;
                case 's': 
                case 'S':
                	switch (busClass)
                	{
                	case 'y':
                	case 'Y':
                	{
                		bclass = studadd;
                		discount = studsc * .01;
                	}
                	break;
                	
                	case 'n':
                	case 'N':
                	{
                		bclass = 0;
                		discount = studsc * .01;
                	}
                	break;
                	}
                	break;
                case 'c':
                case 'C':
                	switch (busClass)
                	{
                	case 'y':
                	case 'Y':
                	{
                		bclass = sradd;
                		discount = srdsc * .01;
                	}
                	break;
                	
                	case 'n':
                	case 'N':
                	{
                		bclass = 0;
                		discount = srdsc * .01;
                	}
                	break;
                	}
                	break;
            }
        
        
        System.out.println("");
        double discounted = fare * discount;
        System.out.println("Discount: " + df.format(discounted));
        System.out.println("Business class charge: " + df.format(bclass));
        System.out.println("");

        double dfare = fare - discounted;
        double nfare = dfare + bclass;
        System.out.println("New fare: " + df.format(nfare));
    }
        
}
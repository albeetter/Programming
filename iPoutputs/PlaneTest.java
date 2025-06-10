package iPoutputs;
import java.util.Scanner;

public class PlaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nPress:\n" +
                    "P - Add passengers to a class\n" +
                    "S - Show current seat allocation\n" +
                    "Q - Exit the program");
            System.out.print("Press Value: ");
            String command = input.nextLine().toUpperCase();

            switch (command) {
                case "P":
                    addPassengers(airplane, input);
                    break;
                case "S":
                    System.out.println(airplane.showSeating()); 
                    break;
                case "Q":
                    System.out.println("Exiting program.");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
                    break;
            }
        }
    }

    private static void addPassengers(Airplane airplane, Scanner input) {
        System.out.print("Enter class (F: first class | Any Key: economy): ");
        String classType = input.nextLine().toUpperCase();
        
        System.out.print("Enter number of passengers (1-2 for first, 1-4 for economy): ");
        String numPassengersStr = input.nextLine();
        int numPassengers = Integer.parseInt(numPassengersStr);
        
        System.out.print("Enter seating preference (W: Window in first; A: Aisle or W: Window in economy): ");
        String preference = input.nextLine().toUpperCase();

        String result = airplane.addPassengers(classType, numPassengers, preference);
        System.out.println(result);
    }
}

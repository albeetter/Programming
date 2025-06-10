package src.javaActivity;
import java.util.Scanner;

public class AdvanceArray {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        boolean common = false;

        System.out.print("Enter size of the 1st array: ");
        num1 = input.nextInt();

        System.out.print("Enter size of the 2nd array: ");
        num2 = input.nextInt();

        System.out.print("Enter size of the 3rd array: ");
        num3 = input.nextInt();

        int arval1[] = new int[num1];
        int arval2[] = new int[num2];
        int arval3[] = new int[num3];

        System.out.println();

        System.out.print("Enter value of the 1st array: ");
        for (int i=0; i < num1; i++) {
            arval1[i]= input.nextInt();
        }

        System.out.print("Enter value of the 2nd array: ");
        for (int i=0; i < num2; i++) {
            arval2[i]= input.nextInt();
        }

        System.out.print("Enter value of the 3rd array: ");
        for (int i=0; i < num3; i++) {
            arval3[i]= input.nextInt();
        }

        System.out.println();

        System.out.print("Value of array 3: ");
        for (int value : arval3) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Value of array 2: ");
        for (int value : arval2) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Value of array 1: ");
        for (int value: arval1) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.print("Common Elements: ");

        for (int i = 0; i < num1; i++) {
            boolean foundInSecond = false;
            for (int j = 0; j < num2; j++) {
                if (arval1[i] == arval2[j]) {
                    foundInSecond = true;
                    common = true; 
                    break;
                }
            }

            if (foundInSecond) {
                boolean foundInThird = false;
                for (int k = 0; k < num3; k++) {
                    if (arval1[i] == arval3[k]) {
                        foundInThird = true;
                        common = true; 
                        break;
                    }
                }

                if (foundInThird) {
                    System.out.print(arval1[i] + " ");
                }
            }
        }

        if (!common) {
            System.out.print("No Common Elements");
        }
    }
}
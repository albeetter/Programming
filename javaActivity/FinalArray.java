package src.javaActivity;
import java.util.*;
public class FinalArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows: ");
		int rows = input.nextInt();
		System.out.print("Enter Number of Columns: ");
		int cols = input.nextInt();
		
		System.out.println();
		
		int element[][]= new int[rows][cols];
		//storing data
		for (int r=0; r<rows; r++) 
		{
			for (int c=0; c<cols; c++) 
			{
				System.out.print("Enter element" + (r*cols+c+1) + " : ");
				element [r][c] = input.nextInt();
			}
		}
		
		//matrix
		System.out.println();
		System.out.println("\nMatrix Input:");
		for (int r=0; r<rows; r++)
		{
			for (int c=0; c<cols; c++)
			{
				System.out.print(element [r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nTransposed Matrix:");
		for (int r=0; r<cols; r++)
		{
			for (int c=0; c<rows; c++)
			{
				System.out.print(element [c][r]+" ");
			}
			System.out.println();
		}
	}

}

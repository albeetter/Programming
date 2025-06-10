package src.javaActivity;

public class Method2 {

	public static void main(String[] args) 
	{
		int number=5;
		printPattern(number);
	}
	public static void printPattern(int numRows)
	{
		for (int i = 1; i <= numRows; i++)
		{
			for (int j = 1; j<= numRows - i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print(k==1|| k==2*i-1 ? "*" : "-");
			}
			System.out.println();
		}
	}
}

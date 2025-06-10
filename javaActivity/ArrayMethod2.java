package src.javaActivity;

public class ArrayMethod2 {

	public static void main(String[] args) 
	{
		int n = 4;
		char[] line = new char[2*n-1];
		printPattern(line, n);
	}
	public static void printPattern(char[] line, int n)
	{
		for (int i = 0; i < line.length; i++)
		{
			line[i] = ' ';
		}
		for (int i = 0; i < n; i++)
		{
			printLine(line, i, n);
		}
		for (int i = n - 2; i >= 0; i--)
		{
			printLine(line, i, n);
		}
	}
	
	public static void printLine(char[] line, int i, int n)
	{
		line[n - i - 1] = '$';
		if (i > 0)
		{
			line[n +  i - 1] = '#';
		}
		System.out.println(line);
		line[n - i -1] = ' ';
		if (i > 0)
		{
			line[n + i - 1] = ' ';
		}
	}
}

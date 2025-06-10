package src.javaActivity;

public class LoopSim2 {

	public static void main(String[] args) {
		
		int n = 8;
		int n2 = n;
		
		for (int i= 1; i <= n; i++) 
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n || j == 1 || j == n)
				{
					System.out.print("* ");
				}
				else if (i == 3 || i == n2-2)
				{
					if (j == 3 || j == n2-2)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

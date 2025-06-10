package src.javaActivity;

public class LoopsSim {

	public static void main(String[] args) {
		
		int num = 4;
		int row, col;
		int magic = 0, number = 0, wonder = 1;
		
		for (row = 1; row <= num; row++)
		{
			for (col = 1; col <= num; col++)
			{
				if (col == 1)
				{
					magic = row;
				}
				else if ((col%2) == 0)
				{
					magic = num*col - number;
				}
				else
				{
					magic += wonder;
				}
				System.out.print(magic + "\t");
			}
			System.out.println();
			number++;
			wonder += 2;
		}

	}

}

package src.javaActivity;

public class Array1 {

	public static void main(String[] args) 
	{
		int[] mysteryNum = new int[20];
		int ctr = 0, i, x;
		while(ctr < mysteryNum.length)
		{
			mysteryNum[ctr]=ctr+1;
			ctr++;
		}
		i=0;
		do
		{
			for(x = 1; x<=4; x++)
			{
				System.out.print(mysteryNum[i] + "\t");
				i++;
			}
			System.out.println();
		} while (i < mysteryNum.length);
	}
}

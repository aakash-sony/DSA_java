/*
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
     6 6 6 6 6 6
*/
public class Pattern04_NumTriangle02 {

	public static void main(String[] args)
	{
		for(int i = 0; i < 6; i++)  // row
		{
			for(int j = 0; j <= i; j++) // column
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}
}
//you can take user input as number of rows and column.
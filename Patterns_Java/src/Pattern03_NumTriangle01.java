/*
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     1 2 3 4 5 6
*/
public class Pattern03_NumTriangle01 {

	public static void main(String[] args)
	{
		for(int i = 0; i < 6; i++)  // row
		{
			for(int j = 0; j <= i; j++) // column
			{
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
//you can take user input as number of rows and column.
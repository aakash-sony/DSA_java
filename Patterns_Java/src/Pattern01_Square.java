/*
      * * * * *
      * * * * *
      * * * * *
      * * * * *
      * * * * *
*/

public class Pattern01_Square
{
    public static void main(String[] args)  
    {
		for(int i = 0; i < 5; i++)  // row
		{
			for(int j = 0; j < 5; j++) // column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
// you can take user input as number of rows and column.
/*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
*/
public class Pattern02_Triangle {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 6; i++)  // row
		{
			for(int j = 0; j <= i; j++) // column
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
//you can take user input as number of rows and column.
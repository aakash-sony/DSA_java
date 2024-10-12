/*
     * * * * * *
     * * * * * 
     * * * * 
     * * * 
     * * 
     * 
*/
public class Pattern05_ReverseTriangle {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 12; i++)  // row
		{
			for(int j = i; j < 12; j++) // column
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
//you can take user input as number of rows and column.
/*
        E 
        DE
        CDE
        BCDE
        ABCDE
*/
public class Pattern18 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 5;
        // Outer loop for rows
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j <= i; j++)  // column
            {
            	if(j <= i)
            	{
            	    System.out.print((char)(65 + rows-i+j-1));
            	}
               
            }
            System.out.println();
        }
    }
}

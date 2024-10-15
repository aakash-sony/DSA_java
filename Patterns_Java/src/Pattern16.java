/*
        A 
       ABA
      ABCBA
     ABCDCBA   
    ABCDEDCBA    
*/
public class Pattern16 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 5;
        // Outer loop for rows
        for(int i = 0; i < rows; i++)
        {
        	for(int space = 0; space < rows-i; space++)
        	{
        		System.out.print(" ");
        	}
            for(int j = 0; j < 2*i+1; j++)       // column
            {
              if(j <= i)
              {
            	 System.out.print((char)(65+j)); 
              }
              else
              {
            	  System.out.print((char)(65+(2*i-j)));
              }
            }
            System.out.println();
        }
    }
}

/*
        A
        AB  
        ABC 
        ABCD
        ABCDE 
*/
public class Pattern14 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 5;
        // Outer loop for rows
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)  // column
            {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}

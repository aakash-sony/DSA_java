/*
        A 
        BB
        CCC
        DDDD
        EEEEE
*/
public class Pattern17 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 5;
        // Outer loop for rows
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j <= i; j++)  // column
            {
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }
}

/*
        ABCDE 
        ABCD
        ABC
        AB
        A
*/
public class Pattern15 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 5;
        // Outer loop for rows
        for(int i = rows; i > 0; i--)
        {
            for(int j = 0; j < i; j++)  // column
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}

/*
        1             1
        2 3
        4 5 6 
        7 8 9 10 
*/
public class Pattern13 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 4;
        int a = 1;

        // Outer loop for rows
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)  // column
            {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}

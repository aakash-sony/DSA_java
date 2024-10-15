/*
        1             1
        1 2         2 1
        1 2 3     3 2 1
        1 2 3 4 4 3 2 1
*/
public class Pattern12 {

    public static void main(String[] args)
    {
        // Number of rows
        int rows = 4;

        // Outer loop for rows
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }

            for(int space = 1; space <= 2 * (rows - i); space++)
            {
                System.out.print("  ");  // Two spaces for consistent single-space separation
            }

            for(int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

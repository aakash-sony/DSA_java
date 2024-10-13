/*
        *      
       *** 
      *****
     *******
      *****
       ***
        *
 */
public class Pattern09_Diamond01 {

    public static void main(String[] args) {
      // upper half
        for (int i = 0; i < 4; i++) // rows
        {
            for (int space = 0; space < 4 - i; space++) // space
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half excluding the middle row
        for (int i = 2; i >= 0; i--) // rows
        {
            for (int space = 0; space < 4 - i; space++) // space
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

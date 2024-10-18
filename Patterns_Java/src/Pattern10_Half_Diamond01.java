/*
        *      
        ** 
        ***
        ****
        ***
        **
        *
 */
public class Pattern10_Half_Diamond01 {

    public static void main(String[] args) {
    	int rows = 4;
      // upper half
        for (int i = 0; i < rows; i++) // rows
        {
            for (int j = 0; j <= i ; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half excluding the middle row
        for (int i = 0; i < rows-1; i++) // rows
        {
            for (int j = 0; j < rows-1- i; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

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
      // upper half
        for (int i = 0; i < 4; i++) // rows
        {
            for (int j = 0; j <= i ; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half excluding the middle row
        for (int i = 0; i < 3; i++) // rows
        {
            for (int j = 0; j < 3 - i; j++) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

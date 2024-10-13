/*
     *******
      *****
       ***
        *
 */
public class Pattern08_Triangle03 {

	public static void main(String[] args) {
		for (int i = 4; i > 0; i--) //rows
		{
			for (int space = 0; space < 4 - i; space++) //space
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) //column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

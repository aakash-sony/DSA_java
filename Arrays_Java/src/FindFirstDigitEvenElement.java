import java.util.Arrays;

public class FindFirstDigitEvenElement {

	public static void main(String[] args) {
		int arr[] = {4,23,43,54,32,43};
		int temp[] = new int[arr.length];
		int j = 0;
		for(int num: arr)
		{
			int firstDigit = Integer.parseInt(Integer.toString(num).substring(0,1));
			if(firstDigit % 2 == 0)
			{
				temp[j++] = num;
			}
		}
		int result[] = Arrays.copyOf(temp, j);
		System.out.println(Arrays.toString(result));
	}
}

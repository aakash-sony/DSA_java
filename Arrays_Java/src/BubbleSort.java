//Bubble Sorting
/*
 * It will hold the index and start comparing with itself
 * when it will find 1st element is greater than alternate element immediate swap
    it means in first round max value push to the last.and like that again and again
 */
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 22, 1, 56, 1, 5, 43, 3 };
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length-1-i; j++)
			{
				if (arr[j] > arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting Array: "+Arrays.toString(arr));
	}
}

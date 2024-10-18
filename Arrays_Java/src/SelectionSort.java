
//Hint ---> Find minimum and immediate swap

import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args)
	{
		int arr[] = { 3, 4, 54, 23, 1, 34, 90 };
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) 
		{
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[min] > arr[j]) 
				{
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println("After sorting: "+Arrays.toString(arr));

	}

}

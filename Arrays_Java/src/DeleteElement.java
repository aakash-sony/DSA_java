import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 5, 5, 4, 3, 89, 34};
		System.out.println("Original Array: "+Arrays.toString(arr));
		int deletedElement = 3;
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==deletedElement)
			{
				count++;
				
			}
		}
		int newArr[] = new int[arr.length-count];
		int index = 0;
		for(int i=0; i < arr.length;i++)
		{
			if(arr[i] != deletedElement)
			{
				newArr[index++] = arr[i];
			}
		}
		System.out.println("Final Array: "+Arrays.toString(newArr));
	}

}

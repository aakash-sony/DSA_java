import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 78, 44, 33, 33, 4, 3 };
		System.out.println(Arrays.toString(arr));
		int len = arr.length;
		reverseArray(arr);
		usingRecursion(arr, 0, len - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void reverseArray(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}
	}

	static void usingRecursion(int arr[], int start, int end) {
		if (start > end) {
			return;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		usingRecursion(arr, start + 1, end - 1);
	}
}

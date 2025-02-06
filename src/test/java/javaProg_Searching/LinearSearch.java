package javaProg_Searching;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 26;
		int ans = linearSearch(a, target);
		System.out.print(ans);

	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				System.out.print("Element found at : ");
				return index;
			}
		}
		System.out.print("Element not found in array so returning : ");
		return -1;
	}

}

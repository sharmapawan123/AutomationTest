package javaProg_Searching;

import java.util.Arrays;

public class SearchingIn2DArray {

	public static void main(String[] args) {

		int twodarry[][] = { { 1, 2, 3, 4, 5, }, { 22, 24 }, { 33, 44, 56 } };
		int target = 44;
		int[] a = search(twodarry, target);
		System.out.print(Arrays.toString(a));

	}

	public static int[] search(int a[][], int value) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == value) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}

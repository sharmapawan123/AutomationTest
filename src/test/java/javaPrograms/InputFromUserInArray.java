package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUserInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		// Take the input from user
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		// print the array
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Print the even number only
		System.out.println("Print the even number only");
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is even ");
			}

			else {
				if (arr[i] % 2 != 0) {
					System.out.println(arr[i] + " is odd ");
				}
			}
		}

		// print the array using for-each loop
		System.out.println("print the array using for-each loop");
		for (int num : arr) {
			System.out.println(num);
		}

		// Convert the int array in the String
		System.out.print(Arrays.toString(arr));

	}

}

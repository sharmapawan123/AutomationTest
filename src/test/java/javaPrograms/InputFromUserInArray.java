package javaPrograms;

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

	}

}

package javaPrograms;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// Syntax
		// int[][] arr = new int[3][]
		/*
		 * raw can not be blank , but we can make column blank, in second bracket
		 * int[3][] i.e raw is mandatory , column is not mandatory
		 */

		// another syntax
		/*
		 * int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };
		 */

		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

}

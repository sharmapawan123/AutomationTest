package arrayListPrograms;

import java.util.Arrays;

public class SwapInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Before Swap  "+Arrays.toString(arr));
		swap(arr, 0,4);
		System.out.println("After Swap   "+Arrays.toString(arr));
		
	}
	
	public static void swap(int[] a, int index1, int index2 )
	{
		int temp = a[index1];
		a[index1]=a[index2];
		a[index2] = temp;
	}

}

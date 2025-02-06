package javaProg_Searching;

public class SearchTheMinmumValue {

	public static void main(String[] args) {
		int i = 0;
		int a[] = { 1, 2, 3, 4, 5, 6, 13, 14, 15,-1 };
		int value = 0;
		for (i = 1; i < a.length-1; i++)
			value = a[0];
		{

			if (a[i] < value) {
				value = a[i];
			}
		}
		System.out.print(value);
	}

}

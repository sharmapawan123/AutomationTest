package javaProg_Searching;

public class LinearSearchWithBooleanReturnType {

	public static void main(String[] args) {

		int a[] = { 11, 12, 13, 14, 15, 16, 1, 9 };
		int target = 14;
		boolean ans = searching(a, target);
		System.out.print(ans);

	}

	public static boolean searching(int arr[], int element)
	{
		for(int data: arr )
		{
			if(data == element)
			{
				return true;
			}
		}
		return false;
	}

}

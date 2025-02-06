package javaProg_Searching;

public class LinearSearchReturnItem {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7,8,9};
		int target = 19;
		int ans = linearSearch(a,target);
		System.out.println(ans);
		}
	
	public static int linearSearch(int arr[], int ele)
	{
		
		for(int data:arr)
		{
			if(data == ele)
			{
				return data;
			}
		}
		System.out.print("No data Found ");
		return -1;
		
	}
	

}

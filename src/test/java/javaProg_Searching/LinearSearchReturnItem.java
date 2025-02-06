package javaProg_Searching;

public class LinearSearchReturnItem {

	public static void main(String[] args) {
	
		int a[] = {11,12,13,14,15,16,17,18,19};
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

import java.util.Scanner;
class BinarySearch
{
	public static int calBSearch(int nums[],int key,int l,int h)
	{
		if(h>=l)
		{
			int mid=(h+l)/2;
			
			if(nums[mid]==key)
			{
				return mid;
			}
			if(nums[mid]>key)
			{
				return calBSearch(nums,key,l,mid-1);
			}
			else
			{
				return calBSearch(nums,key,mid+1,h);
			}
		}
		return -1;
	}
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		int [] nums={1,5,4,14,20,24,30,32,45};
		int key=sc.nextInt();
		int len=nums.length;
		int res=calBSearch(nums,key,0,len-1);
		if(res==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found");
		
	}
}
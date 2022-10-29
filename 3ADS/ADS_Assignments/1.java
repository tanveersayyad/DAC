/*5. Write a program to implement a recursive Java palindrome checker */

class SeriesOfNum
{
	static int sum=0;
	static boolean printSeries(int num)
	{
		
		if(num==0)
		{
			return;
		}
		
		printSeries(num-1);
		System.out.print(sum+" ");
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Last Number Of Series  :");
		String []str=sc.nextLine();
		for(int i=str.length;i>0;i--)
			rev
		printSeries(str[i]);
	}
}
/* 2. Write a program to sum a series of numbers with Java recursion */
import java.util.*;
class SeriesOfSum
{
	static int sum=0;
	static void printSeries(int num)
	{
		
		if(num==0)
		{
			return;
		}
		sum=sum+num;
		printSeries(num-1);
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Last Number Of Series  :");
		int num=sc.nextInt();
		
		printSeries(num);
		System.out.print(sum+" ");
	}
}
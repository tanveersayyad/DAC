//1. Write a program to print a series of numbers with recursive Java methods

import java.util.Scanner;

class SeriesOfNum
{
	static int initnum=0;
	static void printSeries(int num)
	{
		
		if(num==0)
		{
			System.out.print(num+" ");
			return;
		}
		
		printSeries(num-1);
		System.out.print(num+" ");
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Last Number Of Series  :");
		int num=sc.nextInt();
		
		printSeries(num);
	}
}
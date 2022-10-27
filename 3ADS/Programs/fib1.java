class fib1
{
	static int FibCal(int n)
	{
		if(n==0||n==1)
			return 1;
		
		return FibCal(n-1)+FibCal(n-2);
	}
	
	public static void main(String args[])
	{
		int size=50;
		for(int i=0;i<=size;i++)
		{
			System.out.print(FibCal(i)+" ");
		}
	}
}
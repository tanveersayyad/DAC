class Recursion1
{
	static int Cal(int n)
	{
		if(n==0)
			return 1;
		
		return n*Cal(n-1);
	}
	
	public static void main(String args[])
	{
		System.out.println(Cal(6));
	}
}
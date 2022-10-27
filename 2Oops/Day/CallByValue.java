class CallByValue
{	
	CallByValue(int i,int j)
	{
		i++;
		j++;
	}
	int sum(int i,int j)
	{
		int sum=i+j;
	}
	void mul(CallByValue c2)
	{
		c2.
	}
	public static void main(String [] args)
	{
		CallByValue c1=new CallByValue();
		int a=c1.sum(10,20);
		System.out.println(a);
		CallByValue c2=new CallByValue(20,50);
		int a=c1.sum(10,20);
		System.out.println();
	}
}

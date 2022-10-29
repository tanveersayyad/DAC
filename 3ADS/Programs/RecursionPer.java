class RecursionPer
{
	public static void display(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char str1=str.charAt(i);
			String str2=str.substring(0,i)+str.substring(i+1);
			display(str2,res+str1);
		}
	}
	
	public static void main(String args[])
	{
		display("ABC","");
	}
}
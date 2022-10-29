import java.util.Scanner;

class StringInitial 
{
	public static void calInitial(String strarr[])
	{
		int len=strarr.length;
		System.out.print("Initial Of String : ");
		for(int i=0;i<len;i++)
		{
			
			char res=strarr[i].charAt(0);
			String r=Character.toString(res);
			String res1=r.toUpperCase();
			System.out.print(res1+" ");
			
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String To Convert Into Intial : ");
		String str=sc.nextLine();
		
		String str1=str.replaceAll("^ +| +$|( )+", "$1");
		str1=str1.replaceAll("[^a-zA-Z\\s]","");
		String[] strarr=null;
		
		strarr=str1.split(" ");
		
		calInitial(strarr);
		
		
		
	}
}
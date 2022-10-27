import java.util.*;
class sumwhile
{
	public static void main(String agrs[])
	{
  	int n,sum=0,i=0;
	while(sum>=0)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :- ");
		n=sc.nextInt();
	
			while(i<=n)
			{
				sum=sum+i;
				i++;
			}
	
		System.out.println("Sum Of Natural Number :- "+sum);
		
		continue;
	}
	
	}
	
}
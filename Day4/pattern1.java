import java.util.*;
class pattern1
{
	public static void main(String agrs[])
	{
		int num=0,i,j;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number :- ");
		num=sc.nextInt();
		
		for(i=num;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			
			System.out.println();
		}
	}
}
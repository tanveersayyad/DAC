import java.util.*;
class switchexample
{
	public static void main(String args[])
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		float a =sc.nextFloat();
		int ch=0;
		String result="";
		if(a>=85)
		{
			ch=1;
		}
		if(a<85&&a>=60)
		{
			ch=2;
		}
		if(a<60&&a>=50)
		{
			ch=3;
		}
		if(a<50&&a>=40)
		{
			ch=4;
		}
		if(a<40)
		{
			ch=5;
		}
		switch(ch)
		{
			case 1: result="Distintion Class";
					break;
			case 2: result="First Class";
					break;
			case 3: result="Second Class";
					break;
			case 4: result="Third Class";
					break;
			case 5: result="Fail Class";
					break;		
		}
		System.out.println("Result is : "+result);

	}
}
		
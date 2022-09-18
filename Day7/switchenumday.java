import java.util.*;
enum Day={monday,tuesday,wednesday,thursday,friday,satarday,sunday}
class switchenumday
{
	public static void main(String args[])
	{
		/*System.out.println("Enter the Charachter : ");
		Scanner sc=new Scanner(System.in);
		String a =sc.next();*/
		String result="";
		Day d;
		switch(d)
		{
			case 1: result="a is vowel";
					break;
			case 2 : result="e is vowel";
					break;
			case 3 : result="i is vowel";
					break;
			case 4 : result="o is vowel";
					break;
			case 5 : result="u is vowel";
					break;	
			
			default: result= "consonant";
		}
		System.out.println("Result is : "+result);

	}
}
		
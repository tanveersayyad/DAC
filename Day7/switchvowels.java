import java.util.*;
class switchvowels
{
	public static void main(String args[])
	{
		System.out.println("Enter the Charachter : ");
		Scanner sc=new Scanner(System.in);
		String a =sc.next();
		String result="";
	
		switch(a)
		{
			case ("a"|| "A") : result="a is vowel";
					break;
			case ("e"||"E") : result="e is vowel";
					break;
			case "i" : result="i is vowel";
					break;
			case "o" : result="o is vowel";
					break;
			case "u" : result="u is vowel";
					break;	
			
			default: result= "consonant";
		}
		System.out.println("Result is : "+result);

	}
}
		

import java.util.*;

abstract class Account
{
	int accountNumber;
	double balance;
	String holderName;
	
	
}

class SavingsAccount extends Account
{
	double interestRate;
	SavingsAccount(){}
	SavingsAccount(int accountNumber,String holderName,double balance,double interestRate)
	{
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
		this.interestRate=interestRate;
	}

	public double calculateYearlyInterest()
	{
		return (balance/100)*interestRate;
	}
	public String toString()
	{
		return "Saving Acoount No. = " + accountNumber + ", Holder Name = "+holderName + ", Balance = " +balance+ "\n";
	}
	public int hashCode()
	{

		return (int)('s');
	}
	
	public static void display(List<SavingsAccount> mylist)
	{
		Iterator<SavingsAccount> it = mylist.iterator();
		while(it.hasNext())
		{
			SavingsAccount s = it.next();
			System.out.println(s+"Yearly Interest : "+s.calculateYearlyInterest()+"\n");
			//System.out.print("Yearly Interest : "+s.calculateYearlyInterest()+"\n");
		}
	}
}
class CurrentAccount extends Account
{
	CurrentAccount(){}
	CurrentAccount(int accountNumber,String holderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	public String toString()
	{
		return "Current Acoount No. = " + accountNumber + ", Holder Name = "+holderName + ", Balance = " +balance+ "\n";
	}
	public int hashCode()
	{

		return (int)('c');
	}
	public static void display(List<CurrentAccount> mylist)
	{
		Iterator<CurrentAccount> it = mylist.iterator();
		while(it.hasNext())
		{
			CurrentAccount s = it.next();
			System.out.println(s);
		}
	}

}

class Manager

{
	public static void main(String args[])
	{
		
		
		List <SavingsAccount> salist=new ArrayList<>();
		
		salist.add(new SavingsAccount(123456,"Ramesh",12003.5,5.0));
		salist.add(new SavingsAccount(23455,"Suresh",212003.5,5.0));
		
		List <CurrentAccount> calist=new ArrayList<>();
		calist.add(new CurrentAccount(456987,"Ram",120203.5));
		calist.add(new CurrentAccount(15022,"Sham",421034.5));
		calist.add(new CurrentAccount(12365,"Mahesh",1232003.0));
		
		/*System.out.println(salist);
		System.out.println(calist);
		System.out.println(salist.hashCode());
		System.out.println(calist.hashCode());*/
		
		SavingsAccount.display(salist);
		CurrentAccount.display(calist);
		

		
		
	}
}

/*
OUTPUT :

D:\Tanveer_DAC\Dac_Modules\4Oops\OOPJ_ASSIGNMENT\OOPJAssignment3>javac Manager.java

D:\Tanveer_DAC\Dac_Modules\4Oops\OOPJ_ASSIGNMENT\OOPJAssignment3>java Manager
Saving Acoount No. = 123456, Holder Name = Ramesh, Balance = 12003.5
Yearly Interest : 600.175

Saving Acoount No. = 23455, Holder Name = Suresh, Balance = 212003.5
Yearly Interest : 10600.175

Current Acoount No. = 456987, Holder Name = Ram, Balance = 120203.5

Current Acoount No. = 15022, Holder Name = Sham, Balance = 421034.5

Current Acoount No. = 12365, Holder Name = Mahesh, Balance = 1232003.0

*/
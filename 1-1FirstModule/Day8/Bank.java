import java.util.Scanner;

public class Bank {
    String name;
    String Acc;
    String Email;
    String Gen;
    String Acc_type;
    long balance;
    String Phn;

    Scanner sc= new Scanner(System.in);
    // create a new account:
    public void openAcount() {
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.print("Enter your account number:");
        Acc = sc.nextLine();
        System.out.print("Enter your Email address:");
        Email = sc.nextLine();
        System.out.print("Enter your Gender");
         Gen = sc.nextLine();
        System.out.print("Enter your account  type");
         Acc_type = sc.nextLine();
        System.out.print("Enter your phone number:");
         Phn = sc.nextLine();
        System.out.print("Enter Amount to deposit");
         balance = sc.nextLong();
    }
    // Show Bank details:
    public void showDetails()
    {
        System.out.println("Account holder: "+ name);
        System.out.println("Account number: "+ Acc);
        System.out.println("Account type: "+ Acc_type);
        System.out.println("Account Balance: "+ balance);
        System.out.println("Email: "+ Email);
        System.out.println("Phone number: "+ Phn);
        System.out.println("Gender: "+ Gen);
    }
    //Deposite an Amount:
    public void deposite()
    {
        long Amt;
        System.out.println("Enter the amount to deposit:");
         Amt= sc.nextLong();
         balance= Amt + balance;
	 System.out.println("your balance after diposite is: "+balance);
    }
    //Withdraw an amount:
    public void withdraw( )
    {
        System.out.println("Enter the amount to Withdraw:");
        long amt = sc.nextLong();
        if(balance >= amt){
           balance= balance - amt;
            System.out.println("your balance after withdrawal is: "+balance);
        }
        else{
            System.out.println("your balance is less than "+amt+"\t\n Transaction Failed...");
        }

    }

	public void show_bal()
	{
		System.out.println("Availabe Balance is :"+balance);	
	}

    public  static void  main(String[] args){
        Scanner no = new Scanner(System.in);
        System.out.println("Welcome to the CMD Bank!!!");

        Bank c1= new Bank();
        int ch;
        do {
            System.out.println("1. to enter details.\n 2. show details.\n 3. for deposit.\n 4.for withdrawal\n 5.Show Balance \n 6. for exit");
            System.out.println("Enter your choice: ");
            ch = no.nextInt();

            switch (ch) {
                case 1: {
                    c1.openAcount();
                    break;
                }
                case 2: {
                    c1.showDetails();
		 break;
                }
                case 3: {
                    c1.deposite();
		 break;
                }
                case 4: {
                    c1.withdraw();
		 break;
                }
                 case 5: {
                    c1.show_bal();
		 break;
                }
            }
        }
            while(ch<6);








    }
}

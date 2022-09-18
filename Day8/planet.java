import java.util.Scanner;

public class Bank {


public void showDetails()
    {
        System.out.println("Planet Name: "+ name);
        System.out.println("colour: "+ Acc);
        System.out.println("Gravity: "+ Acc_type);
        System.out.println("Number of Moons: "+ balance);
        System.out.println("Distance : "+ Email);
        System.out.println("Phone number: "+ Phn);
        System.out.println("Gender: "+ Gen);
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

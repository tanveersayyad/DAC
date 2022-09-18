import java.util.Scanner;

public class planet1 
{
String name,color,rings;
double gravity;
int moon;

void add(String n,String c,int m,double g,String r){
	name=n;
	color=c;
	moon=m;
	gravity=g;
	rings=r;
}
void display(){

	System.out.println("Planet Name: "+name);
        System.out.println("Colour: "+color);
        System.out.println("Number of Moons: "+moon);
        System.out.println("Gravity of "+name+" : "+gravity+" m/s^2");
        System.out.println("Rings Available:"+rings);
}


public  static void  main(String[] args){
	Scanner sc = new Scanner(System.in);
	int ch;
do
{
	System.out.println(" 1. Mercury.\n 2. Venus.\n 3. Earth.\n 4. Mars.\n 5. Jupiter. \n 6. Saturn. \n 7. Uranus. \n 8. Neptune. \n 9. Exit.");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            System.out.println("=========================================");

switch(ch){
	case 1:{
	planet1 p1=new planet1();
	p1.add("Mercury","Gray",0,3.7 ,"NO");
	p1.display();
	break;
	}
	case 2:{
	planet1 p2=new planet1();
	p2.add("Venus","Pale Yellow",0,8.9 ,"NO");
	p2.display();
	break;
	}
	case 3:{
	planet1 p3=new planet1();
	p3.add("Earth","Blue with White Clouds",1,9.8,"NO");
	p3.display();
	break;
	}
	case 4:{
	planet1 p4=new planet1();
	p4.add("Mars","Reddish Brown",2,3.7,"NO");
	p4.display();
	break;
	}
	case 5:{
	planet1 p5=new planet1();
	p5.add("Jupitor","Orange With White Bands",63,23.1,"YES");
	p5.display();
	break;
	}
	case 6:{
	planet1 p6=new planet1();
	p6.add("Saturn","Pale Gold",62,9.0,"YES");
	p6.display();
	break;
	}
	case 7:{
	planet1 p7=new planet1();
	p7.add("Uranus","Pale Blue",27,8.7,"YES");
	p7.display();
	break;
	}
	case 8:{
	planet1 p8=new planet1();
	p8.add("Naptune","Pale Blue",13,11.0,"YES");
	p8.display();
	break;
	}
	case 9:{
	System.out.println("Successfully Exit...");
	}




}
System.out.println("=========================================");
}
while(ch<9);
}
}

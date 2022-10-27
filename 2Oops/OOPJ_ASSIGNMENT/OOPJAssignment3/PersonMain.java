
import java.util.*;

class Person
{
	int age;
	double weight;
	double height;
	String dateOfBirth;
	String address;
	String name;
}
class Student extends Person
{
	
	int roll;
	String listOfSubjects;
	double marks; 
	
	Student(){}
	Student(String name,int age,double weight,double height,String dateOfBirth,String address,int roll,double marks,String listOfSubjects)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
		this.roll=roll;
		this.marks=marks;
		this.listOfSubjects=listOfSubjects;
	}
	void calculateGrade()
	{
		if(marks>=75)
		{
			System.out.println("Grade A");
		}
		else
			if(marks>=60){
			System.out.println("Grade B");
		}
		else
			if(marks>=50){
			System.out.println("Grade C");
		}
		else
			if(marks>=35){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Fail");
		}
	}
	public String toString()
	{
		return ("Student Name = " + name + ", Age = "+age+", Weight ="+weight+ ", Height = " +height+", Date Of Birth ="+dateOfBirth+", Address ="+address+", Roll NO. ="+roll+", Marks ="+marks+", List Of Subjects ="+listOfSubjects+ "\n");
	}
	/* public int hashCode()
	{

		return (int)(weight*height);
	} */
	
	
}

class Employee extends Person
{
	double salary;
	String dateOfJoining;
	double experience;
	
}
class Technician extends Employee
{
	Technician(){}
	Technician(String name,int age,double weight,double height,String dateOfBirth,String address,double salary,String dateOfJoining,double experience)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
		this.experience=experience;
	}
	public String toString()
	{
		return "Technician Name = " + name + ", Age = "+age+", Weight ="+weight+ ", Height = " +height+", Date Of Birth ="+dateOfBirth+", Address ="+address+", Salary ="+salary+", Date Of Joining"+dateOfJoining+", Experience ="+experience+"\n";
	}
	/* public int hashCode()
	{

		return (int)(weight*height);
	} */
	
	
}
class Professor extends Employee implements Comparable<Professor>
{
	String courses;
	String listOfAdvisee;
	Professor(){}
	Professor(String name,int age,double weight,double height,String dateOfBirth,String address,double salary,String dateOfJoining,double experience,String courses)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
		this.experience=experience;
		this.courses=courses;
	}
	public String toString()
	{
		return "Professor Name = " + name + ", Age = "+age+", Weight ="+weight+ ", Height = " +height+", Date Of Birth ="+dateOfBirth+", Address ="+address+", Salary ="+salary+", Date Of Joining"+dateOfJoining+", Experience ="+experience+", Courses ="+courses+"\n";	
	}
	/* public int hashCode()
	{

		return (int)(weight*height);
	} */
	
	

	public int compareTo(Professor p)
	{
		
		if(this.age > p.age)
			return 1;
		if(this.age < p.age)
			return -1;
		
		return 0;
	}
	
}

public class PersonMain
{
	public static void display(List<Student> mylist)
	{
		Iterator<Student> it = mylist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			
			System.out.println("");
			System.out.print(s);
			s.calculateGrade();
			System.out.println("");
		}
		
		/* for(Student x: mylist)
		{
			System.out.print(x);

		} */
	}
	public static void display(List<Technician> mylist)
	{
		Iterator<Technician> it = mylist.iterator();
		while(it.hasNext())
		{
			Technician s = it.next();
			System.out.println(s+"\n");
			
		}
	}
	public static void display(List<Professor> mylist)
	{
		Iterator<Professor> it = mylist.iterator();
		while(it.hasNext())
		{
			Professor s = it.next();
			System.out.println(s);
			
		}
	}
	
	public static void main(String args[])
	{
		ArrayList <Student> stdlist=new ArrayList<Student>();
		
		stdlist.add(new Student("Ramesh",22,45.35,4.5,"10/12/2000","Mumbai",1,78.05,"Science,Math,English"));
		stdlist.add(new Student("Suresh",22,48.25,4.6,"01/10/2000","Mumbai",2,68.25,"Science,Math,English"));
		stdlist.add(new Student("Suraj",21,35.25,4.2,"25/03/2001","Mumbai",3,85.55,"Science,Math,English"));
		System.out.println("***STUDENTS DETAILS***");
		display(stdlist);
		
		ArrayList <Technician> techlist=new ArrayList<Technician>();
		
		techlist.add(new Technician("Kamlesh",25,48.26,5.6,"15/02/1997","Nagpur",17808.25,"01/01/2019",3.5));
		techlist.add(new Technician("Sham",28,54.30,5.8,"13/05/1994","Mumbai",18500.05,"14/07/2017",5.0));
		techlist.add(new Technician("Ram",30,65.35,6.2,"01/12/1992","Pune",21000.00,"15/03/2014",8.2));
		System.out.println("***TECHNICIAN DETAILS***");
		display(techlist);
		
		List <Professor> proflist=new ArrayList<Professor>();
		
		Professor p1=new Professor("Anil",45,48.26,5.6,"15/03/1997","Kanpur",17808.25,"01/01/2019",3.5,"Java Programming");
		Professor p2=new Professor("Aditya",28,54.30,5.8,"13/06/1994","Patna",18500.05,"14/07/2017",5.0,"Data Stucture");
		Professor p3=new Professor("Sagar",30,65.35,6.2,"01/11/1992","Delhi",21000.00,"15/03/2014",8.2,"Operating System");
		proflist.add(p1);
		proflist.add(p2);
		proflist.add(p3);
		System.out.println("***PROFESSOR DETAILS***");
		display(proflist);
		
		proflist.remove(p3);
		
		System.out.println("***AFTER REMOVING PROFESSOR DETAILS***");
		display(proflist);
		
		Collections.sort(proflist);
		display(proflist);
		
	}
}

/*
OUTPUT :
D:\Tanveer_DAC\Dac_Modules\4Oops\OOPJ_ASSIGNMENT\OOPJAssignment3>javac PersonMain.java

D:\Tanveer_DAC\Dac_Modules\4Oops\OOPJ_ASSIGNMENT\OOPJAssignment3>java PersonMain
***STUDENTS DETAILS***

Student Name = Ramesh, Age = 22, Weight =45.35, Height = 4.5, Date Of Birth =10/12/2000, Address =Mumbai, Roll NO. =1, Marks =78.05, List Of Subjects =Science,Math,English
Grade A


Student Name = Suresh, Age = 22, Weight =48.25, Height = 4.6, Date Of Birth =01/10/2000, Address =Mumbai, Roll NO. =2, Marks =68.25, List Of Subjects =Science,Math,English
Grade B


Student Name = Suraj, Age = 21, Weight =35.25, Height = 4.2, Date Of Birth =25/03/2001, Address =Mumbai, Roll NO. =3, Marks =85.55, List Of Subjects =Science,Math,English
Grade A

***TECHNICIAN DETAILS***
Technician Name = Kamlesh, Age = 25, Weight =48.26, Height = 5.6, Date Of Birth =15/02/1997, Address =Nagpur, Salary =17808.25, Date Of Joining01/01/2019, Experience =3.5


Technician Name = Sham, Age = 28, Weight =54.3, Height = 5.8, Date Of Birth =13/05/1994, Address =Mumbai, Salary =18500.05, Date Of Joining14/07/2017, Experience =5.0


Technician Name = Ram, Age = 30, Weight =65.35, Height = 6.2, Date Of Birth =01/12/1992, Address =Pune, Salary =21000.0, Date Of Joining15/03/2014, Experience =8.2


***PROFESSOR DETAILS***
Professor Name = Anil, Age = 25, Weight =48.26, Height = 5.6, Date Of Birth =15/03/1997, Address =Kanpur, Salary =17808.25, Date Of Joining01/01/2019, Experience =3.5, Courses =Java Programming

Professor Name = Aditya, Age = 28, Weight =54.3, Height = 5.8, Date Of Birth =13/06/1994, Address =Patna, Salary =18500.05, Date Of Joining14/07/2017, Experience =5.0, Courses =Data Stucture

Professor Name = Sagar, Age = 30, Weight =65.35, Height = 6.2, Date Of Birth =01/11/1992, Address =Delhi, Salary =21000.0, Date Of Joining15/03/2014, Experience =8.2, Courses =Operating System
*/
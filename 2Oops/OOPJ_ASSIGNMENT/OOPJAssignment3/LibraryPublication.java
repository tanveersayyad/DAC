/*1. Create an abstract class "Publication" with data members 'noOfPages', 'price', 'publisherName' etc. with 
their accessor/modifier functions. Now create two sub-classes "Book" and "Journal". Create a class 
Library that contains a list of Publications. Write a main() function and create three Books and two 
Journals, add them to library and print the details of all publications.*/

import java.util.*;
abstract class Publication
{
	double noOfPages;
	double price;
	String publisherName;
	abstract void details();
}

class Book extends Publication
{
	String name;
	Book(){}
	Book(String name,int noOfPages,double price,String publisher)
	{
		this.name=name;
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisherName=publisherName;
	}
	void details()
	{
		System.out.println("Name of Book : "+name);
		System.out.println("Name of noOfPages : "+noOfPages);
		System.out.println("Name of price : "+price);
		System.out.println("Name of Publisher Name : "+name);
	}
}
class Journal extends Publication
{
	String name;
	Journal(){}
	Journal(String name,int noOfPages,double price,String publisher)
	{
		this.name=name;
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisherName=publisherName;
	}
	void details()
	{
		System.out.println("Name of Journal : "+name);
		System.out.println("Name of noOfPages : "+noOfPages);
		System.out.println("Name of price : "+price);
		System.out.println("Name of Publisher Name : "+name);
	}
}
class LibraryPublication
{
	String listOfPublications;
	public static void main(String args[])
	{
		Publication b1=new Book("Clean Code",464,1200,"Prentice Hall");
		Publication b2=new Book("Design Patterns",416,6000,"Addison-Wesley Professional");
		Publication b3=new Book("The Pragmatic Programmer",352,3995,"Addison-Wesley Professional");
		
		Publication j1=new Journal("Java 8 Programming",1055,720,"Dreamtech Press");
		Publication j2=new Journal("Introduction to Algorithms",1312,2160,"Prentice Hall");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Books");
		System.out.println("2. Journals");
		System.out.println("Enter Your choice : ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1 : 
			{
				b1.details();
			}
		}
		
	}
}
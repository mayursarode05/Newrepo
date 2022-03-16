package mayur;

import java.util.Scanner;

public class Employe 
{
	Scanner s=new Scanner(System.in);
	String n;
	int b,c;
	
	void info()
	{
		System.out.println("Enter your name =");
		n=s.next();	
		System.out.println("Enter your age =");
		 b=s.nextInt();
		System.out.println("Enter your salary =");
		 c=s.nextInt();
	}
	void display()
	{
		System.out.println("Name ="+n);
		System.out.println("Age ="+b);
		System.out.println("Salary ="+c);
	}
	
	
	public static void main(String[] args) 
	{
      Employe e=new Employe();
      e.info();
      e.display();
	}

}

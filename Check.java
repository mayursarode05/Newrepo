package mayur;
import java.util.Scanner;
public class Check 
{
	Scanner s=new Scanner(System.in);
	int a;
	String result;
	void add()
	{
		System.out.println("Check weather the number is positive or not");
		System.out.println("Enter the number =");
		a=s.nextInt();
		result=a>0?"Number is positive":"Number is negative";
		System.out.println(result);
		
	}
	public static void main(String Args[])
	{
	Check c=new Check();
	c.add();
	}
}





package in.ineuron.interfacePractise;

import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();
}
class MyCalculator1 implements Calculator
{
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number to add:");
		int a=sc.nextInt();
		System.out.println("Enter second number to add:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number to add:");
		int a=sc.nextInt();
		System.out.println("Enter second number to add:");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println(c);
	}
}
class MyCalculator2 implements Calculator
{
	public void add()
	{
		
		int a=10;
		
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{

		int a=10;
		
		int b=20;
		
		
		int c=a-b;
		System.out.println(c);
	}
}

class Cal
{
	public void permit(Calculator c)
	{
		c.add();
		System.out.println();
		c.sub();
	}
}












public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator1 c1 = new MyCalculator1();
		MyCalculator2 c2 = new MyCalculator2();
		
		Cal c3 = new Cal();
		c3.permit(c1);
		c3.permit(c2);
	}

}

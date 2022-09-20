package in.ineuron.interfacePractise;


interface cal1
{
	void add(int a ,int b);
}
interface cal2
{
	int sub(int a , int b);
	
}


//a class can implement multiple interfaces
class MyCal implements cal1,cal2
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
				
	}
	
	public int sub(int a ,int b)
	{
		int c =a-b;
		return c;
	}
}
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCal c = new MyCal();
		c.add(20, 30);
		System.out.println(c.sub(20, 3));

	}

}

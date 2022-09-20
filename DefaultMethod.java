package in.ineuron.interfacePractise;


//Features of java 8
interface Demo
{
	void disp();
	default void show()//default acts as both differentiating word  in interface
	{
		System.out.println("in show method of default ");
	}
	static void get()
	{
		System.out.println("in static method of interface");
	}
	default void set()
	{
		shocker();// scope is limited to interface only
	}
	
	//java 9 feature
	private void shocker()
	{
		System.out.println("I am private methdod of interface");
	}
}
class Demo1 implements Demo
{
	public void disp()
	{
		System.out.println("implementing dispaly method of interface");
	}
	
	public void show()
	{
		System.out.println("overridng the show method");
	}
}
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo1();
		d.disp();
		d.show();
		Demo.get();

	}

}

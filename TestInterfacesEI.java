package in.ineuron.interfacePractise;


interface C
{
	void add();
}

class MyCa
{
	void sub()
	{
		int a=20;
		int b=2;
		int c=a-b;
		System.out.println(c);
	}
}
class MainCalc extends MyCa implements C
{
	public void add()
	{
		int a=20;
		int b=12;
		int c=a+b;
		System.out.println(c);
	}
}
public class TestInterfacesEI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainCalc m = new MainCalc();
		m.add();
		m.sub();
	}

}

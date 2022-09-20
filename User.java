package in.ineuron.interfacePractise;

interface Stationery{
	int quantity=1;
}
class Pen implements Stationery{
	String color="Green";
}
public class User {
	public static void main(String[] args) {
		Stationery obj=new Pen();   
		//System.out.println(obj.color);  //error
	}
}

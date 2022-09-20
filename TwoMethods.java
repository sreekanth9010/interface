package in.ineuron.interfacePractise;


interface HeadPhones{
	default void displayHP() {
		System.out.println("HeadPhones Display");
	}
}
interface EarPhones{
	default void displayEP() {
		System.out.println("EarPhones Display");
	}

}
interface Electronics extends HeadPhones, EarPhones{
	default void bill() {
		System.out.println("Billing");
	}
}







public class TwoMethods implements Electronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoMethods obj=new TwoMethods();
		obj.displayEP();
		obj.displayHP();
		obj.bill();
		
	}

}

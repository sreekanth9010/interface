package in.ineuron.interfacePractise;


interface Student
{
	int TOTAL_MAXIMUM_MARKS=400;
	void calcPercentage();
}

class Intern implements Student
{
	 
	private int marksSecured;
	private int projectMarks;
	
	
	//constructor
	public Intern(int marksSecured, int projectMarks) {
		super();
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	
	//abstract method implementation
	public void calcPercentage()
	{
		float
		total=(projectMarks+marksSecured);
	
		if(total<=TOTAL_MAXIMUM_MARKS)
		{
			float percentage=(total/TOTAL_MAXIMUM_MARKS)*(100);
			System.out.println("The total aggregate percentage secured by the intern is  :"+percentage   );
		}
		else
		{
			System.out.println("Please enter correct marks..!");
		}
	}
	
}

class Trainee implements Student
{
	private int marksSecured;
	
	//constructor
	public Trainee(int marksSecured) {
		super();
		this.marksSecured = marksSecured;
		
	}
	
	//abstract method implementation
	public void calcPercentage()
	{
		
		
		float total=(marksSecured);
		
		if(total<=TOTAL_MAXIMUM_MARKS)
		{
			float percentage=(total/TOTAL_MAXIMUM_MARKS)*(100);
			System.out.println("The total aggregate percentage secured by the intern is  :"+percentage   );
		}
		else
		{
			System.out.println("Please enter correct marks..!");
		}
	}
	
}
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student intern = new Intern(283,77);
		intern.calcPercentage();
		
		Student trainee = new Trainee(370);
		trainee.calcPercentage();
		
	}

}

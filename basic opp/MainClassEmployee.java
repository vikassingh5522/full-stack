
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Employee
{
	private int id;
	private String name;
	private double sal;
	public void inputInformation() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Name: ");
		name=br.readLine();
		
		System.out.println("Enter the id: ");
		id=Integer.parseInt(br.readLine());

		System.out.println("Enter the salary: ");
		sal=Double.parseDouble(br.readLine());
	}
	public void showInformation()
	{
		System.out.println("Employee Name: "+name+"\t ID: "+id+"\t Salary: "+sal);
	}	
}

class MainClassEmployee
{
	public static void main(String []args) throws Exception
	{
		Employee e1=new Employee();

		e1.inputInformation();
		e1.showInformation();
	}
}
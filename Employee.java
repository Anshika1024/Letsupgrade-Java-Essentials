import java.util.*;
public class Employee 
{
	public String name;
	public int age;
	public double salary;
	public String designation;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		System.out.println("Enter designation");
		designation=sc.next();
	}
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The salary is "+salary);
		System.out.println("The designation is "+designation);
	 }
}

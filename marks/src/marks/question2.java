package marks;
import java.util.Scanner;
public class question2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee:");
		String name=sc.next();
		System.out.println("Enter date of birth of employee:");
		int dob=sc.nextInt();
		System.out.println("Enter month of birth of employee:");
		String month=sc.next();
		System.out.println("Enter birth year of employee:");
		int year=sc.nextInt();
		System.out.println("Enter monthly salary of employee:");
		float sal=sc.nextFloat();
		double annual=sal*12;
		double tax=0;
		System.out.println("Name: "+name);
		int age=2020-year;
		System.out.println("Age: "+age);
		System.out.println("Annual salary: "+annual);
		if(annual>=500000)
		{
			tax=0.20*annual;
		}
		else if(annual>=400000 && annual<500000)
		{
			tax=0.15*annual;
		}
		else if(annual>=300000 && annual<400000)
		{
			tax=0.10*annual;	
		}
		else if(annual>=200000 && annual<300000)
		{
			tax=0.05*annual;
		}
		
		System.out.println("Tax amount: "+tax);
	}

}

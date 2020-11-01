import java.util.*;
public class Doctor extends Employee {
	Scanner sc=new Scanner(System.in);
	String hname;
	String speciality;
	public void getProperties()
	{
		System.out.println("Enter hospital name:");
		hname=sc.next();
		System.out.println("Enter speciality:");
		sc.nextLine();
		speciality=sc.nextLine();
	}
	public void dislayDetails()
	{
		System.out.println("Hospital name: "+hname+" "+"Speciality: "+speciality);
	}

}

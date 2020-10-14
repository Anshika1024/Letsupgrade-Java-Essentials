package day4;
import java.util.Scanner;
public class Avenger {
	public String name;
	public int age;
	public int power;
	public String weapon;
	public String planet;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter power:");
		power=sc.nextInt();
		System.out.println("Enter weapon:");
		weapon=sc.next();
		System.out.println("Enter planet:");
		planet=sc.next();		
	}
	public void displayDetails()
	{
		System.out.println("Name: "+name+" Age: "+age+" Power: "+power+" Weapon: "+weapon+" Planet: "+planet);
	}

}

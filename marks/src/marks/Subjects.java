package marks;
import java.util.Scanner;
public class Subjects {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for five subjects");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		float per=(a+b+c+d+e)/5;
		System.out.println("Percentage is: "+per);
		if (per>=90 && per<=100)
		{
			System.out.println("Grade A");
		}
		else if (per>=80 && per<90)
		{
			System.out.println("Grade B");
		}
		else if (per>=70 && per<80)
		{
			System.out.println("Grade C");
		}
		else if (per>=60 && per<70)
		{
			System.out.println("Grade D");
		}
		else if (per>=50 && per<600)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}

		
	}

}

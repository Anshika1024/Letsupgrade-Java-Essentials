package quiz_application;
import java.util.Scanner;
public class Question {
	Scanner sc=new Scanner(System.in);
	String ques,o1,o2,o3,o4;
	int correct,userans;
	public boolean askQuestion()
	{
		System.out.println(ques);
		System.out.println("1. "+o1);
		System.out.println("2. "+o2);
		System.out.println("3. "+o3);
		System.out.println("4. "+o4);
		System.out.println("Choose any option");
		userans=sc.nextInt();
		if(userans==correct)
		{
			return true ;
		}
		return false;	
	}
	}

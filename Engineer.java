import java.util.*;
public class Engineer extends Employee {
	Scanner sc=new Scanner(System.in);
	String r;
	int t;
	public void research()
	{
		System.out.println("Enter the field of research");
		r=sc.nextLine();
		System.out.println("Enter time required for research");
		t=sc.nextInt();
	}
	public void details()
	{
		System.out.println("Field:"+ r +" "+"time:"+t);
	}

}

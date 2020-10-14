package day4;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avenger[] a=new Avenger[5];
		for (int i=0;i<5;i++)
		{
			a[i]=new Avenger();
			a[i].getDetails();
		}
		
		for (int i=0;i<5;i++)
		{
			a[i].displayDetails();
		}
		
		

	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d[]=new Doctor[3];
		System.out.println("For doctors:");
		for(int i=0;i<3;i++)
		{
			d[i]=new Doctor();
			d[i].getDetails();
			d[i].getProperties();
		}
		for(int i=0;i<3;i++)
		{
			d[i].display();
			d[i].dislayDetails();
		}
		Engineer e[]=new Engineer[3];
		System.out.println("For engineers:");
		for(int i=0;i<3;i++)
		{
			e[i]=new Engineer();
			e[i].getDetails();
			e[i].research();
		}
		for(int i=0;i<3;i++)
		{
			e[i].display();
			e[i].details();
		}
		Pilots p[]=new Pilots[3];
		System.out.println("For pilots:");
		for(int i=0;i<3;i++)
		{
			p[i]=new Pilots();
			p[i].getDetails();
			p[i].flyplane();
		}
		for(int i=0;i<3;i++)
		{
			p[i].display();
			p[i].flightdetails();
		}
	}

}

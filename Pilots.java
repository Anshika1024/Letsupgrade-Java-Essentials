public class Pilots extends Employee {
	String airlinesname;
	int timeofflight;
	 public void flyplane()
	 {
		 System.out.println("Enter airlines name:");
		 airlinesname=sc.next();
		 System.out.println("Enter the time of flight:");
		 timeofflight=sc.nextInt();
	 }
	 public void flightdetails()
	 {
		 System.out.println("Airlines name:"+airlinesname+" "+"Flight time:"+timeofflight);
	 }

}

package day4;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int s=0;
		System.out.println("Enter 5 values");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		System.out.println("Sum="+s);

	}

}

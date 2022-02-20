package Assingment_17;

import java.util.Scanner;

public class Hour_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
System.out.print("enter hours :");
float m = scan.nextFloat();
	
double day = 0.0416667*m;
	System.out.println(" days :" +day);
	
float year = 0.000114155f *m;
	
	System.out.println(" years :" +year);
	}

}

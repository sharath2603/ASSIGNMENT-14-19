package Assignmentof_18th_19thfeb;

import java.util.Scanner;

public class Sumofalldigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
	  
		long i =sc.nextLong();  
	  long sum =0;
		for(sum=0; i!=0; i=i/10)  
		{  
		//finds the last digit and add it to the variable sum      
		sum = sum + i % 10;  
		}  
		System.out.println("Sum of digits: "+sum);  
	}

}

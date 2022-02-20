package Assignmentof_18th_19thfeb;

import java.util.Scanner;

public class Square_of_sumupto_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        getvalues(n);
	    }
	    public static void getvalues(int n) {
	        int sum = 0, count = 1;
	        while (count <= n) {
	            sum = sum + (count * count);
	            count++;
	        }
	        System.out.println(sum);
	}

}

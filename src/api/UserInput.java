package api;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		System.out.println("Please enter three numbers:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int total = num1 + num2 + num3;
		System.out.println("Addition of three numbers;"+ num1+" "+ num2 + " "+num3+" is "+ total);
		sc.close();
	}
  
}

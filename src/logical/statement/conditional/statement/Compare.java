package logical.statement.conditional.statement;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		System.out.println("Please enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if(num1>num2) {
			System.out.println("num1: "+ num1 + "is bigger than num2: "+ num2);
		}else if(num1<num2) {
			System.out.println("num2: "+ num2 + " is bigger than num1: "+num1);			
		}else if(num1==num2) {
			System.out.println("num1: "+ num1 + " and num2: "+ num2 + "are equal. ");
		}else {
			
		}
	}
}

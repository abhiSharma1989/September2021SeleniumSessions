package JavaSessions;

import java.util.Scanner;

public class PracticeConditionalOperator {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter all the three numbers:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		System.out.println("Input the 1st number: " + a);
//		System.out.println("Input the 2nd number: " + b);
//		System.out.println("Input the 3rd number: " + c);
//
//		if (a < b && b < c) {
//			System.out.println("The greatest: " + c);
//		} else if (c < b && b < a) {
//			System.out.println("The greatest: " + a);
//		} else if (c < a && a < b) {
//			System.out.println("The greatest: " + b);
//		} else {
//			System.out.println("No Value");
//		}

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the test number");
		int a =sc.nextInt();
		System.out.println("Input the 1st number: " + a);

		if(a>0 ) {
			System.out.println("Number is Positive");
		}
		else if(a<0){
			System.out.println("Number is Negative");
		}
		
				
	}

}

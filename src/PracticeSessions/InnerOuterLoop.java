package PracticeSessions;

import java.util.ArrayList;

public class InnerOuterLoop {

	public static void main(String[] args) {

//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
		int n = 5;
		for (int i = 0; i<n; i++) {
			for(int j=2 * (n-i); j>=0; j--) {
				System.out.print(" ");
			}
			 for(int j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	             
	            // ending line after each row
	            System.out.println();
	        }
	}

}

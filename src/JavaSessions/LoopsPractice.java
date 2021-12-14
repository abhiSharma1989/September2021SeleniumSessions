package JavaSessions;

public class LoopsPractice {

	public static void main(String[] args) {
		int i = 1;

//		for (i=10; i>=1; i--) {
//			System.out.println(i);
//		}

//		while (i>=1) {
//			System.out.println(i);
//			i--;
//		}

//		do {
//			System.out.println(i);
//			i--;
//			
//		} while (i>=1);

		// even//odd numbers with %
		// 11 (11%2==1)
		// 10 (10%2==0)

//		for (i = 11; i>=1; i--) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}

//		while (i >= 1) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i--;
//
//		}

		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <=21);
		
	}
}

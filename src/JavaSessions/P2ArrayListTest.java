package JavaSessions;

import java.util.ArrayList;

public class P2ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> ar2 = new ArrayList<Integer>();

		ar2.add(200);
		ar2.add(300);
		ar2.add(400);
		ar2.add(500);

		for (int e : ar2) {
			System.out.println("The number are : " + e);
		}

		ar2.add(0, 100);
		ar2.add(5, 20);
		ar2.set(5, 600);

		System.out.println("-----------");
		System.out.println();

		for (int e : ar2) {
			System.out.println("The number are : " + e);
		}
		
		if (ar2.contains(400)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println(ar2.size());
		
		System.out.println("-----------");
		System.out.println();
		for(int i=ar2.size()-1; i>=0; i--) {
			System.out.println(ar2.get(i));
		}
	}

}

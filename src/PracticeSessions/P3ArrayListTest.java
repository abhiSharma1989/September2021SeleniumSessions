package PracticeSessions;

import java.util.ArrayList;

public class P3ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		ar3.add(100);
		ar3.add(200);
		ar3.add(300);
		ar3.add(400);
		ar3.add(500);
		ar3.add(600);
		
		System.out.println(ar3.get(5));
		
		ar3.set(0, 20);
		
		System.out.println(ar3.lastIndexOf(600));
		

	}

}

package PracticeSessions;

import java.util.ArrayList;

public class P1ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		System.out.println(colors.size());
		
		colors.add("Yellow");//0
		colors.add("Green");//1
		colors.add("Blue");//2
		colors.add("Orange");//3
		colors.add("Purple");//4
		colors.add("Violet");//5

		System.out.println(colors.size());
		System.out.println();

		
//		for(int a = 0; a<=colors.size(); a++) {
//			System.out.println(colors.get(a));
//		}
		int i=0;
		for(String e : colors) {
			System.out.println(i+" "+e);
			i++;
		}
	}

}

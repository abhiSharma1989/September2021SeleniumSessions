package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		int i[] = {10,20,30,40,50,60};
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
		
		ArrayList<String> names = new ArrayList<String> (Arrays.asList("Java", "Python", "JS"));
		System.out.println(names);
		
		ArrayList<String> l1 = new ArrayList<String> (Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l2 = new ArrayList<String> (Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l3 = new ArrayList<String> (Arrays.asList("G", "B", "F", "D", "E"));
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		System.out.println(l1.equals(l2));
		
		
		

	}

}

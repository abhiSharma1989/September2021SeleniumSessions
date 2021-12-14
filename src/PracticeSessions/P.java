package PracticeSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P {

	public static void main(String[] args) {

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Red");
		ar4.add("Green");
		ar4.add("Orange");
		ar4.add("White");
		ar4.add("Black");
		
		int i=0;
		for(String e: ar4) {
			System.out.println(i + " " + e);//Java program to print all the elements of a ArrayList using the position of the elements
			i++;
		}	
		
		List<String> a = ar4.subList(0,3);//Java program to extract a portion of a array list.
		System.out.println("After extracting the portion of a array list");
		System.out.println(a);
		System.out.println("---------");
		System.out.println();
		
		System.out.println("Before Swap the ArrayList ");
		System.out.println(ar4);
		
		Collections.swap(ar4, 3, 4);//Java program of swap two elements in an array list
		System.out.println("After Swap the ArrayList ");
		System.out.println(ar4);
		System.out.println("---------");
		System.out.println();
		
		System.out.println("Original array list: " + ar4);
        System.out.println("Let trim to size the above array: ");
		ar4.trimToSize();//Java program to trim the virtual capacity of an array list the current list size.
		System.out.println(ar4);
		System.out.println("---------");
		System.out.println();
		
		ar4.clear();//Java program to empty an array list
//		ar4.removeAll(ar4);//Java program to empty an array list
		
		if(ar4.isEmpty()) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(ar4);
		System.out.println();

	}

}

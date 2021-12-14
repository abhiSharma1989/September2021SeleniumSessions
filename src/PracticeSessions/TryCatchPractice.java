package PracticeSessions;

import java.io.IOException;

public class TryCatchPractice {

	public void m1()  {
		System.out.println("m1");
//		try {
//		m2();
//		}catch(ArithmeticException e) {
//			System.out.println("Hi test1");
//			e.printStackTrace();
//		}
		m2();
	}

	public void m2()  {
		System.out.println("m2");
		try {
		m3();
		System.out.println("test output");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
		finally {
			System.out.println("final block");
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int i = 9%0;
//		System.out.println(9.0/0);
	}

	public static void main(String[] args) {
		TryCatchPractice obj = new TryCatchPractice();
		obj.m1();
		System.out.println("Test 2");
		
	}

}

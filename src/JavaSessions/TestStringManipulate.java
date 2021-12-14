package JavaSessions;

public class TestStringManipulate {

	public static void main(String[] args) {

		String s = "This is my java code and I am so happy. Rest is fine.";
		System.out.println(s.length());
		
		int a = s.indexOf('i') + 1;
		int b = s.indexOf('i', s.indexOf('i') + 1);
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', s.indexOf('i') + 1));
		System.out.println(s.indexOf('i', b + 1));
		
		

	}

}

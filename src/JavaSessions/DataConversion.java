package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);//10020
		//String to int
		int a = Integer.parseInt(x);
		System.out.println(a+20);//120
		
//		String y = "100A";
//		int b =Integer.parseInt(y);
//		System.out.println(y); NumberFormatException
//		int c =Integer.parseInt(y.replace("A", ""));
//		System.out.println(c + 80);
		
		
		// String to Double
		String p = "12.33";
		System.out.println(p+20);//12.3320
		
		double r = Double.parseDouble(p);
		System.out.println(r + 20);//32.33
		
		//int to String
		int total = 100;
		String t = String.valueOf(total);
		System.out.println(t+20);//10020
		
		
		

	}

}

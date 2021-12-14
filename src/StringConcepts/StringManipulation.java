package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "This is my java code and I am so happy";
		String s1 = "This is my java code and I am so happy java is best";
		
		System.out.println(s.length());//38
		System.out.println(s.charAt(0));//T
		System.out.println(s.charAt(37));//y
//		System.out.println(s.charAt(38));//StringIndexOutOfBoundException
//		System.out.println(s.charAt(-1));//StringIndexOutOfBoundException
		
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));//2  //first occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//5 //2nd occurrence of i
		
		int a = s1.indexOf('i', s.indexOf('i', s1.indexOf('i')+1));
		System.out.println(a);//5
		System.out.println(s1.indexOf('i', a +1));//44
		
		System.out.println(s.indexOf("code"));//16
		System.out.println(s.indexOf("python"));//-1
		
		String mesg = "Welcome Admin";
		System.out.println(mesg.indexOf("Admin"));//8
		if(mesg.indexOf("Admin") > 0) {
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());// this is my java code and i am so happy
		System.out.println(s.toUpperCase());// THIS IS MY JAVA CODE AND I AM SO HAPPY
		
		String str = "  Hello World   ";
		System.out.println(str.trim());//Hello World
		System.out.println(str.replace(" ", "")); //HelloWorld
		
		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));  // 01/01/1990
		
		String s2 = "your userid is abhi1989";
		System.out.println(s2.contains("abhi1989"));
		if(s2.contains("abhi1989")) {
			System.out.println("PASS");
		}
		
		String t1 = "hello java";//Java literals
		String t2 = "hello Java";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		//Split
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);//Java
//		System.out.println(langArr[4]);//ArrayIndexOutofBounds Exception
		
		for (String e : langArr) {
			System.out.println(e);
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		
		String empData = "Hiren;Patel;40;NY;USA;01-01-1970;selenium;QA";
		String emp[] = empData.split(";");
		
		for(String e : emp) {
			System.out.println(e);
		}
		
		String credentials = "admin;admin123";
		System.out.println(credentials.split(";")[0]);
		System.out.println(credentials.split(";")[1]);
		
		String message = "Your order id is 12345. Plus the amount is 2568";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0, 10));
		System.out.println(message.substring(message.indexOf("is") + 3, message.length()));
		String orderid = message.substring(message.indexOf("is") + 3, message.length());
		System.out.println(orderid);
		int c = message.indexOf("is", message.indexOf("is", message.indexOf("is")+3));
		System.out.println(c);
		System.out.println(message.substring(c + 3, message.length()));		
	}

}

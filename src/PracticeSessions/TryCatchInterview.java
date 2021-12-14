package PracticeSessions;

public class TryCatchInterview {

	public static void main(String[] args) {
		 try{
	         int a = 10/0;
	     }
		 catch (ArithmeticException e) 
	     {
	 
	                // Print the message if exception occured
	                System.out.println(
	                    "NumberFormatException occured");
	            }
	      catch(Exception e)
	     {
	         System.out.println(
	                    "Exception occured");
	     } 
		 
//		 try{
//	         int a = 10/0;
//	     }
//		 
//	      catch(Exception e)
//	     {
//	         System.out.println(
//	                    "Exception occured");
//	     } 
//		 catch (ArithmeticException e) // will give compiler error if base class is present at top and you have given the exception class at bottom
//	     {
//	 
//	                // Print the message if exception occured
//	                System.out.println(
//	                    "NumberFormatException occured");
//	            }
	     


	}

}

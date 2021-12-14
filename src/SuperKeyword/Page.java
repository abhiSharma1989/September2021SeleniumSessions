package SuperKeyword;

public class Page {
	
	int timeout = 100;
	
	public Page(){
		System.out.println("Page Default ...");
	}
	
	public Page(int a){
		System.out.println("Page Default ..." +  a);
	}
	
	public Page(int a, int b){
		System.out.println("Page Default ..." +  (a+b));
	}
	
	public void display() {
		System.out.println("Page Display");
	}

}

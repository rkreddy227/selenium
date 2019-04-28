package Selenium.Selenium;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";
		String b="World";
		
		a = a+b;
		System.out.println("The string is  " + a);
		
		b =a.substring(0,a.length()-b.length());
		a =a.substring(b.length());
		
		System.out.println(b);
		System.out.println(a);
		try {
		
		}finally {
			
		}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
	}

}

package Selenium.Selenium;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=0,b=1,c,i,count=10;
		
		for(i=2;i<=10;i++) {
			
			c = a+b;
			System.out.println("c value " +c );
			a=b;
			b=c;
			//System.out.println("Print the values a,b,c" +( a,b,c));
			
			
		}
	}

}

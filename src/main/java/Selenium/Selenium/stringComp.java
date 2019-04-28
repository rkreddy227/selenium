package Selenium.Selenium;

public class stringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "The rains Have started here selenium";
		String str = "The rains have started here selenium";
		
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+2));
		System.out.println(str.indexOf("Have"));
		System.out.println(str.indexOf("Ramakrishna"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,9));
		
		String date ="21-01-2027";
		System.out.println(date.replace("-","/"));
		
		
		String s= " Rama Krishna Reddy  ";
		//it removes start and end of spaces
		System.out.println(s.trim());
		//It removes between words
		System.out.println(s.replace("",""));
		
		String x="Hello";
		String y="World";
		int a=10;
		int b=20;
			System.out.println(x+y+a+b);
			System.out.println(a+b+x+y);
		
		
	}

}

package Selenium.Selenium;


public class stringReverse {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Ramakrishna";
	
		//StringBuffer rev=new StringBuffer(s);
		//System.out.println(rev.reverse());
		int length = s.length();
		String rev = null;
		for(int i=length-1; i>=0; i--) {
			
			 rev =rev+s.charAt(i);
			
		}
		
		
		System.out.println(rev);
	}
	

}

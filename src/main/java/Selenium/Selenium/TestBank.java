package Selenium.Selenium;

public class TestBank {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HdfcBank hb = new HdfcBank();
		hb.credit();//
		hb.debit();
		hb.loan();
		
		Bank b= new HdfcBank();
		b.loan();
		b.credit();
		b.debit();
	
	}

}

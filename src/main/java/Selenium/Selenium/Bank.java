package Selenium.Selenium;

public abstract class Bank {
      //hiding implementaion logic
	public abstract void loan(); //abstract method
		
	//non abstract method
	//abstract class have abstract and non abstract methods
	public void credit() {
		System.out.println("Bank Credit Card");
		
	}
	public void debit() {
		System.out.println("Bank Debit card");
		
	}

}

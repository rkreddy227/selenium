package Selenium.Selenium;

import java.util.Arrays;

public class largestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {-10,23,45,29,345,789,34};
		int largest = numbers[0];
		int smallest =numbers[0];
		
		for (int i=1;i<=6;i++) {
			if(numbers[i]>largest) {
				largest =numbers[i];
			}
		
			else {
				if(numbers[i]<smallest) {
					smallest =numbers[i];
					
				}
			
			
			}
			//int k=100/0;
			//System.out.println(k);
			
		}
		System.out.println("array is "+ Arrays.toString(numbers));
		
			
		System.out.println("lagest no. is "+largest);
		System.out.println("smalest no is " + smallest);
		

	}

	
	public void generalex() {
		System.out.println(100/0);
	}
}

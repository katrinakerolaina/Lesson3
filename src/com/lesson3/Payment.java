package com.lesson3;
//calculate salary payment based on working hours Hr(standard hr, overtime hr)
public class Payment {

		
	//declare instance variables for the values to be calculated
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	//declare method with 3 parameters to calculate the payment
	public void calculatePayment(double payRate, double standardHours, double overtimeHours){
		//calculate the overtime payment
		standardPay = payRate * standardHours;
		
		double overtimePayRate = payRate * 1.5;
		overtimePay = overtimePayRate * overtimeHours;
		
		totalPay = standardPay + overtimePay;
	}
	
	public void displayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My standard overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
		
			
	public static void main(String[] args) {
		//declare a variable of type of payment
		Payment myPayment;
		
		//create an object of type of payment
		myPayment = new Payment();
		
//		double payRateApple, sH, oH;
//		payRateApple = 20;
//		sH = 40;
//		oH = 20;
//		
//		myPayment.calculatePayment(payRateApple, sH, oH);
//		myPayment.displayPayment();
		
		myPayment.calculatePayment(19.5, 35, 12);
		myPayment.displayPayment();
		
	}//end main

}//end class

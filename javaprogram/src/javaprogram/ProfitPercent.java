package javaprogram;

import java.util.Scanner;

public class ProfitPercent {

	public static void main(String[] args) {
	Show s=new Show();
	Scanner in=new Scanner(System.in);
	 System.out.println("Enter the number of dozens of toyspurchased :");
	 int dozenCount=in.nextInt();
	 System.out.println("Enter the price per dozens  :");
	 int pricePerDozen=in.nextInt();
	 System.out.println("Enter the number selling price of 1 toy:");
	 int sellPrice=in.nextInt();
	 
	  float pp = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);
	 System.out.printf("Sam's profit percentsge is %.2f\n ",pp);
	}

}
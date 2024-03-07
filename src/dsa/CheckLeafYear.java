package dsa;

import java.util.Scanner;

//	Write a program to check if a given year is a leap year or not.
public class CheckLeafYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year to check either leap year");
		int year = scan.nextInt();
		if((year%4==0 && year%100!=0) ||(year%400==0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year ");
		}
		
	}

}

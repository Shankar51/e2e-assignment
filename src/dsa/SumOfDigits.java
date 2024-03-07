package dsa;

import java.util.Scanner;
//	Write a program to find the sum of digits of a given number
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		while(n>0) {
		sum=sum+(n%10);	
			n=n/10;
		}
		System.out.println(sum);
	}

}

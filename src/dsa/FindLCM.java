package dsa;

import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number a");
		int a = scan.nextInt();
		System.out.println("enter the second number b");
		int b = scan.nextInt();		
		int gcd =1;
		
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		int lcm = (a*b)/gcd;
		System.out.println(lcm+" is LCM of a and b");
	}

}

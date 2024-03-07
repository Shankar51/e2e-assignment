package dsa;

import java.util.Scanner;

//	Write a program to convert a decimal number to binary
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String t="";
		String s="";
		while(n>0) {
		t=t+(n%2);	
		n = n/2;
		}
		for(int i=t.length()-1;i>=0;i--) {
			s = s+t.charAt(i);
		}
		System.out.println(s);
		
		

	}

}

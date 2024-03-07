package dsa;
//		Write a program to convert a binary number to a decimal
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary = scan.nextInt();
		
		int placeValue=1;
		int sum=0;
		while(binary>0) {
			sum=sum+((binary%10)*placeValue);
			binary=binary/10;
			placeValue=2*placeValue;
		}
		System.out.println(sum);

	}

}

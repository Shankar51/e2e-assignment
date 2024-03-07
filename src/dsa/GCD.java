package dsa;
//	Write a program to find the GCD of two numbers
public class GCD {

	public static void main(String[] args) {
		int a =50;
		int b=60;
		int c=1;
		
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				c=i;
			}
		}
		System.out.println(c);

	}

}

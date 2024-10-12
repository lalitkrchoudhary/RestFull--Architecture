package DSquestion;

import java.io.*;
class Fibonacci {
	static void fib(int n) {
		int num1 =0;
		int num2=1;
		for(int i=0; i<n; i++) {
			System.out.println(num1 + " ");
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
		}
	}
	
	public static void main(String[] args) {
		int n=10;
		fib(n);
	}
}



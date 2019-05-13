package com.demos;

public class Demo1 {

	public static void main(String[] args) {		
		
		int a = 10;
		int b = 10;
		int c = a++;
		int d = ++b;		
		System.out.println(c + "-" + d);
		
		int e = 8<<1;
		int f = 8>>1;
		System.out.println(e + "-" + f);

		int g = 8 & 6;
		int h = 8 ^ 6;
		System.out.println((g +"-" + h));
	}

}

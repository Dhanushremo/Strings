package com.dhanush.strings;

import java.util.Scanner;

public class LowercaseASCII {
	static void lowerASCII(int n) {

		System.out.println(n>=97 && n<=122?"97":"false");
		char c='A';
		System.out.println((float)c);
		
	}

	public static void main(String[] args)
	{
		 System.out.println("Enter the String");
	     int s = new Scanner(System.in).nextInt();
	     lowerASCII(s);

	
	}

}

package com.dhanush.strings;

import java.util.Scanner;

public class UpperCaseASCIICheck {
	static void UpperASCII(int n) {

		System.out.println(n>=65 && n<=92?"true":"false");
		
	}

	public static void main(String[] args) {
		 System.out.println("Enter the String");
	     int s = new Scanner(System.in).nextInt();
	     UpperASCII(s);

	}

}

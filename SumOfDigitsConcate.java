package com.dhanush.strings;

import java.util.Scanner;

public class SumOfDigitsConcate {
	static String sum(String s) {
		String t="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				int a=ch;
				sum+=a-'0';
			}
			else {
				t+=ch;
			}
		}
		return t+sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println(sum(s));

	}

}

package com.dhanush.strings;

import java.util.Scanner;

public class StringToASCII {
	static String asciiConverter(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			t+=(int)s.charAt(i)+" ";
		}
		return t;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println("Ascii Converted "+asciiConverter(s));

	}

}

package com.dhanush.strings;

import java.util.Scanner;

public class ReplaceUpperCaseLetters {
	static void upper(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.print("*");
			}
			else {
				System.out.print(ch);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		upper(s);

	}

}

package com.dhanush.strings;

import java.util.Scanner;

public class RemoveSpecialChar {
	static void removeSpecial(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)||Character.isLetter(ch)||ch==' ') {
				System.out.print(ch);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		removeSpecial(s);
		}
}

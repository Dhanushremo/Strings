package com.dhanush.strings;

import java.util.Scanner;

public class MoveSpecialChar {
	static String moveSpecialChar(String s) {
		String t="";
		String demo="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)||Character.isDigit(ch)||ch==' ') {
				t+=ch;
			}
			else {
				demo+=ch;
			}
			
		}
		return demo+t;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		System.out.println(moveSpecialChar(s));

	}

}

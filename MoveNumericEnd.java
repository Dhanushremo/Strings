package com.dhanush.strings;

import java.util.Scanner;

public class MoveNumericEnd {
	static String moveNumericEnd(String s) {
		String t="";
		String r="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				t+=ch;
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				r+=s.charAt(i);
			}
		}
		return t+r;
	}
public static void main(String[] args) {
	System.out.println("Enter the String!!");
	String s=new Scanner(System.in).nextLine();
	System.out.println(moveNumericEnd(s));
}
}

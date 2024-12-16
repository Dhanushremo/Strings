package com.dhanush.strings;

import java.util.Scanner;

public class PrintSpecialChar {
	static String numCount(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z')||(ch==' ')||(ch>='0' && ch<='9'))){
				t+=ch+" ";
			}}
			return t;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll Special are "+numCount(s));

	}
}

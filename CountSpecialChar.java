package com.dhanush.strings;

import java.util.Scanner;

public class CountSpecialChar {
	static int numCount(String s) {
		int sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z')||(ch==' ')||(ch>='0' && ch<='9'))){
				sp++;
			}}
			return sp;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll SpecialCharacters count are "+numCount(s));

	}
}

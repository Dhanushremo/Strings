package com.dhanush.strings;

import java.util.Scanner;

public class AlphaNumeric {
	static int alpaNumeric(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')||(ch>='A' && ch<='Z')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println("AlphaNumeric Count is "+alpaNumeric(s));
	}

}

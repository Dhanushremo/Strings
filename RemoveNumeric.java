package com.dhanush.strings;

import java.util.Scanner;

public class RemoveNumeric {
	static void removeNumeric(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				continue;
			}
			else {
				System.out.print(ch);
			}
		
		}
	}
	public static void main(String[] args) {
	System.out.println("Enter the String!!");
	String s=new Scanner(System.in).nextLine();
	removeNumeric(s);
	}

}

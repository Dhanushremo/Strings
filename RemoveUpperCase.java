package com.dhanush.strings;

import java.util.Scanner;

public class RemoveUpperCase {
	static void removeUpper(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
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
		removeUpper(s);

	}

}

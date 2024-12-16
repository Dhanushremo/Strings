package com.dhanush.strings;

import java.util.Scanner;

public class RemoveSpace {
	static void removeSpace(String s) {
		System.out.println(s.trim());
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		removeSpace(s);
		

	}

}

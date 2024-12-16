package com.dhanush.strings;

import java.util.Scanner;

public class SpaceCount {
	static int space(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println("OverAll Space is "+space(s));

	}

}

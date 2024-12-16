package com.dhanush.strings;

import java.util.Scanner;

public class LowerCaseCount {
	static int lowerCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		System.out.println(lowerCount(s));
	}

}

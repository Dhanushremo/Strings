package com.dhanush.strings;

import java.util.Scanner;

public class UpperCaseCount {
	static int upperCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		System.out.println(upperCount(s));
	}
}

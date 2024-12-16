package com.dhanush.strings;

import java.util.Scanner;

public class ReverseString {
	static String reverse(String s) {
		s=s.toLowerCase();
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		return temp;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println("Revered String "+reverse(s));
	}

}

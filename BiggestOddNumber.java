package com.dhanush.strings;

import java.util.Scanner;

public class BiggestOddNumber {
	static char biggestOddNumber(String s) {
		char ch1=' ';
		String t="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				int num=(int)ch;
				if(num%2==1) {
					t+=(char)num;
				}
			}
		}
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)>ch1) {
				ch1=t.charAt(i);
			}
		}
		return ch1;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		System.out.println(biggestOddNumber(s));

	}

}

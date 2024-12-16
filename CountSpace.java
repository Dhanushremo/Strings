package com.dhanush.strings;

import java.util.Scanner;

public class CountSpace {
	public static int space(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
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

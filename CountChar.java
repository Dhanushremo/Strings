package com.dhanush.strings;

import java.util.Scanner;

public class CountChar {
	
	static int countChar(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
				System.out.print(s.charAt(i)+" ");
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll Lettrs are "+countChar(s));

}}

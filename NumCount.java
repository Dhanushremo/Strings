package com.dhanush.strings;

import java.util.Scanner;

public class NumCount {
	static int numCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count++;
			}}
			return count;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll Numbers are "+numCount(s));

	}

}

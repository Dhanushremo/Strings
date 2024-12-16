package com.dhanush.strings;

import java.util.Scanner;

public class CountVowels {
	static int countVowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll Vowels are "+countVowels(s));

	}

}

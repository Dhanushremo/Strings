package com.dhanush.strings;

import java.util.Scanner;

public class CountVowel {
	
	
	public static int countVowel(String s) {
		int count=0;
		int cc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
			else if(!(ch=='a' &&  ch=='e' && ch=='i' && ch=='o'&& ch=='u' && ch==' ')) {
				cc++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.print("OverAll Lettrs are "+countVowel(s));
	}

}

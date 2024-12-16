package com.dhanush.strings;

import java.util.Scanner;

public class RemoveConsonants {
	static void removeLowerCase(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))||(ch>='0' && ch<='9')||ch==' '||ch=='.' ) {
				System.out.print(ch);
			}
		
		}
	}
	public static void main(String[] args) {
	System.out.println("Enter the String!!");
	String s=new Scanner(System.in).nextLine();
	removeLowerCase(s);
	}
}

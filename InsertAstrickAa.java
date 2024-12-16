package com.dhanush.strings;

import java.util.Scanner;

public class InsertAstrickAa {
	static void  insertAstrick(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				System.out.print("*"+s.charAt(i));	
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
		public static void main(String[] args) {
			System.out.println("Enter the String!!");
			String s=new Scanner(System.in).nextLine();
			insertAstrick(s);

		}

}

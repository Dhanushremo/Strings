package com.dhanush.strings;

import java.util.Scanner;

public class CounConsVowelSpecil {
    static void countAll(String s) {
        int cc = 0, vv = 0, sp = 0, nn = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vv++;
            }
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cc++;
            }
            else if(ch >= '0' && ch <= '9') {
                nn++;
            }
            else {
                sp++;
            }
        }

        System.out.println("Consonants: " + cc);
        System.out.println("Vowels: " + vv);
        System.out.println("Special Characters: " + sp);
        System.out.println("Numbers: " + nn);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String");
        String s = new Scanner(System.in).nextLine();
        countAll(s);
    }
}

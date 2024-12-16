import java.util.Scanner;

public class Lower2Upper {
		static void Upper2Lower(String s){
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		 System.out.println("Enter the String");
	     String s = new Scanner(System.in).nextLine();
	     Upper2Lower(s);

	}}
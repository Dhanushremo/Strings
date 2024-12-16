import java.util.Scanner;

public class AlternateCaseSwap {
	static String swap(String s) {
		String t="";
		String demo="";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			demo=arr[i]+" ";
			for(int j=0;j<demo.length();j++) {
				char ch=demo.charAt(j);
				if(Character.isLowerCase(ch)) {
					t+=Character.toUpperCase(ch);
				}
				else {
					t+=Character.toLowerCase(ch);
				}
			}
		}
		return t;
	}
	public static void main(String[] args) {
		  System.out.println("Enter the String");
	       String s = new Scanner(System.in).nextLine();
	        System.out.println(swap(s));

	}

}

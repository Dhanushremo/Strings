import java.util.Scanner;

public class UpperCase2LowerCase {
	static void Upper2Lower(String s){
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			System.out.print(Character.toLowerCase(s.charAt(i)));
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

}
}

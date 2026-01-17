package p1;

//Program to check whether a string is palindrome

public class Que100 {
	public static void main(String [] args) {
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.print("String is palindrome");
		}else {
			System.out.print("String is not palindrome");
		}
	}
}

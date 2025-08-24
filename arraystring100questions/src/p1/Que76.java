package p1;

//Print first and last character of a string

public class Que76 {
	public static void main(String[] args) {
		String str = "Hello Java";

		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);

		System.out.println("First character of string :"+first);
		System.out.println("Last character of string :"+last);
	}

}

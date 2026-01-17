package p1;

//Program to swap first and last character of a string

public class Que99 {
	public static void main(String [] args) {
		String str="Hello";
		String result="";
		
		result=result+str.charAt(str.length()-1);
		
		for(int i=1;i<str.length()-1;i++) {
			result=result+str.charAt(i);
		}
		result=result+str.charAt(0);
		System.out.print(result);
	}
}

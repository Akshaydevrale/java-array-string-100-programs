package p1;

//Swap first and last character of a string

public class Que85 {
	public static void main(String[] args) {
		String str = "Hello";
		
		char[] ch = str.toCharArray();
		
		char temp = ch[0];
		ch[0] = ch[ch.length-1];
		ch[ch.length-1] = temp;
		
		String swapped = new String(ch);
		System.out.println("Swapped String: "+swapped);
	}

}

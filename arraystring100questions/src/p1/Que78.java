package p1;

//Count digits in a string

public class Que78 {

	public static void main(String[] args) {
		String str = "Java12345";
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Digits in a string: "+count);
	}

}

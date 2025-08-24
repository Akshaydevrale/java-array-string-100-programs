package p1;

//Count letters in a string

public class Que79 {

	public static void main(String[] args) {
		String str = "Java12345";
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				count++;
			}
		}
		System.out.println("Letters in a string: "+count);
	}

}

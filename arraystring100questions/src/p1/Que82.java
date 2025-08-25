package p1;

//Find non-repeated characters

public class Que82 {
	public static void main(String[] args) {
		String str = "aabbcdde";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("Non repeated characters: "+ch);
			}
		}
	}

}

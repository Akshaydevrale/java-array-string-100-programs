package p1;

//count vowels and consonants from string

public class Que66 {

	public static void main(String[] args) {
		String str="Akshay Rajput";
		int vowels=0, consonants=0;
		for(int i=0;i<str.length();i++) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}

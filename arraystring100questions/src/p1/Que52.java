package p1;

//Count Occurrence of a Character

public class Que52 {

	public static void main(String[] args) {
		String str="akshay rajput";
		char ch='a';
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}

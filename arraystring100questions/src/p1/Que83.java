package p1;

//Count uppercase and lowercase letters

public class Que83 {
	public static void main(String[] args) {
		String str = "Hello Java";
		int upper = 0, lower=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}else if(Character.isLowerCase(ch)) {
				lower++;
			}
		}
		System.out.println("Upper: "+upper);
		System.out.println("Lower: "+lower);
	}

}

package p1;

//check if all characters are alphabets

public class Que57 {

	public static void main(String[] args) {
		String str="Akshay";
		boolean letters=true;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))) {
				letters=false;
				break;
			}
		}
		if(letters==true) {
			System.out.println("All characters are alphabets");
		}else {
			System.out.println("All characters are not alphabets");
		}
	}

}

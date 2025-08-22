package p1;

//code to converts uppercase letters to lowercase and lowercase letters to uppercase (letter by letter)

public class Que72 {

	public static void main(String[] args) {
		String str="aKshaY dEvrAlE";
		String res="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				res=res+Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)) {
				res=res+Character.toUpperCase(ch);
			}else {
				res=res+ch;
			}
		}
		System.out.println("String Converted:");
		System.out.print(res);
	}

}

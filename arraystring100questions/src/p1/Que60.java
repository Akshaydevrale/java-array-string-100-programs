package p1;

//Count characters in string

public class Que60 {

	public static void main(String[] args) {
		String str="Akshay Rajput";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
				count++;
			}
		}
		System.out.println(count);
	}

}

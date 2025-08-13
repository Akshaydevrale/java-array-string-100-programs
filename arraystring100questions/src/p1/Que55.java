package p1;

//Count Capital Letters in a String

public class Que55 {

	public static void main(String[] args) {
		String str="AksHay RajPut";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}
		System.out.println("Capital letters in string: " +count);
	}

}

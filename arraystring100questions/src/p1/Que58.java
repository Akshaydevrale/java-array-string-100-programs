package p1;

//Count digits in string

public class Que58 {

	public static void main(String[] args) {
		String str="Akshay45";
		int count=0;
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9'){
				count++;
			}
		}
		System.out.println("Digits in string: "+count);
	}

}

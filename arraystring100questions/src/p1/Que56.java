package p1;

//Swap First and Last Characters

public class Que56 {

	public static void main(String[] args) {
		String str="Akshay";
		char ch[]=str.toCharArray();
		
		char temp=ch[0];
		ch[0]=ch[str.length()-1];
		ch[str.length()-1]=temp;
		
		String swap="";
		
		for(int i=0;i<str.length();i++) {
			swap=swap+ch[i];
		}
		System.out.println(swap);
		
	}

}

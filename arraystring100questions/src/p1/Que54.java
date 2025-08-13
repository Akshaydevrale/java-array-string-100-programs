package p1;

//find the largest word in string

public class Que54 {

	public static void main(String[] args) {
		String str="My name is akshay";
		String[]word=str.split(" ");
		String largest="";
		
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>largest.length()) {
				largest=word[i];
			}
		}
		System.out.println(largest);
	}

}

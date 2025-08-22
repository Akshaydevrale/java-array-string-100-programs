package p1;

//code to count Words in a Sentence

public class Que73 {

	public static void main(String[] args) {
		String str="Java is a simple language";
		int words=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				words++;
			}
		}
		System.out.println("Total words:"+words);
	}

}

package p1;

//Print each word of string in new line

public class Que53 {

	public static void main(String[] args) {
		String str="Akshay Rajput";
		String[] words=str.split(" ");
		
		for(String word:words) {
			System.out.println(word);
		}
	}

}

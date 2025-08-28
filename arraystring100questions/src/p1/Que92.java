package p1;

//Reverse words in a sentence

public class Que92 {
	public static void main(String[] args) {
		String str = "Java makes programming easy";
		String[] word = str.split(" ");
		String reverse = "";
		
		for(int i=word.length-1; i>=0; i--) {
			reverse = reverse + word[i] + " ";
		}
		System.out.println(reverse);
	}

}

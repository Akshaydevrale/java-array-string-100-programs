package p1;

//Find the longest word in a string

public class Que91 {
	public static void main(String[] args) {
		String str = "Java makes programming easy";
		String [] word = str.split(" ");
		String longest = word[0];
		
		for(int i=0; i<word.length; i++) {
			if(word[i].length() > longest.length()) {
				longest = word[i];
			}
		}
		System.out.println("Logest Word: "+longest);
	}

}

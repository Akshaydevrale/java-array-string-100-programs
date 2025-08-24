package p1;

// Remove all digits from a string

public class Que80 {
	public static void main(String[] args) {
		String str = "Java12345";
		
		str.replaceAll("[0-9]", "");
		
		System.out.println("String Without Digits: "+str);
	}

}

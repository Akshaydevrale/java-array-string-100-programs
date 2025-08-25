package p1;

// find common characters between two strings

public class Que84 {
	public static void main(String[] args) {
		String a = "akshay";
		String b = "kunal";
		
		char[] arrA = a.toCharArray();
		char[] arrB = b.toCharArray();
		
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrB.length; j++) {
				if(arrA[i] == arrB[j]) {
					System.out.println(arrA[i]);
				}
			}
		}
	}

}

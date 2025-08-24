package p1;

// Split a string into words using comma

public class Que75 {
	public static void main(String[] args) {
		String str = "Apple,Banana,Mango";
		String[] fruits = str.split(",");
		
		for(int i=0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
	}

}

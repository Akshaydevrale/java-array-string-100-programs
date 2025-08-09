package p1;

//Print ASCII of Each Element of char

public class Que31 {

	public static void main(String[] args) {
		char []ch= {'a','b','@','#','*','A','B'};
		
		for(int i=0;i<ch.length;i++) {
			System.out.println("ASCII value of "+ch[i]+" is :"+(int)ch[i]);
		}
	}

}

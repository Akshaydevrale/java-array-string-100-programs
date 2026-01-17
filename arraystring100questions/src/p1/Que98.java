package p1;

//Program to check whether a string starts with a given substring
//Without using built-in startsWith() method

public class Que98 {
	public static void main(String [] args) {
		String str="Akshay Devrale";
		String start="Akshay";
		boolean result=true;
		
		for(int i=0;i<start.length();i++) {
			if(str.charAt(i)!=start.charAt(i)) {
				result=false;
				break;
			}
		}
		if (result) {
            System.out.println("String starts with: " + start);
        } else {
            System.out.println("String does not start with: " + start);
        }
	}
}

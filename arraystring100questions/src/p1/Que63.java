package p1;

//Check if a String Has Repeated Characters

public class Que63 {

	public static void main(String[] args) {
		String str="akshay";
		boolean repeat=false;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(i!=j && ch==str.charAt(j)) {
					repeat=true;
					break;
				}
			}
		}
		if(repeat) {
			System.out.println("Repeat");
		}else {
			System.out.println("Not repeat");
		}
		
	}

}

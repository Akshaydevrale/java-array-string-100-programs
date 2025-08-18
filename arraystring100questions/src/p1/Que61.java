package p1;

//Compare Two Strings (Manual Comparison)

public class Que61 {

	public static void main(String[] args) {
		String a="Akshay";
		String b="Akshay";
		boolean compare=true;
		
		if(a.length()!=b.length()) {
			compare=false;
		}else {
			for(int i=0;i<a.length();i++) {
				if (a.charAt(i) != b.charAt(i)) {
					compare = false;
					break;
				}
			}
		}
		if(compare) {
			System.out.println("String is equal");
		}else {
			System.out.println("String is not equal");
		}
		
	}

}

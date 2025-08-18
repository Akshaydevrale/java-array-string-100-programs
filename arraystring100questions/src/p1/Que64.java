package p1;

//convert lowercase into uppercase and uppercase into lowercase

public class Que64 {
	public static void main(String[] args) {
		String str = "AkshAy RajPuT";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				res = res + Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				res = res + Character.toLowerCase(ch);
			}
		}
		System.out.println(res);
	}

}

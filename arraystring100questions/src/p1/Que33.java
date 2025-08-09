package p1;

//Print All Elements Until a Negative Number is Found

public class Que33 {

	public static void main(String[] args) {
		int[]num= {2,5,6,4,-6,3,1,7};
		
		for(int i:num) {
			if(i<0) {
				break;
			}
			System.out.println(i);
		}
	}

}

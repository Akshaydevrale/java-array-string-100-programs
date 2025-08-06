package p1;

//Code to find maximum number from array

public class Que3 {

	public static void main(String[] args) {
		int num[]= {4,6,3,1,9,5,2};
		int max = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);
	}
}

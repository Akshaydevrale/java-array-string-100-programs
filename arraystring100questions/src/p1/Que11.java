package p1;

//Code for print Positive and Negative numbers from array

public class Que11 {

	public static void main(String[] args) {
		int num[]= {-8,3,-3,-6,4,2,-2,-7,3,6,-9};
		
		System.out.println("Positive numbers: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]>0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("Negative numbers: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]<=0) {
				System.out.println(num[i]);
			}
		}
	}
}

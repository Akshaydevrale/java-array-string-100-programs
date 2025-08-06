package p1;

//Code for print all even and odd numbers form array

public class Que5 {

	public static void main(String[] args) {
		int num[]= {43,45,43,3,4,56,7,78,94,38};
		int even=0;
		
		System.out.println("Even numbers from array: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		
		System.out.println("Odd numbers from array: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
	}

}

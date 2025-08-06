package p1;

//Code to copy all array element into another array

public class Que16 {

	public static void main(String[] args) {
		int num[]= {3,56,5,7,86,9,45};
		int copy[]=new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			copy[i]=num[i];
		}
		System.out.println("Elements are copied: ");
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}
	}

}

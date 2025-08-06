package p1;

//Code for print the numbers from array which are greater than 50

public class Que8 {

	public static void main(String[] args) {
		int num[]= {74,34,1,57,12,3,84,99,23};
		
		System.out.println("Numbers greate than 50: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]>50) {
				System.out.println(num[i]);
			}
		}
	}

}

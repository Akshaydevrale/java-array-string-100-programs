package p1;

//Code to find the minimum number from array

public class Que4 {

	public static void main(String[] args) {
		int num[]= {6,5,2,3,7,8};
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(min);
	}

}

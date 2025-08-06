package p1;

//Code for count positive and negative numbers from array

public class Que10 {

	public static void main(String[] args) {
		int num[]= {2,-2,5,-6,4,-7,3,-5,0};
		int positive=0;
		int negative=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>0) {
				positive++;
			}
		}
		System.out.println("Total positive numbers:"+positive);
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<=0) {
				negative++;
			}
		}
		System.out.println("Total negative numbers: "+negative);
	}

}

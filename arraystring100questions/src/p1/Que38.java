package p1;

//Swap First and Last Element in array

public class Que38 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		
		int temp=num[0];
		num[0]=num[num.length-1];
		num[num.length-1]=temp;
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}

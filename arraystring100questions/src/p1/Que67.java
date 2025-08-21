package p1;

//sum of all positive numbers and negative numbers

public class Que67 {

	public static void main(String[] args) {
		int arr[]= {10,-9,-4,3,7,-2,8,4,-6};
		int positive=0;
		int negative=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive=positive+arr[i];
			}else {
				negative=negative+arr[i];
			}
		}
		System.out.println(positive);
		System.out.println(negative);
	}

}

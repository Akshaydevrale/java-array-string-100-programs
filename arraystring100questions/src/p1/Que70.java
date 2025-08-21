package p1;

//multiply all positive numbers and make addition of all negative numbers by itself

public class Que70 {

	public static void main(String[] args) {
		int arr[]= {10,-9,-4,5,-6,3,8};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr[i]=arr[i]*arr[i];
			}else {
				arr[i]=arr[i]+arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

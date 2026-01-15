package p1;

//Program to check an array is sorted or not

public class Que95 {
	public static void main(String [] args) {
		int arr[]= {1,2,3,5,6};
		boolean sorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
		}
		if(sorted) {
			System.out.print("Array is sorted");
		}else {
			System.out.print("Array is not sorted");
		}
	}
}

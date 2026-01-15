package p1;

//Program to convert negative elements of an array to positive

public class Que97 {
	public static void main(String [] args) {
		int arr[]= {1,-2,-3,4,5,-6,7};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=-arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

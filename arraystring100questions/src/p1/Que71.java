package p1;

// code for converting all positive numbers into negative and all negative numbers into positive

public class Que71 {

	public static void main(String[] args) {
		int arr[]= {3,-4,7,-3,9,2,-5};
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-arr[i];
			System.out.println(arr[i]);
		}
	}

}

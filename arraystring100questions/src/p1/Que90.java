package p1;

//Find second largest number

public class Que90 {
	public static void main(String[] args) {
		int [] arr = {7,3,2,6,5};
		int largest = arr[0];
		int second = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != largest) {
				if(second == largest || arr[i] > second) {
					second = arr[i];
				}
			}
		}
		System.out.println("Second largest number: "+second);
	}

}

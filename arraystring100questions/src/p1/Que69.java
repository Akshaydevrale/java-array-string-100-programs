package p1;

//print only numbers between 10 to 20

public class Que69 {

	public static void main(String[] args) {
		int arr[]= {4,11,45,23,17,13,20,99};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=10 && arr[i]<=20) {
				System.out.println(arr[i]);
			}
		}
	}

}

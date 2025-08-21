package p1;

//multiply even numbers with 3 and odd numbers with 2 and print the array

public class Que68 {

	public static void main(String[] args) {
		int arr[]= {4,2,8,4,9,1};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=arr[i]*3;
			}else {
				arr[i]=arr[i]*2;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

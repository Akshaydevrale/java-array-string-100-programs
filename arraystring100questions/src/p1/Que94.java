package p1;

public class Que94 {
	public static void main(String [] args) {
		int arr[]= {1,2,3,2,1,4,5,8,6};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=0;
			}
			System.out.print(arr[i]+" ");
		}
		
	}
}
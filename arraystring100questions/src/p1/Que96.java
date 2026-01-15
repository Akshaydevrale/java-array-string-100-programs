package p1;

//Program to print unique elements from an array

public class Que96 {
	public static void main(String [] args) {
		int arr[]= {1,2,2,3,4,5,5,5,6};
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
				}
			}
			if(!duplicate) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

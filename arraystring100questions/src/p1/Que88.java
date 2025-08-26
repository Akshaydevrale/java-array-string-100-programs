package p1;

//Move all zeros to the end

public class Que88 {
	public static void main(String[] args) {
		int [] arr = { 8, 0, 4, 0, 0, 5, 9,};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

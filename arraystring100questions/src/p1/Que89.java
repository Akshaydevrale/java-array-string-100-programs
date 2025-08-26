package p1;

//check is array are sorted ?

public class Que89 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,8,5};
		boolean sorted = true;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[i+1]) {
				sorted = false;
				break;
			}
		}
		System.out.println("Sorted: "+sorted);
	}

}

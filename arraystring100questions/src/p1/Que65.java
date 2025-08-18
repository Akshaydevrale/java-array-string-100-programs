package p1;

//convert numbers positive into negative and negative into positive

public class Que65 {
	public static void main(String[] args) {
		int []arr= {10,-9,2,-5,-4,6,8};
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

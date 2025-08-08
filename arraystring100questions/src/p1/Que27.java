package p1;

//Add two arrays element by element

public class Que27 {

	public static void main(String[] args) {
		int num1[]= {1,2,3,4};
		int num2[]= {1,2,3,4};
		int[] sum = new int[num1.length];
		
		for(int i=0;i<num1.length;i++) {
			sum[i]=num1[i]+num2[i];
		}
		System.out.println("Elements added one by one:");
		for(int i=0;i<sum.length;i++) {
			System.out.println(sum[i]);
		}
	}

}

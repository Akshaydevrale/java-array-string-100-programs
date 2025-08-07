package p1;

//Sort array in ascending order

public class Que25 {

	public static void main(String[] args) {
		int num[]= {7,4,3,9,2,8};
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array in asscending order:");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}

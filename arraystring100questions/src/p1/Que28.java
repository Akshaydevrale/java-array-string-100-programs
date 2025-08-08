package p1;

//Change the value of 0 into 1 from array

public class Que28 {

	public static void main(String[] args) {
		int []num= {0,0,5,0,2,8};
		
		for(int i=0; i<num.length;i++) {
			if(num[i]==0) {
				num[i]=1;
			}
		}
		System.out.println("Element changes from 0 to 1: ");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}

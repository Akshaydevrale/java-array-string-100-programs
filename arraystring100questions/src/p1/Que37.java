package p1;

//Copy Even Numbers into New Array

public class Que37 {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int copy[]=new int[num.length];
		int count=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				copy[count++]=num[i];
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(copy[i]);
		}
	}

}

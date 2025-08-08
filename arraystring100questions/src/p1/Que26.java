package p1;

//Print sum of even indexed elements

public class Que26 {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,8};
		int sum = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				sum=sum+num[i];
			}
		}
		System.out.println(sum);
	}

}

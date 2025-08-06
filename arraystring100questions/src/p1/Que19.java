package p1;

//print the numbers of divisible by 3 in array

public class Que19 {

	public static void main(String[] args) {
		int num[]= {3,27,40,11,9,23,56,30};
		int count=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%3==0) {
				System.out.println(num[i]);		
			}
		}
	}

}

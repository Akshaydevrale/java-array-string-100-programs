package p1;

//Find numbers between 20 to 40 from array

public class Que20 {

	public static void main(String[] args) {
		int num[]={3,64,23,34,47,31,88,21};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>20 && num[i]<40) {
				System.out.println(num[i]);
			}
		}
	}

}

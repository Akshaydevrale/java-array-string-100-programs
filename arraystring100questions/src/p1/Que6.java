package p1;

//Code for count the even numbers from the array

public class Que6 {

	public static void main(String[] args) {
		int num[]= {5,74,84,24,77,91,8,96,38,6};
		int even=0;
		int odd=0;
		
		System.out.println("Total even numbers: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even++;
			}
		}
		System.out.println(even);

		System.out.println("Total odd numbers: ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				odd++;
			}
		}
		System.out.println(odd);
	}

}

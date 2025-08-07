package p1;

//Find pair of numbers whose sum is 50

public class Que23 {

	public static void main(String[] args) {
		int num[]= {10,20,30,40};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==50) {
					System.out.println(num[i]+"+"+num[j]+": 50");
				}
			}
		}
	}

}

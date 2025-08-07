package p1;

//Find duplicate

public class Que22 {

	public static void main(String[] args) {
		int num[]= {2,3,4,2,5,3,6,7};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
					break;
				}
			}
		}
	}

}

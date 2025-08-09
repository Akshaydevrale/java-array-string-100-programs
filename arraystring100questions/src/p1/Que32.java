package p1;

//Replace All Values Greater Than 50 with 0

public class Que32 {

	public static void main(String[] args) {	
		int[]num= {43,62,4,85,2,33,54};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>50) {
				num[i]=0;
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}

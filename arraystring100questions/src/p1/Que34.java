package p1;

//Replace Every Element with Its Square

public class Que34 {

	public static void main(String[] args) {
		int []num= {2,3,4,5};
		
		for(int i=0;i<num.length;i++) {
			num[i]=num[i]*num[i];
		}
		for(int i:num) {
			System.out.println(i);
		}
	}

}

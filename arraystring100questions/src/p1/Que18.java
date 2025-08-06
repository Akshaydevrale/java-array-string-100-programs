package p1;

//find the cube of all elements of array

public class Que18 {

	public static void main(String[] args) {
		int num[]=new int[3];
		num[0]=2;
		num[1]=4;
		num[2]=6;
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Cube of:"+num[i]+"="+(num[i]*num[i]*num[i]));
		}
	}

}

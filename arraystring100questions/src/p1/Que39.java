package p1;

//Find Index of Maximum Element

public class Que39 {

	public static void main(String[] args) {
		int []num= {4,2,3,6,9,8,1};
		int max=num[0];
		int index=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
				index=i+1;
			}
		}
		System.out.println(index);
	}

}

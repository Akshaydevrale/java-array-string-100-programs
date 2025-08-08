package p1;

//Count Elements Greater Than Average

public class Que30 {

	public static void main(String[] args) {
		int []num= {50,100,150,200};
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		int average=sum/num.length;
		System.out.println("Average: "+average);
		
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>average) {
				count++;
			}
		}
		System.out.println("Elements greater than average: "+count);
	}

}

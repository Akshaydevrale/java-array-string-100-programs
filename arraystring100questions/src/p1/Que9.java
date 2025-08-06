package p1;

//Code for average salary

public class Que9 {

	public static void main(String[] args) {
		int salary[]= {100,100,200,200};
		int sum=0;
		
		for(int i=0;i<salary.length;i++) {
			sum=sum+salary[i];
		}
		int average=sum/salary.length;
		System.out.println("Average salary: "+average);
	}

}

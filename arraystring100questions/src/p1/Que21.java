package p1;

//Find the index of specific number

public class Que21 {

	public static void main(String[] args) {
		int num[]= {23,53,6,4,3,5,7,4};
		int search=1;
		int index=-1;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==search) {
				index=i;
				break;
			}
		}
		if(index != -1) {
			System.out.println("Index is: "+index);
		}else {
			System.out.println("Number not found in array:"+search);
		}
	}

}

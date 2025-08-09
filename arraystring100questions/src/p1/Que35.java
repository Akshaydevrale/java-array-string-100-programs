package p1;

//Remove Duplicates and Print Unique Elements

public class Que35 {

	public static void main(String[] args) {
		int num[]= {1,2,2,3,4,4,5};
		
		for(int i=0;i<num.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					duplicate=true;
				}
			}
			if(duplicate==false) {
				System.out.println(num[i]);
			}
		}
		
	}

}

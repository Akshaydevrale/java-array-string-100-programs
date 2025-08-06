package p1;

import java.util.Scanner;

//Code to check the number are exists or not in array

public class Que14 {

	public static void main(String[] args) {
		int arr[]= {5,3,65,23,75,8,99,6,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to search: ");
		int num=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				found=true;
			}
		}
		if(found) {
			System.out.println("Number is exists: ");
		}else {
			System.out.println("Number is not exists: ");
		}
	}

}

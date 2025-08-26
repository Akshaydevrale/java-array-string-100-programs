package p1;

import java.util.Arrays;

// sort array in ascending order

public class Que87 {
	public static void main(String[] args) {
		int[] arr = { 8, 4, 7, 2, 5 };

		Arrays.sort(arr);

		System.out.println("Sorted array: "+arr);
		for (int x : arr)
			System.out.println(x);
	}

}

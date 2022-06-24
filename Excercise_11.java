package Week_1;

import java.util.Arrays;
import java.util.Random;

public class Excercise_11 {
	public static int[] subArray(int[] arr, int qty) {
		Random r = new Random();
		int[] result = new int[qty];
		if(qty<arr.length) {
			for (int i = 0; i < result.length; i++) {
				int randomValue= r.nextInt(arr.length);
				result[i] = arr[randomValue];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int array[]= {3,2,1,5,7};
		int qty = 4;
		System.out.println(Arrays.toString(subArray(array, qty)));
	}
}

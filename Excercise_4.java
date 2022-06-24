package Week_1;

import java.util.Arrays;

public class Excercise_4 {
	public static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[] c;
		c=arr1.length>arr2.length?arr1:arr2;
		for (int i = 0; i < Math.min(arr1.length,arr2.length); i++) {
			c[i]=arr1[i]+arr2[i];
		}
		return c;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {2,5,2,3};
		System.out.println(Arrays.toString(arrayPlus(a,b)));
	}
	
}

package Week_1;

import java.util.Arrays;

public class Excercise_10 {
	public static int[] sapXepGiamDan(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int temp=0;
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
					
			}
		}
		return array;
	}
public static int[] sapXepTangDan(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int temp=0;
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
					
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array= {2,1,6,7};
		System.out.println(Arrays.toString(sapXepGiamDan(array)));
		System.out.println(Arrays.toString(sapXepTangDan(array)));
		
	}
}

package Week_1;

public class Excercise_17 {
	public static int maxSum(int[] array) {
		int max = findMaxItem(array);
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==max)
				count++;
			continue;}
		return count*max;
		
	}
	
 public static int findMaxItem(int[] array) {
	 int max= Integer.MIN_VALUE;
	 for (int i = 0; i < array.length; i++) {
		if(array[i]>max) {
			max=array[i];
		}
	}
	return max;
 }
 public static int findMinItem(int[] array) {
	 int min= Integer.MAX_VALUE;
	 for (int i = 0; i < array.length; i++) {
		if(array[i]<min) {
			min=array[i];
		}
	}
	return min;
 }
 public static int findFirstIndexOfMaxArray(int[] array) {
	 int max=findMaxItem(array);
	 int result = 0;
	 for (int i = 0; i < array.length; i++) {
		if (array[i]==max) {
			result=i;
			break;}
		else
		continue;
	}
	return result;
 }
 
 public static void main(String[] args) {
	int[] array= {1,50,60,60,60,8};
	System.out.println(findMaxItem(array));
	System.out.println(findMinItem(array));
	System.out.println(findFirstIndexOfMaxArray(array));
	System.out.println(maxSum(array));
}
}

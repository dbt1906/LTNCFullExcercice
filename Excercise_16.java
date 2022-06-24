package Week_1;

public class Excercise_16 {
	public static boolean checkSubArray(int[] superArray, int[] subArray) {
		int i =0;//super
		int j=0;//sub
		while(i<superArray.length&&j<superArray.length)
			if(superArray[i]==subArray[j]) {
				i++;
				j++;
			if(j==subArray.length) {
			return true;}}
				else{
					i=i-j+1;
					j=0;}
		return false;
						}
	public static void main(String[] args) {
		int[] superArray= {5,7,1,3,8,9};
		int[] subArray= {7,1,3};
		int[] subArray2= {5,6,1,3};
		System.out.println(checkSubArray(superArray, subArray ));
		System.out.println(checkSubArray(superArray, subArray2 ));
	}
}

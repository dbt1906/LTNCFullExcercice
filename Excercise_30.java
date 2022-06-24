package Week_1;

public class Excercise_30 {
	public static double giaiThua(int x) {
		double result=1;
		for (int i = 1; i <=  x; i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(giaiThua(6));
	}
}

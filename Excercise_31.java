package Week_1;

public class Excercise_31 {
	// cau a
	public static int tong(int number) {
		int result =0;
		for (int i = 0; i < number; i++) {
			result+=i;
		}
		return result;
	}
	// cau b
	public static double giaiThua(int x) {
		double result=1;
		for (int i = 1; i <=  x; i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(tong(5));
		System.out.println(giaiThua(5));
		
	}
}

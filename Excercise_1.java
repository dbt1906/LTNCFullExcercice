package Week_1;

import java.util.Scanner;

public class Excercise_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();
		System.out.println(round(number));
	}

	private static int round(double number) {
		int i =(int) number;
		double l = number-i;
		if(l*10 < 5) {
			return i;
		}else {
			return i+1;
		}
	}
}

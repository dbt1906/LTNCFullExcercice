package Week_1;

import java.util.Scanner;

public class Excercise_27 {
	public static void average() {
		int count = 0;
		double total=0;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Moi nhap so nguyen duong: ");
			int number = sc.nextInt();
			count++;
			total+=number;
			if(number==0) {
				break;
			}
		}
		result=total/count;
		System.out.println("Ban da nhap "+count+" lan");
		System.out.println("Gia tri trung binh cua cac so la "+result);
	}
	public static void main(String[] args) {
		average();
	}
}

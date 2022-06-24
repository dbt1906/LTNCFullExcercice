package Week_1;

import java.util.Random;
import java.util.Scanner;

public class Excercise_7 {
	public static void main(String[] args) {
		Random r=new Random();
		int kq=r.nextInt(99)+1;
		Scanner s= new Scanner(System.in);
		System.out.println("Moi ban doan 1 con so tu 1-100");
		int count =0;
		while(true) {
			int guess=s.nextInt();
			
			if (guess>kq) {
				System.out.println("So ban doan lon hon ket qua");
				count++;}
				else if (guess<kq) {
				System.out.println("So ban doan nho hon ket qua");
				count++;}
				else {
					System.out.println("Chuc mung ban da chien thang voi con so "+kq+"\n So lan doan cua ban la "+count);
					break;
				}
				}
			}
		}


package Week_1;

public class Excercise_2 {
	public static void checkChanLe(int number) {
		if (number%2==1)
			System.out.println(number+" la so le");
		else if (number%2==0)
			System.out.println(number+": la so chan");
		else 
			System.out.println("Da xay ra loi");
	}
	public static void checkSoNT(int number) {
		int count=0;
		for (int i=1; i<= number;i++) {
			if (number%i==0)
				count++;}
		if (number==1)
			System.out.println(number+" khong phai la so nguyen to");
		else if (count >2)
			System.out.println(number+" khong phai la so nguyen to");
		else 
			System.out.println(number+" la so nguyen to");
		
	}
	public static boolean checkNT(int number) {
		int count=0;
		for (int i=1; i<= number;i++) {
			if (number%i==0)
				count++;}
		if (count >2)
			return false;
		else 
			return true;
		
	}
	public static void main(String[] args) {
		checkChanLe(5); 
		checkSoNT(13);
	}
}

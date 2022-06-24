package Week_1;

public class Excercise_5 {
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
	public static void inSoNT(int a,int b) {
		int count =0;
		while(count!=b) {
			if(checkNT(++a)) {
				System.out.print(a+" ");
				count++;
		}
	}
}
	public static void main(String[] args) {
		inSoNT(15, 5);
	}
}
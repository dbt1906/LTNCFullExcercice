package Week_1;

public class Excercise_29 {
	public static void giaiPTB2(int a , int b, int c) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo nghiem");}
				else
					System.out.println("Phuong trinh co 1 nghiem la x ="+(-c/b));
			}
		double detal = b*b - 4*a*c;
		double x1;
		double x2;
		if(detal>0) {
			x1 = ((-b+Math.sqrt(detal))/(2*a));
			x2 = ((-b-Math.sqrt(detal))/(2*a));	
			 System.out.println("Phuong trinh co 2 nghiem la: "
	                    + "x1 = " + x1 + " va x2 = " + x2);
		}
		else if(detal==0) {
			x1 =(-b/(2*a));
			 System.out.println("Phuong trinh co nghiem kep: "
	                    + "x1 = x2 = " + x1);
		}
		else
			System.out.println("Phuong trinh vo nghiem");
	}
	public static void main(String[] args) {
		giaiPTB2(2,1,-1);
	}
}

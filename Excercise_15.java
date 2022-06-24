package Week_1;

public class Excercise_15 {
	public static  double a (int n, double x) {
		double p=1;
		for (int i = 1; i < n; i++) {
			p=p+x*i;
		}
		return p;
	}
public static double b(int n, double x) {
	double p=1;
	for (int i = 1; i <= n; i++) {
		if(i%2!=1)
			p=p+x*i;
		else
		p=p-x*i;
	}
	return p;
	}
public static double giaiThua(int x) {
	double result=1;
	for (int i = 1; i <=  x; i++) {
		result*=i;
	}
	return result;
}
public static double luyThua(double x, int n) {
	double p=1;
	for (int i = 0; i < n; i++) {
		p*=x;
	}
	return p;
}
public static double c(int n, double x) {
	double p=1;
	for (int i = 1; i <= n; i++) {
		p+=(luyThua(x, i))/(giaiThua(i));
	}
	return p;
}
	public static void main(String[] args) {
		System.out.println(a(4,2));
		System.out.println(b(4,2));
		System.out.println(c(4,2));
		System.out.println(giaiThua(5));
		System.out.println(luyThua(5,5));
	}
	
	
}

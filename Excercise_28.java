package Week_1;

public class Excercise_28 {
	public static void count() {
		int number =100;
		int count1 =0;
		String result1="";
		String result2="";
		String result3="";
		String result4="";
		String result5="";
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int count5 =0;
		for (int i =1 ; i <= number; i++) {
			if(i%5==0) {
				result1+=i+" ";
				count1++;
			}
			if(i%5==1) {
				result2+=i+" ";
				count2++;
			}
			if(i%5==2) {
				result3+=i+" ";
				count3++;}
			if(i%5==3) {
				result4+=i+" ";
				count4++;}
			if(i%5==4) {
				result5+=i+" ";
				count5++;}
		}
		System.out.println(number);
		System.out.println("Co "+count1+" so chia het cho 5: "+result1);
		System.out.println("Co "+count2+" so chia cho 5 du 1: "+result2);
		System.out.println("Co "+count3+" so chia cho 5 du 2: "+result3);
		System.out.println("Co "+count4+" so chia cho 5 du 3: "+result4);
		System.out.println("Co "+count5+" so chia cho 5 du 4: "+result5);
		
	}
	public static void main(String[] args) {
		count();
	}
}

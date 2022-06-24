package Week_1;

import java.util.Arrays;

public class Excercise_9 {
	public static String addChar(String str,char ch,int p) {
		return str.substring(0, p)+ch+str.substring(p);
	}
	
	public static String doiSo(int num) {
		String Stringnum=String.valueOf(num);
		int count=1;
		String newString="";
		for (int i = Stringnum.length()-1; i >=0; i--) {
			count++;
			if (count==3) {
				if (i>1) {
				count=0;
				Stringnum=addChar(Stringnum,',',i-1);
				}
		}
	
	}
		return Stringnum;}
	public static void main(String[] args) {
	System.out.println(doiSo(1000000200));
		
	}
}

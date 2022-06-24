package Week_1;

import java.util.Arrays;

public class Excercise_14 {
	
	public static String toStringEn(char[][] array) {
		char[] result=new char[array.length*array[0].length];
		int count=0;
		for (int j = 0; j <array[0].length; j++) {
		for (int i = 0; i <array.length; i++) {
			if (array[i][j]==' ') {
				array[i][j]='-';}
			 				result[count++]=array[i][j];
			}
		}
		String newString=String.valueOf(result);
		return newString;
	}
	public static String toStringDe(char[][] array) {
		char[] result=new char[array.length*array[0].length];
		int count=0;
		for (int i = 0; i <array.length; i++) {
		for (int j = 0; j <array[0].length; j++) {
			if (array[i][j]=='-') {
				array[i][j]=' ';}
			 				result[count++]=array[i][j];
			}
		}
		String newString=String.valueOf(result);
		return newString;
	}
	public static String decrypt(String matMa, int cot) {
		char[] charArray=matMa.toCharArray();
		int hang =matMa.length()%cot>1?matMa.length()/cot+1:matMa.length()/cot;
		char[][] result = new char[hang][cot];
		int count =0;
		for (int j = 0; j < result[0  ].length; j++) {
			for (int i = 0; i < result.length; i++) {
				if (result[i][j]==' ') {
					result[i][j]='-';}
				 				result[i][j]=charArray[count++];
				}
			}
			
			return toStringDe(result);
	}
	
 public static String encrypt(String matMa,int cot) {
	 char[] charArray=matMa.toCharArray();
	 int hang =matMa.length()%cot>1?matMa.length()/cot+1:matMa.length()/cot;
	 char[][] result=new char[hang][cot];
	 int count =0;
	 for (int i = 0; i < result.length; i++) {
		for (int j = 0; j < result[i].length;j++) {
			
			if (count==matMa.length()) {
				
				 result[i][j]='-';
			}
			else
				
			result[i][j]=charArray[count++];
			
			
		}
	}
	
	 return toStringEn(result);
 }
 public static void main(String[] args) {
	String matThu="I am student";
	int key =5;
	String encrypted=encrypt(matThu,key);
	String decrypted=decrypt(encrypted,key);
	System.out.println("Mat thu:"+matThu+"\nKhoa:"+key);
	System.out.println("Sau khi ma hoa ==>"+ encrypted);
 	System.out.println("Sau khi giai ma ==>"+decrypted);
}
}

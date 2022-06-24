package Week_1;

import java.util.Iterator;

public class Excercise_18 {
	public static int[][] triangleMatrix(int rows){
		int[][] result=new int[rows][];
		for (int i = 0; i < rows; i++) {
			result[i]=new int[i+1];
			for (int j = 0; j <= i; j++) {
				result[i][j]=1;
			}
		}
			
		return result;
	}
	public static int[][] plusMatrix(int[][] matrixA,int[][] matrixB){
		int[][] result = new int[matrixA.length][matrixA[0].length];
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				result[i][j]=matrixA[i][j]+matrixB[i][j];
				
			}
			
		}
		return result;
	}
	public static boolean isMultiplyMatrixValid(int [][] matrixA,int[][] matrixB){
		if(matrixA[0].length==matrixB.length)
			return true;
		else
		return false;
		
	}
	public static int[][] multiplyMatrix(int [][] matrixA,int[][] matrixB){
		int[][] result= new int[matrixA.length][matrixB[0].length];
		if(isMultiplyMatrixValid(matrixA,matrixB)) {
			for (int i = 0; i < matrixA.length; i++) {
				for (int j = 0; j < matrixB[0].length; j++) {
					result[i][j]=0;
					for(int k =0 ;k<matrixA[0].length;k++) {
						result[i][j]=result[i][j]+matrixA[i][k]*matrixB[k][j];
					}
				}
				
			}
			return result;
		}
		System.out.println("sai");
		return result;
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	//	printMatrix(triangleMatrix(5));
		int[][] matrixA= {{2,1,3},{1,5,2}};
		int[][] matrixB= {{3,2,3},
						{6,15,2},
						{1,6,2}};
		int[][] matrixC= {{3,2,3},
				{6,15,2}};
		printMatrix(plusMatrix(matrixA, matrixC));
		printMatrix(multiplyMatrix(matrixA, matrixB));
		
	}
}

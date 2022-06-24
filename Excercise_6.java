package Week_1;
public class Excercise_6 {
	// a
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	// b
	public static int[][] createPascalTriangle(int size){
		int[][] result = new int[size][];
		for (int i = 0; i < result.length; i++) {
			result[i]= new int[i+1];
			for (int j = 0; j < result[i].length; j++) {
				result[i][j]=j+1;
			}
		}
		return result;
	}
	// c
	public static int[][] createPascalTriangle(int[] diagonalValues){
		int[][] result = new int[diagonalValues.length][];
		for (int i = 0; i < result.length; i++) {
			result[i]= new int[i+1];
			for (int j = i; j >=0; j--) {
				if(i==j) {
					result[i][j]=diagonalValues[i];
				}
				else
					result[i][j]=result[i][j+1]-1;
				
			}
		}
		return result;
		
	}
public static void main(String[] args) {
	int[][] matrix = {{1,2,3},{3,2,1},{1,4,2}};
	int[] array= {1,5,2,0};
	printMatrix(matrix);
	printMatrix(createPascalTriangle(3));
	printMatrix(createPascalTriangle(array));
}
}

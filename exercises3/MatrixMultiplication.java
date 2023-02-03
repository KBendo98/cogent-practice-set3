package exercises3;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] m1 = {{3, -9, -8}, {2, 4, 3}};
	    int[][] m2 = {{7, -3}, {-2, 3}, {6, 2}};
	    int[][] mul = matrixMultiply(m1, m2);
	    for (int i = 0; i < mul.length; i++) {
	      for (int j = 0; j < mul[0].length; j++) {
	        System.out.print(mul[i][j] + " ");
	      }
	      System.out.println();
	    }
	}
	
	public static int[][] matrixMultiply(int[][] m1, int[][] m2){
		// First matrix dimensions
		int rows1 = m1.length;
		int cols1 = m1[0].length;
		
		// Second matrix dimensions
		int rows2 = m2.length;
		int cols2 = m2[0].length;
		
		// Condition for being able to multiply two matrices
		if(cols1 == rows2) {
			int[][] result = new int[rows1][cols2];
			
			for(int i=0; i<rows1; i++) 
				for(int j=0; j<cols2; j++)
					for(int k=0; k<cols1; k++)
						result[i][j]+= m1[i][k] * m2[k][j];
			
			return result;
		}
		
		// Else unable to multiply
		return null;
	}
}
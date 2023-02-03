package exercises3;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] m1 = {{1, 2, 0}, {4, 7, 3}, {2, 6, 5}};
	    int[][] m2 = {{1, 3, 6}, {3, 3, 3}, {2, 2, 5}};
	    int[][] sum = addMatrices(m1, m2);
	    
	    for (int i = 0; i < sum.length; i++) {
	      for (int j = 0; j < sum[0].length; j++) {
	        System.out.print(sum[i][j] + " ");
	      }
	      System.out.println();
	    }
	}
	
	public static int[][] addMatrices(int[][] m1, int[][] m2){
		int rows = m1.length;
		int cols = m1[0].length;
		
		// If matrices have same dimensions, do addition
		if(rows == m2.length && cols == m2[0].length) {
			int result[][] = new int[rows][cols];
			
			for(int i=0; i<rows; i++)
				for(int j=0; j<cols; j++)
					result[i][j] = m1[i][j] + m2[i][j];
			
			return result;
		}
		
		// if matrices have different dimensions, can't do addition
		return null;
	}
}

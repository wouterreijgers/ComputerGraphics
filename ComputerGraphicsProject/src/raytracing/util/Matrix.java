package raytracing.util;

public class Matrix {
	int[][] matrix;
	
	public Matrix() {
		int[][] emptyMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		this.matrix = emptyMatrix;
	}
	
	public Matrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	/***
	 * Matrices can only be added together if they have the same dimensions
	 * @param b
	 * @return
	 */
	public Matrix addition(Matrix b) {
		new Logger(this.getClass().getName(), "addition", "");
		if(matrix.length != b.getMatrix().length || matrix[0].length != b.getMatrix()[0].length) {
			new Logger(this.getClass().getName(), "addition", "Dimensions do not match.");
		}

		int[][] result = new int[4][4];
		for(int i=0;i<4;i++){ 
			for(int j=0;j<4;j++){
				result[i][j] = matrix[i][j] + b.getMatrix()[i][j];
			}
		}
		return new Matrix(result);
	}
	
	/***
	 * Matrices can only be substracted if they have the same dimensions
	 * @param b
	 * @return new matrix
	 */
	public Matrix substract(Matrix b) {
		new Logger(this.getClass().getName(), "substraction", "");
		if(matrix.length != b.getMatrix().length || matrix[0].length != b.getMatrix()[0].length) {
			new Logger(this.getClass().getName(), "substraction", "Dimensions do not match.");
		}
		int[][] result = new int[4][4];
		for(int i=0;i<4;i++){ 
			for(int j=0;j<4;j++){
				result[i][j] = matrix[i][j] - b.getMatrix()[i][j];
			}
		}
		return new Matrix(result);
	}
	
	public Matrix multiplication(Matrix b) {
		new Logger(this.getClass().getName(), "substraction", "");
		if(matrix.length != b.getMatrix().length || matrix[0].length != b.getMatrix()[0].length) {
			new Logger(this.getClass().getName(), "substraction", "Dimensions do not match.");
		}
		int[][] result = new int[4][4];
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				result[i][j]=0;      
				for(int k=0;k<3;k++){      
					result[i][j]+=matrix[i][k]*b.getMatrix()[k][j];      
				} 
			}  
		} 
		return new Matrix(result);
	}
	
	
	public void printMatrix() {
		for(int i=0;i<4;i++){ 
			System.out.print("|");
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("|\n");
		}
	}
	

}

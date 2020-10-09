package raytracing.util;

public class Matrix {
	double[][] matrix;
	
	public Matrix() {
		double[][] emptyMatrix = {
				{1, 0, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 1}};
		this.matrix = emptyMatrix;
	}

	/***
	 * Get a visual representation of the matrix
	 */
	public void printMatrix() {
		for(int i=0;i<4;i++){
			System.out.print("|");
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("|\n");
		}
	}

	/***
	 * Getters and setters
	 *
	 */
	
	public Matrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public Matrix change(int x, int y, double value){
		if(x<matrix.length && y<matrix[0].length)
			matrix[x][y] = value;
		return this;
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

		double[][] result = new double[4][4];
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
		double[][] result = new double[4][4];
		for(int i=0;i<4;i++){ 
			for(int j=0;j<4;j++){
				result[i][j] = matrix[i][j] - b.getMatrix()[i][j];
			}
		}
		return new Matrix(result);
	}

	/***
	 * Matrices can be multiplied. in this code its "this x b"
	 * @param b
	 * @return
	 */
	public Matrix multiplication(Matrix b) {
		new Logger(this.getClass().getName(), "multiplication", "");
		if(matrix.length != b.getMatrix().length || matrix[0].length != b.getMatrix()[0].length) {
			new Logger(this.getClass().getName(), "substraction", "Dimensions do not match.");
		}
		double[][] result = new double[4][4];
		//multiplying and printing multiplication of 2 matrices
		for (int x = 0; x < 4; x++)
		{
			for (int y = 0; y < 4; y++)
			{
				for (int i = 0; i < 4; i++)
				{
					result[x][y] += matrix[i][y] * b.getMatrix()[x][i];
				}
			}
		}

		return new Matrix(result);
	}

	public Matrix getInverse(){


		return new Matrix();
	}

	

	

}

package raytracing.util.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import raytracing.util.Logger;
import raytracing.util.Matrix;

class MatrixTest {

	@Test
	void testMatrixSummation() {
		// Initialize two matrices to add
		int[][] aMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
		int[][] bMatrix = {{3, 0, 3, 0}, {0, 3, 2, 0}, {0, 3, 1, 0}, {0, 2, 0, 1}};
		int[][] expectedResult = {{4, 0, 3, 0}, {0, 4, 2, 0}, {0, 3, 2, 0}, {0, 2, 0, 2}};

		Matrix a = new Matrix(aMatrix);
		Matrix b = new Matrix(bMatrix);
		Matrix result = a.addition(b);
		if(compareMatrices(result, new Matrix(expectedResult)))
			assertEquals(1, 1);
		else
			assertEquals(1, 0);
	}
	
	@Test
	void testMatrixSubstraction() {
		// Initialize two matrices to add
		int[][] aMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
		int[][] bMatrix = {{3, 0, 3, 0}, {0, 3, 2, 0}, {0, 3, 1, 0}, {0, 2, 0, 1}};
		int[][] expectedResult = {{2, 0, 3, 0}, {0, 2, 2, 0}, {0, 3, 0, 0}, {0, 2, 0, 0}};

		Matrix a = new Matrix(aMatrix);
		Matrix b = new Matrix(bMatrix);
		Matrix result = b.substract(a);
		if(compareMatrices(result, new Matrix(expectedResult)))
			assertEquals(1, 1);
		else {
			new Logger(this.getClass().getName(), "testMatrixSubstraction", "Matrices do not match");
			result.printMatrix();
			new Matrix(expectedResult).printMatrix();
			assertEquals(1, 0);
		}
	}
	
	@Test
	void testMatrixMultiplication() {
		// Initialize two matrices to add
		int[][] aMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
		int[][] bMatrix = {{3, 0, 3, 0}, {0, 3, 2, 0}, {0, 3, 1, 0}, {0, 2, 0, 1}};
		int[][] expectedResult = {{2, 0, 3, 0}, {0, 2, 2, 0}, {0, 3, 0, 0}, {0, 2, 0, 0}};

		Matrix a = new Matrix(aMatrix);
		Matrix b = new Matrix(bMatrix);
		Matrix result = b.multiplication(a);
		System.out.println("A");
		a.printMatrix();
		System.out.println("B");
		b.printMatrix();
		assertEquals(true, compareMatrices(result, new Matrix(expectedResult)));
		if(!compareMatrices(result, new Matrix(expectedResult)))
			new Logger(this.getClass().getName(), "testMatrixSubstraction", "Matrices do not match");
	}
	
	
	
	public Boolean compareMatrices(Matrix a, Matrix b) {
		for(int i=0;i<4;i++){ 
			for(int j=0;j<4;j++){
				if(a.getMatrix()[i][j] != b.getMatrix()[i][j])
					return false;
			}
		}
		return true;
	}

}

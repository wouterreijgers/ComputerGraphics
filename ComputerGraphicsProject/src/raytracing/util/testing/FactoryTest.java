package raytracing.util.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import raytracing.util.Logger;
import raytracing.util.Matrix;
import raytracing.util.MatrixFactory;

class FactoryTest {

    @Test
    void testTranslation() {
        double[][] expected = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {3, 4, 8, 1}};
        Matrix translation = new MatrixFactory().translationMatrix(3, 4, 8);
        assertEquals(true, compareMatrices(translation, new Matrix(expected)));
    }

    void testScaling() {
        double[][] expected = {
                {3, 0, 0, 0},
                {0, 4, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 1}};
        Matrix translation = new MatrixFactory().scalingMatrix(3, 4, 2);
        assertEquals(true, compareMatrices(translation, new Matrix(expected)));
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


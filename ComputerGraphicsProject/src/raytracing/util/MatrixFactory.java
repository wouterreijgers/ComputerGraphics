package raytracing.util;

public class MatrixFactory {
    public Matrix translationMatrix(int x, int y, int z){
       return new Matrix()
               .change(3, 0, x)
               .change(3, 1, y)
               .change(3, 2, z);
    }

}

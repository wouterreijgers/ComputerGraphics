package raytracing.util;

public class MatrixFactory {
    public Matrix translationMatrix(int x, int y, int z){
       return new Matrix()
               .change(3, 0, x)
               .change(3, 1, y)
               .change(3, 2, z);
    }

    public Matrix scalingMatrix(int x, int y, int z){
        return new Matrix()
                .change(0, 0, x)
                .change(1, 1, y)
                .change(2, 2, z);

    }

    public Matrix rotationMatrix(String axis, double angle){
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        switch (axis)
        {
            case "X":
                return new Matrix()
                        .change(1, 1, cos)
                        .change(2, 1, -sin)
                        .change(2, 2, cos)
                        .change(2, 1, cos);
                break;
            case "Y":
                return new Matrix();
                break;
            case "Z":
                return new Matrix();
                break;
            default:
                return new Matrix();
        }

        return new Matrix()
                .change(0, 0, x)
                .change(1, 1, y)
                .change(2, 2, z);

    }

}

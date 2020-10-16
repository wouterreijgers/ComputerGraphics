package raytracing.util;

public class Point {
    double x, y, z;
    double a = 0;

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Point substract(Point point) {
        return new Point(x-point.x, y-point.y, z-point.z);
    }

    public Point multiply(Matrix matrix){
        double x1 = x*matrix.getMatrix()[0][0] + y*matrix.getMatrix()[0][1] + z*matrix.getMatrix()[0][2] + a*matrix.getMatrix()[0][3];
        double y1 = x*matrix.getMatrix()[1][0] + y*matrix.getMatrix()[1][1] + z*matrix.getMatrix()[1][2] + a*matrix.getMatrix()[1][3];
        double z1 = x*matrix.getMatrix()[2][0] + y*matrix.getMatrix()[2][1] + z*matrix.getMatrix()[2][2] + a*matrix.getMatrix()[2][3];
        double a1 = x*matrix.getMatrix()[3][0] + y*matrix.getMatrix()[3][1] + z*matrix.getMatrix()[3][2] + a*matrix.getMatrix()[3][3];
        return new Point(x1, y1, z1);

    }
}

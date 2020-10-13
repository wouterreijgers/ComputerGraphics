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
}

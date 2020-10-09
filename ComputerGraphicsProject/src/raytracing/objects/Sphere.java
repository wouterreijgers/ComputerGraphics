package raytracing.objects;

import raytracing.util.Point;
import raytracing.util.Ray;
import raytracing.util.Vector;

public class Sphere {
    Point point;
    double radius;

    public Sphere(double x, double y, double z, double radius){
        this.point = new Point(x, y, z);
        this.radius = radius;
    }

    public boolean isHit(Ray ray){
        // Calculate a discriminant
        double A = ray.getDirection().dotproduct(ray.getStart().substract(point));
        Point B = ray.getStart().substract(point);

        return true;
    }
}

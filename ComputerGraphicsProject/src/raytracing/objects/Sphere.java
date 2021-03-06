package raytracing.objects;

import raytracing.util.*;

public class Sphere {
    Point point;
    double radius;

    public Sphere(double x, double y, double z, double radius){
        this.point = new Point(x, y, z);
        this.radius = radius;
    }

    public Hitinfo isHit(Ray ray){
        // Calculate a discriminant
        double A = ray.getDirection().dotproduct(ray.getDirection());
        double B = ray.getDirection().dotproduct(ray.getStart());
        double C = Math.pow(ray.getDirection().getnorm(), 2)- Math.pow(radius, 2);

        double discriminant = Math.pow(B, 2)-A*C;

        if (discriminant<0) {
            new Logger(this.getClass().getName(), "isHit()", "Miss");
            return new Hitinfo(0, 0, 0, null, null);
        }
        double t1 = (-B+Math.sqrt(discriminant))/(2*A);
        double t2 = (-B-Math.sqrt(discriminant))/(2*A);
        int amountOfHits = 2;
        if (discriminant==0)
            amountOfHits = 1;

        Point p1 = new Point((ray.getStart().getX()+ray.getDirection().x)*t1, (ray.getStart().getY()+ray.getDirection().y)*t1, (ray.getStart().getZ()+ray.getDirection().z)*t1);
        Point p2 = new Point((ray.getStart().getX()+ray.getDirection().x)*t2, (ray.getStart().getY()+ray.getDirection().y)*t2, (ray.getStart().getZ()+ray.getDirection().z)*t2);

        return new Hitinfo(amountOfHits, t1, t2, p1, p2);
    }
}

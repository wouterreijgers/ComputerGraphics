package raytracing.util;

public class Ray {
    public Point start;
    public Vector direction;

    public Ray(){

    }

    public Ray(Point start, Vector direction){
        this.start = start;
        this.direction = direction;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setStart(int x, int y, int z) {
        this.start = new Point(x, y, z);
    }

    public Vector getDirection() {
        return direction;
    }

    public void setDirection(Vector direction) {
        this.direction = direction;
    }

    public void setDirection(int x, int y, int z, int a) {
        this.direction = new Vector(x, y, z, a);
    }
}

package raytracing.util;

public class Vector {
	public double x;
	public double y;
	public double z;
	public double a;



	public Vector() {
		
	}
	
	public Vector(double x, double y, double z, double a) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
	}

	public double dotproduct(Point p) {
		return x*p.x +y*p.y + z*p.z;
	}
}

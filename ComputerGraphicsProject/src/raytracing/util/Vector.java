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

	public Vector multiply(Matrix matrix){
		double x1 = x*matrix.getMatrix()[0][0] + y*matrix.getMatrix()[0][1] + z*matrix.getMatrix()[0][2] + a*matrix.getMatrix()[0][3];
		double y1 = x*matrix.getMatrix()[1][0] + y*matrix.getMatrix()[1][1] + z*matrix.getMatrix()[1][2] + a*matrix.getMatrix()[1][3];
		double z1 = x*matrix.getMatrix()[2][0] + y*matrix.getMatrix()[2][1] + z*matrix.getMatrix()[2][2] + a*matrix.getMatrix()[2][3];
		double a1 = x*matrix.getMatrix()[3][0] + y*matrix.getMatrix()[3][1] + z*matrix.getMatrix()[3][2] + a*matrix.getMatrix()[3][3];
		return new Vector(x1, y1, z1, a1);

	}

	public double dotproduct(Vector p) {
		return x*p.x +y*p.y + z*p.z + a*p.a;
	}

	public double dotproduct(Point p) {
		return x*p.x +y*p.y + z*p.z + a*p.a;
	}

	public double getnorm() {
		return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0) + Math.pow(z, 2.0));
	}
}

package raytracing;

import raytracing.plotting.PointPlotter;
import raytracing.util.Point;
import raytracing.util.Ray;
import raytracing.util.Vector;

public class Main {

	public static void main(String[] args) {

		// Define window size;
		int nRows = 400;
		int nCols = 400;
		PointPlotter plotter = new PointPlotter(nCols, nRows);
		//plotter.drawPoint(450, 200);
		// loop all rows and columns
		Point eye = new Point(5, 0, 0);
		Ray ray = new Ray();
		ray.setStart(eye);
		//Assume the center of the window is placed at (3, 0, 0)
		// H -> 2 -> window size is 400 so every col is 1/100th if a step
		// W -> 2
		double XCoordinate, YCoordinate, ZCoordinate;
		for(double r=0; r<nRows; r++) {
			for (double c=0; c<nCols; c++){
				// Compute the rays direction
				Vector direction = new Vector(-1, 2*((2*c)/nCols-1), 2*((2*r)/nRows-1), 0);
				ray.setDirection(direction);
			}
		}
		plotter.forceUpdate();
	}
}

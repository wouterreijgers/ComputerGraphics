package raytracing;

import raytracing.plotting.PointPlotter;

public class Main {

	public static void main(String[] args) {

		PointPlotter plotter = new PointPlotter(700, 700);
		plotter.drawPoint(450, 200);
		for(int i=200; i<=250; i++) {
			plotter.drawPoint(i, 200);
		}
	}
}

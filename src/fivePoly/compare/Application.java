package fivePoly.compare;

import java.util.HashSet;

public class Application {

	public static void main(String[] argv) {

		HashSet<Point> points = new HashSet<>();
		Point p1 = new Point(3, 5);
		Point p2 = new Point(3, 5);
		Point p3 = new Point(1, 4);

		points.add(p1);
		System.out.println(points.contains(p2));
	}
}

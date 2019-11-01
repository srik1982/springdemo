package learning.spring.ioc.di.xmlconfig.point;

import java.util.List;

public class Triangle {
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void init() {
		System.out.println("Initializing..");
	}
	
	public void destroy() {
		System.out.println("Destroying...");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		points.forEach(p -> {
			sb.append(p.getX());
			sb.append(" , ");
			sb.append(p.getY());
			sb.append("\n");
		});
		return sb.toString();
	}
}

//Zaid Abu Jumaiza - CS113004

public class Circle {
	
	private Point center;
	private float radius;
	
	public Circle(Point p, float r) {
		center = p;
		radius = r;
	}
	
	public void setCenter(Point other) {
		center = other;
	}
	
	public void setRadius(float other) {
		radius = other;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public String toString() {
		String info = "The circle has a center point at "+center+" with a radius of "+radius;
		return info;
	}
	

}

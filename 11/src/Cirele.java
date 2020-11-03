public class Cirele extends GeometricObject {
	private double radius;
	public Cirele() {	
	}
	public Cirele(double radius) {
		this.radius = radius;
	}
	public Cirele(double radius,String color,Boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getDiameter() {
		return 2 * radius;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created" + getDateCreated() + 
				" and the radius is " + radius);
	}
}


public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cirele circle = new Cirele(1);
		System.out.println(" A circle " + circle.toString());
		System.out.println(" The color is  " + circle.getColor());
		System.out.println(" The Radius is " + circle.getRadius());
		System.out.println(" The Area is " + circle.getArea());
		System.out.println(" The Diameter is " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println(" A rectangle " + rectangle.toString());
		System.out.println(" The color is  " + rectangle.getColor());
		System.out.println(" The Height is " + rectangle.getHeight());
		System.out.println(" The Area is " + rectangle.getArea());
		}
}

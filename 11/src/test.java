
public class test {
//11.5.1 方法重写和重载
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B c = new B(2.0,2.0);
		double a = c.getArea();
		System.out.println(a);
	}
}

class C {
	private double radius ;
		C(){System.out.println("0000");}
		C (double radius){
			this.radius = radius;
		}
		public double getArea() {
			return radius * radius *Math.PI;
		}
	}

class B extends C{
	private double length;
	B (double radius,double length){
		super(radius);
		this.length = length;
	}
	@Override
	public double getArea() {
		return super.getArea() * length;
	}
}
import java.util.Scanner;
//19028140043
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		Circle circle1 = new Circle(n);
		System.out.println("面积"+circle1.getArea()+"\n周长"+circle1.getLength());
		n = in.nextDouble();
		Cylinder cylinder1 = new Cylinder(circle1,n);
		System.out.println("面积"+cylinder1.getArea()+"\n体积"+cylinder1.getVolumn());

	}

}

		class Circle{
			double radius;
			Circle(double n){
				radius=n;
			}
			double getArea(){
				return radius*radius*Math.PI;
			}
			double getLength(){
				return radius*Math.PI*2;
			}
		}
		
		class Cylinder{
			Circle bottom;
			double height;
			Cylinder(Circle a,double b){
				bottom = a;
				height = b;
			}
			double getVolumn(){
				return bottom.getArea()*height;
				
			}
			double getArea(){
				return bottom.getLength()*height+(bottom.getArea()*2);
			}
		}
import java.util.Scanner;
//计科34 高一桐19028140043
public class Test {
	public static void main(String[] args) {
		double width,length,height;
		Scanner p = new Scanner(System.in);
				System.out.println("输入立方体底面长和宽：");
				width = p.nextDouble();		
				length = p.nextDouble();		
		Rectangle rectangle1 = new Rectangle(width,length);
		System.out.println("底面积" + rectangle1.getArea() +"底面周长"+ rectangle1.getperimeter());
		System.out.println("输入立方体高：");
				height = p.nextDouble();
		Cube cube1 = new Cube(rectangle1,height);
				System.out.println("表面积"+cube1.getVolumn()+"体积"+cube1.getArea());	
											}
					}
 class Rectangle{
	 double width,length;
		Rectangle (double a, double b) {
			width = a;
			length = b;
			}
		public double getArea(){ return width*length; }
		public double getperimeter(){ return (width+length)*2; }
	}
 class Cube{
	Rectangle bottom;
	double height;
		Cube(Rectangle a,double b){
			bottom = a;
			height = b;
			}
		double getVolumn(){ return bottom.getArea()*height; }
		double getArea(){ return bottom.getperimeter()*height+bottom.getArea()*2; }
	}


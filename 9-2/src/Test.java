import java.util.Scanner;
//�ƿ�34 ��һͩ19028140043
public class Test {
	public static void main(String[] args) {
		double width,length,height;
		Scanner p = new Scanner(System.in);
				System.out.println("������������泤�Ϳ�");
				width = p.nextDouble();		
				length = p.nextDouble();		
		Rectangle rectangle1 = new Rectangle(width,length);
		System.out.println("�����" + rectangle1.getArea() +"�����ܳ�"+ rectangle1.getperimeter());
		System.out.println("����������ߣ�");
				height = p.nextDouble();
		Cube cube1 = new Cube(rectangle1,height);
				System.out.println("�����"+cube1.getVolumn()+"���"+cube1.getArea());	
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


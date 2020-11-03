import java.util.Scanner;
//计科34 高一桐 19028140043
public class exe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		double a,b;
		for(;true;) {
		System.out.println("给矩形命名：");
		name = input.next();
		Rectangle Rectangle1 = new Rectangle(name);
		System.out.println(Rectangle1.Name+"的宽是：");
		a = input.nextDouble();
		System.out.println(Rectangle1.Name+"的长是：");
		b = input.nextDouble();
		Rectangle1.set(a,b);
		Rectangle1.getArea(a,b);
		Rectangle1.getPerimeter(a,b);
		}
	}
}

class Rectangle {
	String Name;
	double width;
	double length;
	
	public Rectangle () {}
	
	Rectangle(String name) {
		Name = name;
		System.out.println("矩形的名字是："+Name);
	}
	 
	void set(double width1,double length1) {	
		width = width1;
		length = length1;
	}
	 
	void getArea(double width,double length){
		 double area;
		 area = width * length;
		 System.out.println(Name+"的面积是"+area);
	 }
	 
	void getPerimeter(double width,double length){
		 double perimeter;
		 perimeter = 2*(width + length);
		 System.out.println(Name+"的面积是"+perimeter);
 	 }
}

import java.util.Scanner;
//�ƿ�34 ��һͩ 19028140043
public class exe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		double a,b;
		for(;true;) {
		System.out.println("������������");
		name = input.next();
		Rectangle Rectangle1 = new Rectangle(name);
		System.out.println(Rectangle1.Name+"�Ŀ��ǣ�");
		a = input.nextDouble();
		System.out.println(Rectangle1.Name+"�ĳ��ǣ�");
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
		System.out.println("���ε������ǣ�"+Name);
	}
	 
	void set(double width1,double length1) {	
		width = width1;
		length = length1;
	}
	 
	void getArea(double width,double length){
		 double area;
		 area = width * length;
		 System.out.println(Name+"�������"+area);
	 }
	 
	void getPerimeter(double width,double length){
		 double perimeter;
		 perimeter = 2*(width + length);
		 System.out.println(Name+"�������"+perimeter);
 	 }
}

import java.util.Scanner;
//�ƿ�34 ��һͩ 19028140043
public class Triangle {
	double a=1.0,b=1.0,c=1.0;
	
	public Triangle(){}
	
	Triangle(double a1,double b1,double c1){
		a = a1;
		b = b1;
		c = c1;
	}
	
	boolean isTriangle(double a,double b,double c) {
		return (a+b>c && a+c>b && b+c>a);
	}
	 
	double getArea() {
		double s=(a+b+c)/2;
		return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

	}
	
	double getPerimeter(){
		return(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a,b,c;
	    Triangle t;
	do{	 
		System.out.println("���������߳�");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
	    t = new Triangle(a,b,c);
	    while(t.isTriangle(a, b, c) == false) {
	    System.out.println("����ʧ�ܣ�����");
	    break;
	    }
	} while(t.isTriangle(a, b, c) == false);
			System.out.println("�����ɹ���");
			System.out.println("�����"+t.getArea()+"\n�ܳ�"+t.getPerimeter());
	
			
	}
   
}

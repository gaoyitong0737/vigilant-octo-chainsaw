import java.util.Scanner;

public class sanjiao {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double x,y,z;
		while(true) {
			System.out.println("���������߳�:");
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			System.out.println("x="+x+"\ny="+y+"\nz="+z);
			triangle(x,y,z);
		}
	}


public static double triangle (double x,double y,double z){
	 	double s;
	 	double mianji,zhouchang;
		if(x-y >= z || x-z >= y || z-y >= x) {
			System.out.println("�������");
			}
		else {
		s=(x+y+z)/2;
		mianji = Math.sqrt(s*(s-x)*(s-y)*(s-z));
		zhouchang = x+y+z;
		System.out.println("���Ϊ" + mianji + "\n�ܳ�Ϊ" + zhouchang);
		}
		return 1;
	}
}

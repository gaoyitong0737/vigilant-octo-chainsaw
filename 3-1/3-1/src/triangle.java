import java.util.Scanner;
//计科 高一桐 2020/10/1
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,z,s,mianji,zhouchang;
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("请输入三边长:");
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		if(x-y >= z || x-z >= y || z-y >= x) {
			System.out.println("输入错误！");
			}
		else {
		s=(x+y+z)/2;
		mianji = Math.sqrt(s*(s-x)*(s-y)*(s-z));
		zhouchang = x+y+z;
		System.out.println("面积为" + mianji + "\n周长为" + zhouchang);
		}
		}
	}

}

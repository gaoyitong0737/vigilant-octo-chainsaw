import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner input = new Scanner(System.in);
	 System.out.println("����һ������");
	 int number = input.nextInt();
	 int y,x=0;
	 if(number % 5  == 0)
		 System.out.println("��5�ı���");
	 else 
		 System.out.println("����5�ı���");
	 System.out.println("����y");
	 y = input.nextInt();
	 if (y > 0)
	 x = (int) 1.0;
	 System.out.println(x);
	}
	
}
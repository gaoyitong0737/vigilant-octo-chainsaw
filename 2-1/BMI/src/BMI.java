import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double stature,weight,BMI;
		Scanner input = new Scanner(System.in);
		System.out.println("Plase enter you stature (by/m) and weight (by/kg)");
		stature = input.nextDouble();
		weight = input.nextDouble();
		BMI = weight/(stature*stature);
		System.out.print("���BMIֵ"+(int)(BMI*100)/100.0);
		if(BMI>=28.0)
			System.out.print(" ����״̬������"); 
		else if(BMI>=24.0)
			System.out.print(" ����״̬������"); 
		else if(BMI>=18.5)
			System.out.print(" ����״̬������");
		else if(BMI<=18.4) 
			System.out.print(" ����״̬��ƫ��");
	}

}

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
		System.out.print("你的BMI值"+(int)(BMI*100)/100.0);
		if(BMI>=28.0)
			System.out.print(" 身体状态：肥胖"); 
		else if(BMI>=24.0)
			System.out.print(" 身体状态：过重"); 
		else if(BMI>=18.5)
			System.out.print(" 身体状态：正常");
		else if(BMI<=18.4) 
			System.out.print(" 身体状态：偏瘦");
	}

}

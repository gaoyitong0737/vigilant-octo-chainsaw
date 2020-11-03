import java.util.Scanner;
//计科34 高一桐19028140043
public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p  = new Scanner(System.in);
		System.out.println("输入十个数");
		int a[] = new int[10];
			int max = 0;
			int mini = 99;
			int average = 0;
			int c=0,d=0;
		for(int b: a) {
			b = p.nextInt();
			average+=b;
			if(b>max)
				max = b;
			if(b<mini)
				mini = b;
		}
		for(int b: a) {
			if(b>average)
				c++;
			else if(b<average)
				d++;
		}
				
		System.out.printf("max is %d\nmini is %d\n1average is %d\n",max,mini,(average/10));
	}

}

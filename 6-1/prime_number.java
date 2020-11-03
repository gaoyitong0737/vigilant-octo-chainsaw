import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = input.nextInt();
		if(n<0)
			System.out.println("输入错误！");
		else if(n==1)
			System.out.println("无");
		else if(n==2)
			System.out.println("2");
		else if(n>2){
			System.out.print("2 ");
			for(int i = 3;i <= n;i += 2)
				if(judge(i)!=0)
				System.out.print(i+" ");
		}
	}
	public static int judge(int a) {
		int b,c = 0;
		for(b = 2;b<=Math.sqrt(a);b++,c=0) 
			if(a%b==0) {
				return 0;
			}
		return 1;
	}

}

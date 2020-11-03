import java.util.Random;

public class 随机数 {
//计科34 高一桐19028140043
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = new int[10];
		int[] box = new int[100];
		int a=0;
		for(int i: box) {
			while(a%20==0) {
				System.out.println();
				break;
			}
			a++;	
			i=(int)(Math.random()*10);	
			System.out.print(i+" ");
				number[i]++;
		}
		System.out.println("\n");a=0;
		for(int i: number) {
			
			System.out.print(a);
			a++;
			System.out.println("出现"+i+"次");
			}
		}
	}

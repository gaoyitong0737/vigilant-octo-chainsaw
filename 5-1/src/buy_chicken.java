
public class buy_chicken {
	public static void main(String[] args) {
		//买100只鸡：公鸡-5元 母鸡-3元 小鸡-1元-3只
		//计科 高一桐 2020/10/3
		//还有时间复杂度更小的算法
		int male,female,kid;
		int price = 100;
		int num = 0;
		int x,y,z=0;
		for(male = 0;male<=20;male++,num=0,price=100) {
			x=male * 5;
			price -= x;
			num +=male; 
			for(female = 0; female<=33;female++,num=0,price=100) {
				y = female * 3;
				price -= y+x;
				num +=female+male;
				for(kid=0;kid<=99;kid+=3,num=0,price=100) {
					z = kid/3;
					num =female+male+kid;
					price -= x+y+z;
					if(num==100 && price==0)
						System.out.println("还剩"+price+"元，"+"公鸡"+male+"只，"+"母鸡"+female+"只，"+"小鸡"+kid+"只");
				}
			}
		}
		/*方法二
		已知male+female+kid = 100  && 5male+3female+kid/3 = 100
		两式相减化简得：
		female = 25 - (7/4)male 
		令 male = 4a
		female = 25 - 7a
		kid = 75 + 3a
		要保证male+female+kid = 100，a最多取3 所以有：*/
		System.out.println("方法二");
		for (int k = 0; k <= 3; k++){
                male = 4 * k;
                female = 25 - 7 * k;
                kid = 75 + 3 * k;
               System.out.println("公鸡"+male+"只，"+"母鸡"+female+"只，"+"小鸡"+kid+"只");
           }
	}
}

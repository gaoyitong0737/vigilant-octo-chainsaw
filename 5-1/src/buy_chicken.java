
public class buy_chicken {
	public static void main(String[] args) {
		//��100ֻ��������-5Ԫ ĸ��-3Ԫ С��-1Ԫ-3ֻ
		//�ƿ� ��һͩ 2020/10/3
		//����ʱ�临�Ӷȸ�С���㷨
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
						System.out.println("��ʣ"+price+"Ԫ��"+"����"+male+"ֻ��"+"ĸ��"+female+"ֻ��"+"С��"+kid+"ֻ");
				}
			}
		}
		/*������
		��֪male+female+kid = 100  && 5male+3female+kid/3 = 100
		��ʽ�������ã�
		female = 25 - (7/4)male 
		�� male = 4a
		female = 25 - 7a
		kid = 75 + 3a
		Ҫ��֤male+female+kid = 100��a���ȡ3 �����У�*/
		System.out.println("������");
		for (int k = 0; k <= 3; k++){
                male = 4 * k;
                female = 25 - 7 * k;
                kid = 75 + 3 * k;
               System.out.println("����"+male+"ֻ��"+"ĸ��"+female+"ֻ��"+"С��"+kid+"ֻ");
           }
	}
}

import java.util.Arrays;
import java.util.Scanner;
//�ƿ�34 ��һͩ 19028140043

public class drinking_game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�����������");
		int n = input.nextInt();
		while(n>22||n<0) {
			System.out.println("�������22λ��ң�����������:");
			n = input.nextInt();
		}
		Player[] P = new Player[n];
		for(int a=0;a<P.length;a++) {
			P[a] = new Player();
			P[a].getname();
			}
		P=P[0].paiwei(P);
		System.out.println("��λ�ɹ���\n�μӱ�����Ϸ������У�");
		for(Player p:P)
			System.out.print(p.name +" ");
		System.out.println();
		System.out.println("������Ƶ�ƿ����");
		n = input.nextInt();
		DrumBeator.wine=n;
		System.out.println("��Ϸ��ʼ��");
		P[0].handle();
		System.out.println("\t��������:"+DrumBeator.��������);
		for(Player p:P)
			System.out.println("\t"+p.name+"�ĺȾƴ���Ϊ"+p.�Ⱦƴ��� +"��");
		}
}




class Player extends drinking_game {
	char name;
	Player successor;
    char c[] = {'��','��','��','Խ','ҹ','÷','��','��','��','Ϧ','��','Ϳ','��','��','��','��','��','ʷ','��','Զ','��','��'};
    int �Ⱦƴ���=0;
    static int number = 0;
    Player(){
    	this.number++;
    }
    
    public void handle(){
		if (DrumBeator.wine!=0){
			System.out.println(this.name+"����"+this.successor.name);
				if(DrumBeator.getDrum()==1) {
				DrumBeator.wine--;
				System.out.println("����ֹͣ:"+this.name+"�Ⱦ�");
				�Ⱦƴ���++;
				}
			this.successor.handle();
			}
		}
    
	public void getname() {
		int i =(int)(Math.random() * c.length);
		name = c[i];
	}
	
	public Player[] paiwei(Player[] P){
		P[P.length-1].successor = P[0];
		for(int i=0;i<P.length-1;i++)
			P[i].successor = P[i+1];
		return P;
	}
}



class DrumBeator extends Player{
	static int Drum,wine,��������=0;
	static int getDrum(){
		Drum = (int) (Math.random()*10+1);
		��������++;
		return Drum;
	}
}

/*

��1��������Ϸ����Player����name���ԣ���һ��Player���͵ı���successor��ʾ��һ���ˣ���һ�����������������������Ƿ�Ⱦƻ򴫻��ķ�����handle()��

��2������ģ�⣺�����������DrumBeator�����Ӿ�̬����getDrum()�ɷ����������1-10��������1ʱ����ʾ����ֹͣ��

��3������ģ�⣺��handle()�����У��������ֹͣ��DrumBeator.getDrum()Ϊ1�����ͱ�ʾ���������У��Ⱦƣ����һ�£���Ȼ���´����������ûֹͣ��ֱ���´���ÿ�κȾƺ󣬾Ƶ�������1��Ϊ0ʱ��ֹ��Ϸ��

��4�������������趨�Ƶĳ�ʼ��������������Ҳ������Σ�����ĳ����ҵ�handle()������ʼ��Ϸ����Ϸ����ʱ�����ÿ�˺ȾƵ��������ܵĴ���������

��ʾ����Ϸ�����ж���Ⱦ������ı������Ⱦƺ��1���Ƶ��������ܴ��������ڻ�������DrumBeator�ж��徲̬������*/
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
	static char c[] = {'��','��','��','Խ','ҹ','÷','��','��','��','Ϧ','��','Ϳ','��','��','��','��','��','ʷ','��','Զ','��','��'};
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
			if (c[i]!='��') {
				name = c[i];
				c[i]='��';	
				}
			else getname();
			
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

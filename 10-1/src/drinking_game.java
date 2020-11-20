import java.util.Arrays;
import java.util.Scanner;
//计科34 高一桐 19028140043

public class drinking_game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入玩家数");
		int n = input.nextInt();
		while(n>22||n<0) {
			System.out.println("最多生成22位玩家！请重新输入:");
			n = input.nextInt();
		}
		Player[] P = new Player[n];
		for(int a=0;a<P.length;a++) {
			P[a] = new Player();
			P[a].getname();
			}
		P=P[0].paiwei(P);
		System.out.println("排位成功！\n参加本次游戏的玩家有：");
		for(Player p:P)
			System.out.print(p.name +" ");
		System.out.println();
		System.out.println("请输入酒的瓶数：");
		n = input.nextInt();
		DrumBeator.wine=n;
		System.out.println("游戏开始：");
		P[0].handle();
		System.out.println("\t传花次数:"+DrumBeator.传花次数);
		for(Player p:P)
			System.out.println("\t"+p.name+"的喝酒次数为"+p.喝酒次数 +"次");
		}
}




class Player extends drinking_game {
	char name;
	Player successor;
	static char c[] = {'革','向','南','越','夜','梅','鱼','依','萱','夕','翠','涂','红','屈','腾','初','夏','史','心','远','吕','悦'};
    int 喝酒次数=0;
    static int number = 0;
    Player(){
    	this.number++;
    }
    
    public void handle(){
		if (DrumBeator.wine!=0){
			System.out.println(this.name+"传给"+this.successor.name);
				if(DrumBeator.getDrum()==1) {
				DrumBeator.wine--;
				System.out.println("鼓声停止:"+this.name+"喝酒");
				喝酒次数++;
				}
			this.successor.handle();
			}
		}
    
	public void getname() {
			int i =(int)(Math.random() * c.length);
			if (c[i]!='空') {
				name = c[i];
				c[i]='空';	
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
	static int Drum,wine,传花次数=0;
	static int getDrum(){
		Drum = (int) (Math.random()*10+1);
		传花次数++;
		return Drum;
	}
}

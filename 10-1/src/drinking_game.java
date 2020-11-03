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
    char c[] = {'革','向','南','越','夜','梅','鱼','依','萱','夕','翠','涂','红','屈','腾','初','夏','史','心','远','吕','悦'};
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
	static int Drum,wine,传花次数=0;
	static int getDrum(){
		Drum = (int) (Math.random()*10+1);
		传花次数++;
		return Drum;
	}
}

/*

（1）定义游戏者类Player：有name属性，有一个Player类型的变量successor表示下一个人，有一个传花方法（听鼓声决定是否喝酒或传花的方法）handle()。

（2）鼓声模拟：定义击鼓者类DrumBeator中增加静态函数getDrum()可返回随机数字1-10，当返回1时，表示击鼓停止。

（3）传花模拟：在handle()方法中，如果击鼓停止（DrumBeator.getDrum()为1），就表示花在他手中，喝酒（输出一下），然后下传；如果击鼓没停止则直接下传。每次喝酒后，酒的数量减1，为0时终止游戏。

（4）定义主程序，设定酒的初始数量，定义多个玩家并排座次，调用某个玩家的handle()方法开始游戏。游戏结束时，输出每人喝酒的数量和总的传花次数。

提示：游戏者类中定义喝酒数量的变量，喝酒后加1；酒的数量和总传花次数在击鼓者类DrumBeator中定义静态变量。*/
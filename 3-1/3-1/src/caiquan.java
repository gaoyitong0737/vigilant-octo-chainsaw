import java.util.Scanner;
//计科 高一桐 2020/10/1
public class caiquan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pc,pcwin = 0;
		int player = 0,playerwin = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (i == 1){
		
			System.out.println("请输入0（剪刀），1（石头），2（布）");
			pc = (int)(Math.random()*10-1)/3;
			player = input.nextInt();
			switch(player){
				case 0:
					System.out.println("你出剪刀");
					break;
				case 1:
					System.out.println("你出石头");
					break;
				case 2:
					System.out.println("你出布");
					break;
				default:
					System.out.println("输入错误！电脑自动获胜！");
					pcwin++;
					
			}
			switch(pc){
				case 0:
					System.out.println("电脑出剪刀");
					break;
				case 1:
					System.out.println("电脑出石头");
					break;
				case 2:
					System.out.println("电脑出布");
					break;
			}
			if(player == pc)
				System.out.println("平局！");
			else
				switch(pc+player) {
			case 1:
				System.out.println("石头赢！");
				if(pc == 1)
					pcwin++;
				else
					playerwin++;
				break;
			case 2:	
				System.out.println("剪刀赢！");
				if(pc == 0)
					pcwin++;
				else
					playerwin++;
				break;
			case 3:	
				System.out.println("布赢！");
				if(pc == 2)
					pcwin++;
				else
					playerwin++;
				break;
			}
			System.out.println("继续请输入1，结束请输入0");
			i = input.nextInt();
		}
		System.out.println("游戏结束！");
		System.out.println("玩家共获胜" + playerwin + "局!\n" + "电脑共获胜" + pcwin + "局!" );
	}
}

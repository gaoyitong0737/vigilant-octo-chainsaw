import java.util.Scanner;
//�ƿ� ��һͩ 2020/10/1
public class caiquan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pc,pcwin = 0;
		int player = 0,playerwin = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (i == 1){
		
			System.out.println("������0����������1��ʯͷ����2������");
			pc = (int)(Math.random()*10-1)/3;
			player = input.nextInt();
			switch(player){
				case 0:
					System.out.println("�������");
					break;
				case 1:
					System.out.println("���ʯͷ");
					break;
				case 2:
					System.out.println("�����");
					break;
				default:
					System.out.println("������󣡵����Զ���ʤ��");
					pcwin++;
					
			}
			switch(pc){
				case 0:
					System.out.println("���Գ�����");
					break;
				case 1:
					System.out.println("���Գ�ʯͷ");
					break;
				case 2:
					System.out.println("���Գ���");
					break;
			}
			if(player == pc)
				System.out.println("ƽ�֣�");
			else
				switch(pc+player) {
			case 1:
				System.out.println("ʯͷӮ��");
				if(pc == 1)
					pcwin++;
				else
					playerwin++;
				break;
			case 2:	
				System.out.println("����Ӯ��");
				if(pc == 0)
					pcwin++;
				else
					playerwin++;
				break;
			case 3:	
				System.out.println("��Ӯ��");
				if(pc == 2)
					pcwin++;
				else
					playerwin++;
				break;
			}
			System.out.println("����������1������������0");
			i = input.nextInt();
		}
		System.out.println("��Ϸ������");
		System.out.println("��ҹ���ʤ" + playerwin + "��!\n" + "���Թ���ʤ" + pcwin + "��!" );
	}
}
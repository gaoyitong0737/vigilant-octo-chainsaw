import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  interest = 0,principal = 0,deposit = 0;
		//  "interest"-��Ϣ     "principal"-���     "deposit"-�����
		double  amount_due,year_interest_rate,month_interest_rate;
		// "aomount_due"-���ڽ��    "year_interest_rate"-������        "month_interest_rate"-������
		int month,i;
		// "month" �������
		Scanner input = new Scanner(System.in);
		System.out.println("Plase enter a numeber of month ");
		month = input.nextInt();
		System.out.println("Plase enter a numeber of  deposit");
		deposit = input.nextDouble();
		System.out.println("Plase enter a numeber of  year interest rate");
		year_interest_rate = input.nextDouble();
		month_interest_rate = year_interest_rate/12;
		//������������ÿ�´���������
		for(i=1;i<=month;i++)
			if(i==1) {
				principal = deposit;
				interest =0;
				System.out.println("�� "+i+"���µĵ������Ϊ"+deposit+"\n��"+i+"���µ�����ϢΪ"+interest);
			}	
			else {
		interest =	principal * month_interest_rate;
		principal += interest;
		System.out.println("�� "+i+"���µ������Ϊ"+(int)(principal*100)/100.0+"\n��"+i+"���µ�����ϢΪ"+(int)(interest*100)/100.0);
		principal+=100;
			}
		System.out.println("�����棺"+(int)((principal-month*deposit)*100)/100.0);
		System.out.println("������"+(int)(principal*100)/100.0);
	}

}
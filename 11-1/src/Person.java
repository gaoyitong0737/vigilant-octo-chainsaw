import java.util.Scanner;

public class Person {

	String name="\\u9ad8\\u4e00\\u6850\\u000d\\u000a";
	long idCard=19028140043L;
	public Person() {
System.out.println("����һ����");	}
	
	public Person(String name,int idCard) {
		this.name = name;
		this.idCard = idCard;
	}
	public void	printInfo() {
		System.out.println("����"+this.name +"\nid"+this.idCard);
	}
	
	
				public static void main(String[] args) {
					Scanner p = new Scanner(System.in);
					System.out.println("���� id ���� ����");
					String name =p.next() ;
					int idCard = p.nextInt();
					String department = p.next();
					double salary = p.nextDouble();
					Teacher x = new Teacher();
					x = new Teacher(name,idCard);
					x.printInfo();
					x = new Teacher(name,idCard,department,salary);
					x.printInfo();
					Person y;
					y = new Person();
					y.printInfo();
					y = new Person(name,idCard);
					y.printInfo();
				}

}

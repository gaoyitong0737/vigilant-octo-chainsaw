
public class ���� {
 public static void main(String[] args) {
		Animal animal;
		animal =new Horse();
		animal.move();
		animal =new Bird();
		animal.move();

	}
	
}

class  Animal{
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("���Ƕ���");
	}
	void move() {
		System.out.println("����ᶯ");	
	}
}

  class  Horse extends  Animal {
	public Horse() {
		// TODO Auto-generated constructor stub
		System.out.println("����һƥ��");
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("�����");
	}
}
  
  class Bird extends  Animal{
	  Bird(){
		  System.out.println("����һֻ��");
	  }
	  @Override
	void move() {
		// TODO Auto-generated method stub
		  super.move();
		  System.out.println("�����");
	}
  }


	
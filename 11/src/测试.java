
public class 测试 {
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
		System.out.println("这是动物");
	}
	void move() {
		System.out.println("动物会动");	
	}
}

  class  Horse extends  Animal {
	public Horse() {
		// TODO Auto-generated constructor stub
		System.out.println("这是一匹马");
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("马儿跑");
	}
}
  
  class Bird extends  Animal{
	  Bird(){
		  System.out.println("这是一只鸟");
	  }
	  @Override
	void move() {
		// TODO Auto-generated method stub
		  super.move();
		  System.out.println("鸟儿飞");
	}
  }


	
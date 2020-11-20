
public class Teacher extends Person {
	String department="\\u8ba1\\u7b97\\u673a\\u5de5\\u7a0b\\u5b66\\u9662";
	double salary;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	System.out.println("这是一个教师。");
		}
	
	public Teacher(String name,int idCard) {
		super( name,idCard );
		}	
	
	public Teacher(String name,int idCard,String department,double salary) {
		super( name,idCard );
		this.department =department;
		this.salary = salary;		
		}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名"+super.name+"\nid "+super.idCard+"\n部门"+this.department +"\n薪水"+this.salary);
	}
}

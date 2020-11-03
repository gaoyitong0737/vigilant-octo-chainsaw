
public class Course {

	  private String courseName;

	  private String[] students = new String[100];

	  private int numberOfStudents;   
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	  public Course(String courseName) {

	   this.courseName= courseName;

	  } 

	  public void addStudent(String student) {

	    students[numberOfStudents] = student;

	    numberOfStudents++;

	  } 

	  public String[] getStudents() {

	           return students;  }

	  public String getStudentAt(int index) {

	           return students[index];  }

	  public int getNumberOfStudents() {

	           return numberOfStudents;

	  } 

	  public String getCourseName() {

	           return courseName;

	  } 

	} 
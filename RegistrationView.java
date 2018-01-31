import java.util.ArrayList;

public class RegistrationView {

	private Student student;
	private ArrayList<Course> courses;
	
	public RegistrationView() {
		
	}
	
	public void RegisterCourses(Student student, ArrayList<Course> courses)
	{
		this.student = student;
		this.courses = courses;
		
	}
	
	public void printAvailableCourses(ArrayList<Course> courses)
	{
		this.courses = courses;
		printAvailableCourses();
	}

	public void printAvailableCourses()
	{
		for(Course course: courses) {
			System.out.println("--------------------------------------------- ");
			System.out.println("AVAILABLE Course information are as follows: ");
			System.out.println("Course name is " + course.getCourseName());
			System.out.println("Course number is " + course.getCourseNumber());
			System.out.println("Course credit is " + course.getCredit());
			System.out.println("Course professor is " + course.getProfessor());	
			System.out.println("--------------------------------------------- ");				
		}
	}
	
	
}

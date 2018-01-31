import java.util.ArrayList;

public class RegistrationController {
	private RegistrationView registrationView;
	private Student student; 
	private ArrayList<Course> courses;
	
	public RegistrationController(RegistrationView registrationView, Student student, ArrayList<Course> courses)
	{
		this.registrationView = registrationView;
		this.student = student;
		this.courses = courses;
	}
	
	public void printAvailableCourses() {
		this.registrationView.printAvailableCourses(this.courses);
	}
}

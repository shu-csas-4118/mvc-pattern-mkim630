import java.util.ArrayList;

public class MyMVCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor john = new Professor("John", "Smith", "JS@gmail.com", 111);
		Professor dan  = new Professor("Dan", "Snark", "DS@gmail.com", 222);
		Professor luke = new Professor("Luke", "Mark", "LM@gmail.com", 333);
		
		Course math = new Course("Math", 1001, 3, john);		
		Course science = new Course("Science", 1002, 4, dan);
		Course art = new Course("Art", 1003, 5, luke);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Student student = new Student("Matthew", "Kim", 123456, "kimyong@shu.edu", courses);
		StudentView studentView = new StudentView();
		StudentController controller = new StudentController(student, studentView);
		
		controller.printStudentDetails(); // prints student info

		
		courses.add(math); //puts two courses into one list of courses to be regsistered 
		courses.add(science);
		courses.add(art);
		RegistrationView rView = new RegistrationView();
		RegistrationController rController = new RegistrationController(rView, student, courses);	

		rController.printAvailableCourses();
		
		rView.RegisterCourses(student, courses); //registers student to the list of courses
		System.out.println("***Registered for the three classes***");
		controller.printCoursesDetails();
	}

}

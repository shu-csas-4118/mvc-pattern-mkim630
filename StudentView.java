
public class StudentView {

	private Student student;
	
	public StudentView(Student student) {
		this.student = student;
	}
	
	public StudentView() {
		
	}
	
	public void printStudentDetails(Student student) {
		this.student = student;
		printStudentDetails();
	}
	
	public void setStudentDetails(Student student) {
		
	}
	
	public void printStudentDetails() {
			if(this.student == null) throw new IllegalArgumentException("student");
			
			System.out.println("Student's first name is " + this.student.getFirstName());
			System.out.println("Student's last name is " + this.student.getLastName());
			System.out.println("Student's id number " + this.student.getIdNumber());
			System.out.println("Student's email is " + this.student.getEmail());
			
					
	}	
	public void printCoursesDetails()
	{
		for(Course course: this.student.getCourses()){
			if(course == null) throw new IllegalArgumentException("course");
			System.out.println("--------------------------------------------- ");
			System.out.println("Course information are as follows: ");
			System.out.println("Course name is " + course.getCourseName());
			System.out.println("Course number is " + course.getCourseNumber());
			System.out.println("Course credit is " + course.getCredit());
			System.out.println("Course professor is " + course.getProfessor());	
			System.out.println("--------------------------------------------- ");		
		}
	}
	
	
}

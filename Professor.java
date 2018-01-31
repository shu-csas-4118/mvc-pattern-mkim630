public class Professor {
	
	private String firstName;
	private String lastName; 
	private String email;
	private int phoneNumber;
	
	public Professor(String firstName, String lastName, String email, int phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName()	{
		return this.firstName;
	}
	public void setFirstName(String firstName)	{
		this.firstName = firstName; 
	}
	
	public String getLastName()	{
		return this.lastName;
	}
	public void setLastName(String lastName)	{
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhoneNumber()	{
		return this.phoneNumber; 
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
		}
	
	@Override
	public String toString()
	{
		String printThis = "";
		printThis = printThis + firstName + " " + lastName + "\n" +
				"\t" + "Professor's email is " + email + "\n" +
				"\t" + "Professor's phone number is " + phoneNumber;
		return printThis;
		
	}
	
	
	public String printInfo()
	{
		System.out.println("Professor's first name is " + firstName);
		System.out.println("Professor's last name is " + lastName);
		System.out.println("Professor's email is " + email);
		System.out.println("Professor's phone number is " + phoneNumber);
		return " ";
	}
}

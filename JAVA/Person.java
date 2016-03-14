//Assignment:  My Beauty Application
//Author:  Aboubakar Winston Kone
//Course:  ITEC 3860
//Instructor:  Dr. Gunay
//Class: Person.java

//Description:  Create a location for person to import there information

//Language:  JAVA
public class Person {
	// instance variables 
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String age;

	public Person(){

	}
	//getter and setter for all of the instance variables 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
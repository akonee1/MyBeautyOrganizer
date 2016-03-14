
//Assignment:  My Beauty Application
//Author:  Aboubakar Winston Kone
//Course:  ITEC 3860
//Instructor:  Dr. Gunay
//Class: Customer.java

//Description:  Create a location for customer to import there information
//Language:  JAVA

public class Customer {
// instance variables 
	private String name;
	private String lastName;
	private String address;
	private String age;

	public Customer(){

	}
	//getter and setter for all of the instance variables 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}

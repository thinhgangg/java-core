package chapter4;

public class Student {
	// constructor
	public Student() {
	}

	// attributes
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// method
	void learnJava() {
		System.out.println("Learning Java");
	}
}

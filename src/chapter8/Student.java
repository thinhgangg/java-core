package chapter8;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.mark >= 8.5)
			this.grade = "A";
		if (this.mark >= 7 && this.mark < 8.5)
			this.grade = "B";
		if (this.mark >= 5.5 && this.mark < 7)
			this.grade = "C";
		if (this.mark >= 4 && this.mark < 5.5)
			this.grade = "D";
		if (this.mark < 4)
			this.grade = "F";
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}

}

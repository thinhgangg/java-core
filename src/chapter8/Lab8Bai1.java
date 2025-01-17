package chapter8;

public class Lab8Bai1 {
	public static void main(String[] args) {
		Student sv1 = new Student("1505", "Thinh", 19, 10);
		System.out.println(sv1);
		sv1.setGrade();
		System.out.println(sv1);

		Person p1 = new Person("123", "thinhgangg", 19);
		System.out.println(p1);
	}
}

package chapter4;

public class test {
	public static void main(String[] args) {
		Student st1 = new Student("Thinh", 20);
		System.out.println(st1.getName() + ", " + st1.getAge());

		Student st2 = new Student();
		st2.setName("Thinh dep trai");
		st2.setAge(18);
		System.out.println(st2.getName() + ", " + st2.getAge());

	}
}

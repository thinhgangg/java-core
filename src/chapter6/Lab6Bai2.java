package chapter6;

import java.util.ArrayList;

public class Lab6Bai2 {
	public static void main(String[] args) {
		Student student1 = new Student("Mai Phúc Thịnh", 1505);
		Student student2 = new Student("Lê Hoài Giang", 2801);
		Student student3 = new Student("Nguyễn Văn A", 1111);
		Student student4 = new Student("Nguyễn Văn B", 2222);
		Student student5 = new Student("Lê Văn C", 3333);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student5);
		list.add(student4);
		list.add(student3);
		list.add(student2);
		list.add(student1);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().startsWith("Lê")) {
				System.out.println(list.get(i));
			}
		}

	}
}

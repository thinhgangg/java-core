package chapter9;

public class SinhVien {
	public int ID;
	public String Name;
	public double Score;
	public int age;

	public SinhVien(int id, String name, double score, int age) {
		this.ID = id;
		this.Name = name;
		this.Score = score;
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [ID=" + ID + ", Name=" + Name + ", Score=" + Score + ", age=" + age + "]";
	}

}

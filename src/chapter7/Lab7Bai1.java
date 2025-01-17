package chapter7;

abstract class SinhVien {
	protected String id;
	protected String name;

	abstract double getScore();

	public SinhVien(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void info() {
		System.out.println("get info from parent");
	}

}

class SinhVienIT extends SinhVien {
	double scoreJava;
	double scoreHTML;

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public SinhVienIT(String id, String name, double scoreJava, double scoreHTML) {
		super(id, name);
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getScore() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}

class SinhVienCoKhi extends SinhVien {
	double scoreCNC;
	double scorePLC;

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	public SinhVienCoKhi(String id, String name, double scoreCNC, double scorePLC) {
		super(id, name);
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	double getScore() {
		return (this.scoreCNC + this.scorePLC) / 2;
	}

}

public class Lab7Bai1 {
	public static void main(String[] args) {
		SinhVien it1 = new SinhVienIT("1505", "Thinh", 10, 7);
		System.out.println(it1.getScore());

		SinhVien ck1 = new SinhVienCoKhi("2801", "Giang", 9, 8);
		System.out.println(ck1.getScore());

	}
}

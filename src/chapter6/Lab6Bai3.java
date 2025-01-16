package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//	Regular Expressions - RegEx

public class Lab6Bai3 {
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("[0-9]{6,}") \\d{6,}

//		- Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc biệt
		Pattern pattern1 = Pattern.compile("\\d{12}");
		Matcher matcher1 = pattern1.matcher("123456789101");
		Matcher matcher2 = pattern1.matcher("123456789");
		System.out.println("Input String matches regex - " + matcher1.matches());
		System.out.println("Input String matches regex - " + matcher2.matches());

//		- Mật khẩu: có ít nhất 6 ký tự
		Pattern pattern2 = Pattern.compile("\\d{6,}");
		Matcher matcher3 = pattern2.matcher("1234567");
		Matcher matcher4 = pattern2.matcher("12345");
		System.out.println("Input String matches regex - " + matcher3.matches());
		System.out.println("Input String matches regex - " + matcher4.matches());

//		- Email : cần có ký tự @ và dấu chấm (.)
		Pattern pattern3 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher5 = pattern3.matcher("phucthinhmai00@gmail.com");
		Matcher matcher6 = pattern3.matcher("phucthinhmai00@gmail.e");
		System.out.println("Input String matches regex - " + matcher5.matches());
		System.out.println("Input String matches regex - " + matcher6.matches());
	}
}

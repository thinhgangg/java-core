package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
//			absolute path
			in = new FileInputStream("E:\\CODE\\JAVA\\hoidanit\\src\\chapter10\\input.txt");

//			relative path
			out = new FileOutputStream("./src/chapter10/output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("end");
		}
	}
}

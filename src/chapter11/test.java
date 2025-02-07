package chapter11;

public class test extends Thread {
	@Override
	public void run() {
		System.out.print("start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println("end thread" + sum);
	}
	
	public static void main(String[] args) {
		int max = 8;
		for (int i = 0; i < max; i++) {
			(new test()).start();
		}
		System.out.println("finish");
	}
}

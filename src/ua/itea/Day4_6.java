package ua.itea;

public class Day4_6 {

	public static void main(String[] args) throws InterruptedException {
		// System.out.println("Start");
		// Thread.sleep(5000);;
		// System.out.println("End");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("!!!Boom!!!");
	}

}

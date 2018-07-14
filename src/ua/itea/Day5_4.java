package ua.itea;

public class Day5_4 {

	public static void main(String[] args) {
		int counter = 0;
		//while (true) {
		while (counter != 10) {
			int rnd = (int) (Math.random() * 100);
			if (rnd % 2 == 0) {
				counter++;
				System.out.println(rnd);
			}
			// if (counter == 10){
			// break;
			// }
		}
	}

}

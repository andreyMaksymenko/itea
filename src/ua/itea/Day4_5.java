package ua.itea;

public class Day4_5 {

	public static void main(String[] args) {
		// int i=0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		for (int j = 0; j <= 10; j++) {
				System.out.println(j % 2 == 0 ? j + "\n" : "");
			}
		for (int k = 0; k <= 10; k+=2) {
			System.out.println(k);
		}
		
		
		switch ((i % 2)) {
			case 0:
				System.out.println(i);
				break;

			}

		}
	}
}

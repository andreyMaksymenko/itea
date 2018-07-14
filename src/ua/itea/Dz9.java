package ua.itea;

import java.util.Arrays;
import java.util.Scanner;

public class Dz9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String all[] = new String[2];
		for (int i = 0; i < all.length; i++) {
			all[i] = in.nextLine();
		}
		for (int j = 0; j < all.length; j++) {
			String[] arr = all[0].split(" ");
			System.out.println(Arrays.toString(arr));
		}
		Scanner find = new Scanner(System.in);
		String x = find.nextLine();
		for (int k = 0; k < all.length; k++) {
			boolean v = all[k].contains(x);
			if (v) {
				// System.out.println(v);
		int firstSpace = all[k].indexOf(" ");
		int secondSpace = all[k].indexOf(all[k].substring(firstSpace+1));
		int trirdSpace = all[k].indexOf(all[k].substring(secondSpace+1));
		int fourthSpace = all[k].lastIndexOf(" ");

		String fam = all[k].substring(0, 1).toUpperCase() + all[k].substring(1, firstSpace);
		String name = all[k].substring(firstSpace + 1, firstSpace + 2).toUpperCase();
		String otch = all[k].substring(secondSpace + 1, secondSpace).toUpperCase();
		String city = all[k].substring(trirdSpace, fourthSpace).toUpperCase();
		String age = all[k].substring(fourthSpace);
		
		System.out.println(fam + " " + name + "." + otch + "." + " " + city + " " + age);
				
			/**	System.out.println(all[k].substring(0, 1).toUpperCase() + all[k].substring(1, all[k].indexOf(" ")) + " "
						+ all[k].substring(all[k].indexOf(" ") + 1, all[k].indexOf(" ") + 2).toUpperCase() + "."
						+ all[k].substring(all[k].lastIndexOf(" ") + 1, all[k].lastIndexOf(" ") + 2).toUpperCase() + ".");
				System.out.println(all[k]);*/
			}
		}
		in.close();
		find.close();
	}

}


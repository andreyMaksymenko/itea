package ua.itea;

public class Day4_8 {

	public static void main(String[] args) throws InterruptedException {
		//int time = 7483;
		for (int time = 7453; time >= 0; time--) {
			int hours = time/3600;
			int minutes =(time%3600)/60;
			int seconds = (time%3600)%60;
			System.out.println("H: " + (hours<10?"0"+hours:hours) + " M: " + (minutes<10?"0"+minutes:minutes) + " S: "+ (seconds<10?"0"+seconds:seconds));
			Thread.sleep(1000);
		}
	}

}
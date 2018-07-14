package D20;

public class MyTh {

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		MyThread thread=new MyThread();
		thread.start();
		System.out.println(Thread.activeCount());
	}

}

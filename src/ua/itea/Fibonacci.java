package ua.itea;

public class Fibonacci {
    public static void main(String[] args) throws InterruptedException {
        int n = 21;
        int a1 = 1, a2 = 1;
        System.out.print(a1 + "\n" + a2);
		Thread.sleep(1000);
        int fib;
        int i = 2;
        while (i < n) {
            fib = a1 + a2;
            a1 = a2;
            a2 = fib;
            System.out.print("\n" + fib);
			Thread.sleep(1000);
            i++;
        }
    }
}
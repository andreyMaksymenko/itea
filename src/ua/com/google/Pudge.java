package ua.com.google;

public class Pudge {
	byte a;
	short b;
	int c;
	long l;
	float f;
	double d;
	char cc;
	boolean bool;
	void prinVars() {
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		System.out.println("l"+l);
		System.out.println("f"+f);
		System.out.println("d"+d);
		System.out.println("cc"+cc);
		System.out.println("bool"+bool);
	}
	public static void main(String[] args) {
		//new Pudge().prinVars();
		int a;
		a=5;
		System.out.print("a"+a+"\n");
		Pudge p=new Pudge();
		System.out.println(p);
		
		int b=3;
		byte v,m,g;
		v=7;
		System.out.println("ww"+(a+b)+v);

	}

}

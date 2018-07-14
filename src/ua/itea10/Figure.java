package ua.itea10;


import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {
		System.out.println("_������� �����_");
		System.out.println("�������: " + "\n" + "1 - ��� �������� ��������" + "\n" + "2 - ��� �������� �����" + "\n"
				+ "3 - ��� �������� ��������������� ������������" + "\n");
		int fig = 0;
		do {
			Scanner in = new Scanner(System.in);
			while (!in.hasNextInt()) {
				System.out.println("�������� ������");
				in.next();
			}
			switch (in.nextInt()) {
			case 1:
				Square square = new Square();
				System.out.println("������ ������ ������� ��������");
				int s;
				s = in.nextInt();
				square.changeSide(s);
				square.calcArea(s);
				square.calcPerimetr(s);
				square.getInfo();
				break;
			case 2:
				Circle circle = new Circle();
				System.out.println("������ ������ �����");
				int r;
				r = in.nextInt();
				circle.changeRadius(r);
				circle.calcArea(r);
				circle.calcPerimetr(r);
				circle.getInfo();
				break;
			case 3:
				Triangle triangle = new Triangle();
				System.out.println("������ ������� ������������");
				int st;
				st = in.nextInt();
				triangle.changeTriangle(st);
				triangle.calcArea(st);
				triangle.calcPerimetr(st);
				triangle.getInfo();
				break;
			default:
				System.out.println("������������ �����");
				break;
			}

			in.close();
		} while (fig == 1 && fig == 2 && fig == 3);
	}
}

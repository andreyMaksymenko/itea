package ua.itea10;

public class CatBoxMain {
	public static void main(String[] args) {
		CatBox smallBox=new CatBox();
		smallBox.getInfo();
		System.out.println("---------");
		smallBox.setWidth();
		smallBox.getInfo();
		CatBox bigBox=new CatBox();
		bigBox.getInfo();
		System.out.println("---------");
		

	}

}

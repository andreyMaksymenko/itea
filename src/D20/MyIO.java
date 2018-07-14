package D20;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyIO {

	public static void main(String[] args) throws FileNotFoundException {
//		try {
//			RandomAccessFile raf=new RandomAccessFile("myfile.txt", "rw");
//			
//			raf.seek(3);
//			raf.write("111111".getBytes());
//			raf.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			RandomAccessFile raf=new RandomAccessFile("myfile.txt", "r");
			raf.seek(0);
			int b=0;
			String result="";
			while((b=raf.read())!=-1) {
				result+=(char)b;
			} raf.close();
			System.out.println(result);
		}	 catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

package D20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class DogXML {

	public static void main(String[] args) throws FileNotFoundException {
		//Dog dog=new Dog("Barsik", 5);
//		XStream xs=new XStream(new StaxDriver());
//		try {
//		xs.toXML(dog, new FileOutputStream("dog.xml"));
//		}  catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		XStream xs=new XStream(new DomDriver());
		try {
			Dog dog=new Dog();
			xs.fromXML(new FileInputStream("dog.xml"), dog);
			System.out.println(dog);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

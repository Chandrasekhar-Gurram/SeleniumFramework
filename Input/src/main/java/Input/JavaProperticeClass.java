package Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaProperticeClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("E:\\project training\\Input\\data.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("browser"));

		System.out.println(prop.getProperty("url"));

		prop.setProperty("browser", "firefox");

		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos = new FileOutputStream("E:\\\\project training\\\\Input\\\\data.properties");

		prop.store(fos, null);

	}

}

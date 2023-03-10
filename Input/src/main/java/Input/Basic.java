package Input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Basic {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Chandrasekhar Gurram\\IEDriverServer.exe");
	   WebDriver driver= new InternetExplorerDriver();
	   driver.get("https://google.com");
	   System.out.println(driver.getTitle());
	  }

}

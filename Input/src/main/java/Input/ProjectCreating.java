package Input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		ProjectLogin rd=new ProjectLogin(driver);
		//rd.Login().click();
		rd.input().sendKeys("Username");
		rd.Password().sendKeys("Password");
	}

}

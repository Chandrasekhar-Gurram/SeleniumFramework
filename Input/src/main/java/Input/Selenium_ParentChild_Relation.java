package Input;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ParentChild_Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String Parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		String mail=driver.findElement(By.xpath("//a[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		String Pass=driver.findElement(By.xpath("//*[@class=\"im-para red\"]")).getText().split("with")[1].trim().split(" ")[0];
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(mail);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Pass);
	}

}

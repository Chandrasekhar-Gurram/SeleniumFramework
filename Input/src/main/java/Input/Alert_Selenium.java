package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/* driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("chandu");
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); */
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}


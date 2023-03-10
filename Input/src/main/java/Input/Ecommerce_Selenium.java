package Input;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce_Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// List<String> sd= new List<String>("Brocolli","Tomato","Brinjal","Capsicum");
		String[] sd = { "Brocolli", "Tomato", "Brinjal", "Capsicum" };
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		/* driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9640759683");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Mouli@123");
		driver.findElement(By.xpath("//*[@name='login']")).click(); */
		
		//*[@id="u_0_d_Aa"]
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='product-name']"));
		List<String> requiredNames = Arrays.asList(sd);
		for (int i = 0; i < names.size(); i++) {
			String[] vegNames = names.get(i).getText().split("-");
			String vegName = vegNames[0].trim();
			if (requiredNames.contains(vegName)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 4) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//*[@class='cart-icon']/img")).click();
		
		//driver.findElement(By.xpath("//*[contains{text(),'PROCEED TO CHECKOUT'}]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		WebDriverWait w1=new WebDriverWait(driver,5);
		//w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		//w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("chandrasekhargurram");
		
	}
}

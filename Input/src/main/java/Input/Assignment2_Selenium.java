package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();;
		WebDriverWait w1=new WebDriverWait(driver,5);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"results\"]")));
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"results\"]")).getText());
		

	}

}

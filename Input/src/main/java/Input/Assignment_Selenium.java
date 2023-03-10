package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();
		
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[2]/div/div")).click();
		
		 WebElement location=driver.findElement(By.xpath("//*[@class='bc-neutral-100 bg-transparent']"));
	    	Select dropdown=new Select(location);
	    	dropdown.selectByIndex(5);
	    	WebElement location1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select"));
	    	Select dropdown1=new Select(location1);
	    	dropdown1.selectByIndex(2);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div/a")).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[6]/div/div[3]/div/div/div[1]/input")).sendKeys("chandu");
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[8]/div[2]")).click();
	    	System.out.println(driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div/div[1]/div/div[2]/div/div[8]/div[2]")).getText());
	    	
	}

}

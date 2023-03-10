package Input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		
	while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //*[@class='datepicker-switch']")).getText().contains("May"))
	{
		driver.findElement(By.xpath("//div[@class='datepicker-days'] //*[@class='next']")).click();
	}
	driver.findElement(By.xpath("//div[@class='datepicker-days'] //*[@class='datepicker-switch']")).click();
	
	//List<WebElement> dates1=driver.findElements(By.xpath("//div[@class='datepicker-months'] //*[@class='month']"));
	int count1=driver.findElements(By.xpath("//div[@class='datepicker-months'] //*[@class='month']")).size();
	for(int i=0;i<count1;i++)
	{
		String text1=driver.findElements(By.xpath("//div[@class='datepicker-months'] //*[@class='month']")).get(i).getText();
		if(text1.equalsIgnoreCase("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-months'] //*[@class='month']")).click();
			break;
		}
	}
	//driver.findElements(By.xpath("//div[@class='datepicker-months'] //*[@class='month']")).getText().contains("May"));
	
	
	//List<WebElement> dates=driver.findElements(By.xpath("//table[@class=' table-condensed'] //td[@class='day']"));
	int count=driver.findElements(By.xpath("//table[@class=' table-condensed'] //td[@class='day']")).size();
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.xpath("//table[@class=' table-condensed'] //td[@class='day']")).get(i).getText();
		if(text.equalsIgnoreCase("23"))
		{
			driver.findElement(By.xpath("//table[@class=' table-condensed'] //td[@class='day']")).click();
			break;
		}
	}
	}

}

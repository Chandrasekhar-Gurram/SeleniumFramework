package Input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import jdbc.Main;
import junit.framework.Assert;


public class Example extends Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_rbtnl_Trip_1\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_rbtnl_Trip_1\']")).getAttribute("id"));
		
		
		/*
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("*[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		*/
		/*
		driver.findElement(By.xpath("//*[@id=\'autosuggest\']")).sendKeys("au");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Macau")) {
				option.click();
				break;
			}
		}
	 */
	   
	   
	   //Paradigm Plus
	   /* 
		 * driver.get("https://andersen-webcp-dev.wtsparadigm.com/login");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getPageSource()); driver.close();
		 * driver.findElement(By.id("username")).sendKeys("zhetxyjcjj@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("Password@123");
		 * driver.findElement(By.xpath("//*[@id=\'content-main\']/form/div[4]/input")).
		 * click();
		 */
	   
	   //Google.com
	   
	 /*driver.get("https://www.google.com/");
	   driver.findElement(By.linkText("Gmail")).click();;
	   driver.findElement(By.linkText("Sign in")).click();
	   driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("chandrasekhar.gurram@cog9.com");
	   driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();*/
	
	   
	   //driver.get("https://sites.google.com/view/dnbabu");
	   
	 //rahulshettyacademy.com/dropdownsPractise  
     /*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   driver.findElement(By.xpath("//body/div/div/div/div/div[2]/div[3]/form/div/div/input")).sendKeys("chandrasekhar"); 
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("chandrasekhar"); 
	   driver.findElement(By.cssSelector("input[value*='Log In']")).click();
	   System.out.println(driver.findElement(By.xpath("//*[contains{@class,'loginError'}]")).getText()); */
	 
	   
 /* WebElement location=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
	Select dropdown=new Select(location);
	dropdown.selectByIndex(2);
	dropdown.selectByVisibleText("USD");
	System.out.println(dropdown.getFirstSelectedOption().getText());
 */
	/*
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[3]/li[9]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"] //*[@id=\"dropdownGroup1\"]/div/ul[3]/li[2]/a")).click();
	*/
 /* driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    driver.findElement(By.id("divpaxinfo")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	try {
		Thread.sleep(2000L);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=1;i<9;i++)
	{
		driver.findElement(By.xpath("//*[@id=\'hrefIncAdt\']")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
*/
	   
	   
	
	  }

}

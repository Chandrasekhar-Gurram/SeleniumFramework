package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple_Selenium_project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_rbtnl_Trip_1\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[8]/a")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //*[@value='MAA']")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date2\']")).click();
       // driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1] //*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
        WebElement location=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
    	Select dropdown=new Select(location);
    	dropdown.selectByVisibleText("USD");
    	driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]")).click();
    	WebElement location1=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]"));
    	Select dropdown1=new Select(location1);
    	dropdown1.selectByIndex(3);
    	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
    	
	}
	
}

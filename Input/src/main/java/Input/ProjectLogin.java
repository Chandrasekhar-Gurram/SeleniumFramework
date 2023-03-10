package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectLogin {
	WebDriver driver;
  public ProjectLogin(WebDriver driver1)
  {
	  this.driver=driver1;
  }
 // By Login=By.linkText("Login");
  By input=By.xpath("//input[class='_2IX_2- VJZDxU']");
  By Password=By.xpath("//input[class='_2IX_2- _3mctLh VJZDxU']");
 /* public WebElement Login()
  {
	  WebElement Log=driver.findElement(Login);
	  return Log;
  }*/
  public WebElement input()
  {
	  WebElement inp=driver.findElement(input);
	  return inp;
  }
  public WebElement Password()
  {
	  WebElement pass=driver.findElement(Password);
	  return pass;
  }
  
}

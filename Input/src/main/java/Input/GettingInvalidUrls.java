package Input;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class GettingInvalidUrls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekhar Gurram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		/*List<WebElement> elements=driver.findElements(By.xpath("//a[contains(@href, 'https:')]"));
		SoftAssert assertion=new SoftAssert();
		for(WebElement element:elements)
		{
			String url= element.getAttribute("href");
			URL ur=new URL(url);
			HttpURLConnection conn=(HttpURLConnection)ur.openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
		    int respCode = conn.getResponseCode();
		    System.out.println(respCode);
		    assertion.assertTrue(respCode<400, "The link with Text "+element.getText()+" is broken with code " +respCode);
		    
		}
		assertion.assertAll(); 
	}*/
    List<WebElement> elements=driver.findElements(By.tagName("a"));	//By.xpath("//a[contains(@href,'h')]")
    System.out.println("Size of links --->"+ elements.size());
	List<WebElement> linklist = driver.findElements(By.tagName("a"));
    System.out.println("Size of full links --->"+ linklist.size());
    List<WebElement> activeLinks =new ArrayList<WebElement>();
    for(int i=0; i<linklist.size(); i++)
    {
        System.out.println(linklist.get(i).getAttribute("href"));
        if(linklist.get(i).getAttribute("href")!=null)
            activeLinks.add(linklist.get(i));
    }
    System.out.println("Size of active links --->"+ activeLinks.size());
    SoftAssert assertion=new SoftAssert();
    for(int j=0; j<activeLinks.size(); j++)
    {
    	String url=activeLinks.get(j).getAttribute("href");
    	URL ur=new URL(url);
        HttpURLConnection connection=(HttpURLConnection) ur.openConnection();
        connection.connect();
        int respCode=connection.getResponseCode();
        System.out.println(respCode);
        assertion.assertTrue(respCode<400, "The link with Text "+activeLinks.get(j).getText()+" is broken with code " +respCode);
       //System.out.println(url +" --->"+response);
    }
    assertion.assertAll();
}

}

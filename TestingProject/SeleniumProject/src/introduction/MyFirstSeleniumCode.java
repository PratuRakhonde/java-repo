package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumCode 
{

	public static void main(String[] args)
	{
      System.setProperty("webdriver.crome.driver", "C:\\Users\\AVI\\Desktop\\chromedriver_win32\\chromedriver.exe");
      
         WebDriver driver= new ChromeDriver();
         
         driver.get("https://www.myntra.com");
         
	}

}
 
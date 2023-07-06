package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GS_Insta {
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.chrome.driver",
				"./Software_2/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@AfterMethod
	public void CloseAppln()
	{
		driver.close();
	}
}

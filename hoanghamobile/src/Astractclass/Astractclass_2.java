package Astractclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Astractclass_2 {
	//Step: Start Web
	public String baseUrl = "https://hoanghamobile.com/Account/Login";
	public String driverPath ="D:\\chrome\\chromedriver.exe";
	public String webdriver = "webdriver.chrome.driver";
	public static WebDriver driver2;
	
	@BeforeTest
	public void before() {
		System.setProperty(webdriver,driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver2 = new ChromeDriver(options);
		driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver2.get(baseUrl);
		driver2.manage().window().maximize();
	}
	@AfterTest
	public void afterTest() {
		driver2.close();
	}
}


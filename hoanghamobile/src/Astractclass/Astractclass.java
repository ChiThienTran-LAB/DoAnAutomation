package Astractclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Astractclass {
	//Step: Start Web
	public String baseUrl = "https://hoanghamobile.com/";
	public String driverPath ="D:\\chrome\\chromedriver.exe";
	public String webdriver = "webdriver.chrome.driver";
	public static WebDriver driver;
	
	@BeforeTest
	public void before() {
		System.setProperty(webdriver,driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

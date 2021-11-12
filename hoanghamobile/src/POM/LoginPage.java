package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Astractclass.Astractclass_2;

public class LoginPage extends Astractclass_2 {
	public static WebElement kq_login_1_2() {
		WebElement lay_error = driver2.findElement(By.xpath("//div[@class='errors just-center text-red']"));
		return lay_error; 
	}
	public static WebElement kq_login_successfully() {
		WebElement lay_error = driver2.findElement(By.xpath("//a[@class='account']/strong"));
		return lay_error;
		
	}
	public static void login_01(String data) {
		WebElement input_username = driver2.findElement(By.xpath("//input[@id='UserName']"));
		input_username.clear();
		input_username.sendKeys(data);
	}
	public static void login_02(String data) {
		WebElement input_password = driver2.findElement(By.xpath("//input[@id='password']"));
		input_password.clear();
		input_password.sendKeys(data);
	}
	public static void login_successfully(String data1, String data2) {
		WebElement input_username = driver2.findElement(By.xpath("//input[@id='UserName']"));
		input_username.clear();
		input_username.sendKeys(data1);
		WebElement input_password = driver2.findElement(By.xpath("//input[@id='password']"));
		input_password.clear();
		input_password.sendKeys(data2);
	}
	//chan qc
	public static void chan_qc() {
		driver2.findElement(By.xpath("//a[@href=\"#close-modal\"]")).click();
	}
	public static void click_login() {
		WebElement btn = driver2.findElement(By.xpath("//button[@class='btn btn-submit']"));
		btn.click();
		return;
	}
}

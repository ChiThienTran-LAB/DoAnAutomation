package POM;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Astractclass.Astractclass;
public class TabletPage extends Astractclass {
	
	public static void tablet_page() {
		WebElement go_to_tablet = driver.findElement(By.xpath("//li[@id='tablet']"));
		go_to_tablet.click();
		return;
	}
	public static void click_sx(String data) {
		List<WebElement> list_nsx = driver.findElements(By.xpath("//div[@class='left']/child::div[1]//div[@class='sub']//a"));
		for(int i=0;i<list_nsx.size();i++) {
			if(list_nsx.get(i).getText().equals(data)==true) {
				list_nsx.get(i).click();
				return;
			}
		}
		
	}
	public static String get_tt_nsx() {
		return driver.getTitle();
	}
	public static void back_web() {
		driver.navigate().back();
	}
	public static void hower() {
		Actions atc = new Actions(driver);
		atc.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Danh mục')]"))).perform();
		return;
	}
}

package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Astractclass.Astractclass;

public class HomePage extends Astractclass {
	
	//lay menu
	public static String get_menu(String ten_menu) {
		List<WebElement> l_menu = driver.findElements(By.xpath("//ul[@class='root']/li//span"));
		for(int i=0;i<l_menu.size();i++) {
			if(l_menu.get(i).getText().equals(ten_menu)==true) {
				l_menu.get(i).click();
			}
		}
		return driver.getTitle(); 
	}
	//chan qc
	public WebElement chan_pc() {
		WebElement qc = driver.findElement(By.xpath("//a[@href=\"#close-modal\"]"));
		return qc;
	}
	//lay thuong hieu
	public static String get_thuonghieu(String th) {
		List<WebElement> l_th = driver.findElements(By.xpath("//div[@class='owl-stage']//label"));
		for(int i=0;i<=l_th.size();i++) {
			if(l_th.get(i).getText().equals(th)==true) {
				l_th.get(i).click();
			}
		}
		return driver.getTitle();
	}
}

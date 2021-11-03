package POM;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Astractclass.Astractclass;

public class HomePage extends Astractclass {
	//chan qc
	public static void chan_qc() {
		driver.findElement(By.xpath("//a[@href=\"#close-modal\"]")).click();
	}
	//back_test
	public static void back_trangchu() {
		driver.get("https://hoanghamobile.com/");	
	}
	//lấy title 
	public static String lay_tt() {
		return driver.getTitle();
	}
	//lay menu
	public static void click_menu(String ten_menu) {
		List<WebElement> l_menu = driver.findElements(By.xpath("//ul[@class='root']/li//span[text()]"));
		for(int i=0;i<l_menu.size();i++) {
			if(l_menu.get(i).getText().equals(ten_menu)==true) {
				l_menu.get(i).click();
				return;
			}
		}
	}
	//lay title
	public static void click_tt(String para) {
		List<WebElement> l_test = driver.findElements(By.xpath("//div[@class='top-navigation']//a[text()]"));
		for(int j=0;j<l_test.size();j++) {
			if(l_test.get(j).getText().equals(para)==true) {
				l_test.get(j).click();
				return;
			}
		}
	}
	//lay thuong hieu
	public static String get_thuonghieu(String th) {
		List<WebElement> l_th = driver.findElements(By.xpath("//div[@class='owl-stage']//label"));
		for(int i=0;i<=l_th.size();i++) {
			if(l_th.get(i).getText().equals(th)==true) {
				l_th.get(i).click();
				break;
			}
		}
		return driver.getTitle();
	}
}

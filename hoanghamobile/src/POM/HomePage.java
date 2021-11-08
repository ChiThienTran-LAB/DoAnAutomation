package POM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import Astractclass.Astractclass;
import Utils.ExcelUtils;
import net.bytebuddy.jar.asm.Handle;

public class HomePage extends Astractclass {
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\hoanghamobile\\src\\resources\\data.xlsx";
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
	public static void click_second_menu(String ten_menu) {
		List<WebElement> l_menu = driver.findElements(By.xpath("//ul[@class='root']//span[contains(text(),'"+ten_menu+"')]"));
		for(int i=0;i<l_menu.size();i++) {
			if(l_menu.get(i).getText().equals(ten_menu)==true) {
				l_menu.get(i).click();
				return;
			}
		}
	}
	//lay title
	public static void click_top_menu(String para) {
		List<WebElement> l_test = driver.findElements(By.xpath("//div[@class='top-navigation']//a[text()]"));
		for(int j=0;j<l_test.size();j++) {
			if(l_test.get(j).getText().equals(para)==true) {
				l_test.get(j).click();
				return;
			}
		}
	}
	//lay thuong hieu
	public static void get_thuonghieu(String th) {
		List<WebElement> l_th = driver.findElements(By.xpath("//div[@class='owl-stage']//label"));
		for(int i=0;i<=l_th.size();i++) {
			if(l_th.get(i).getText().equals(th)==true) {
				l_th.get(i).click();
				return;
			}
		}
	}
	public static void chon_facebook() {
		WebElement cn1 = driver.findElement(By.xpath("//a[@class='blue']"));
		cn1.click();
	}
	public static void chon_youtube() {
		WebElement cn2 = driver.findElement(By.xpath("//a[@class='red']"));
		cn2.click();
	}
	public static void chon_instagram() {
		WebElement cn3 = driver.findElement(By.xpath("//a[@class='rainbow']"));
		cn3.click();
	}
	public static void chon_tiktok() {
		WebElement cn4 = driver.findElement(By.xpath("//a[@class='black']"));
		cn4.click();
	}

	public static String get_title_opend_tab() {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		String kq = driver.switchTo().window(tabs2.get(1)).getTitle();
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    return kq;
	}
}

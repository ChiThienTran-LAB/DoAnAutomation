package POM;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Astractclass.Astractclass;
import Utils.ExcelUtils;


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
	public static String lay_tt_goc() {
		return driver.getTitle();
	}
	//lay title
	public static void click_top_menu(String para) {
		List<WebElement> l_test = driver.findElements(By.xpath("//div[@class='top-navigation']//a"));
		for(int j=0;j<l_test.size();j++) {
			if(l_test.get(j).getText().equals(para)==true) {
				l_test.get(j).click();
				return;
			}
		}
	}
	//chon full hang sx
	public static void click_hang_sx(String data) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='dien-thoai-di-dong']"))).perform();
		List<WebElement> list_nsx = driver.findElements(By.xpath("//li[@id='dien-thoai-di-dong']//ul[@class='display-column format_3']//a"));
		for(int i=0;i<list_nsx.size();i++) {
			if(list_nsx.get(i).getText().equals(data)==true) {
				list_nsx.get(i).click();
				return;
			}
		}
	}
	//chon full menu phụ
	public static void click_phone() {
		WebElement cl_phone = driver.findElement(By.xpath("//li[@id='dien-thoai-di-dong']"));
		cl_phone.click();
		return;
	}
	public static void click_watch() {
		WebElement click_watch = driver.findElement(By.xpath("//li[@id='dong-ho']"));
		click_watch.click();
		return;
	}
	public static void click_laptop() {
		WebElement click_laptop = driver.findElement(By.xpath("//li[@id='laptop']"));
		click_laptop.click();
		return;
	}
	public static void click_tablet() {
		WebElement click_tablet = driver.findElement(By.xpath("//li[@id='tablet']"));
		click_tablet.click();
		return;
	}
	public static void click_loatainghe() {
		WebElement click_loatainghe = driver.findElement(By.xpath("//li[@id='loa-tai-nghe']"));
		click_loatainghe.click();
		return;
	}
	public static void click_smarthome() {
		WebElement click_smarthome = driver.findElement(By.xpath("//li[@id='smart-home']"));
		click_smarthome.click();
		return;
	}
	public static void click_phukien() {
		WebElement click_phukien = driver.findElement(By.xpath("//li[@id='phu-kien']"));
		click_phukien.click();
		return;
	}
	public static void click_dochoicongnghe() {
		WebElement click_dochoicongnghe = driver.findElement(By.xpath("//li[@id='do-choi-cong-nghe']"));
		click_dochoicongnghe.click();
		return;
	}
	public static void click_khosanphamcu() {
		WebElement click_khosanphamcu = driver.findElement(By.xpath("//li[@id='kho-san-pham-cu']"));
		click_khosanphamcu.click();
		return;
	}
	public static void click_dichvusuachua() {
		WebElement click_dichvusuachua = driver.findElement(By.xpath("//li[@id='dich-vu-sua-chua']"));
		click_dichvusuachua.click();
		return;
	}
	public static void click_simthe() {
		WebElement click_simthe = driver.findElement(By.xpath("//li[@id='sim-the']"));
		click_simthe.click();
		return;
	}
	public static void click_tintuc() {
		WebElement click_tintuc = driver.findElement(By.xpath("//li[@id='tin-tuc']"));
		click_tintuc.click();
		return;
	}
	public static void click_khuyenmai() {
		WebElement click_khuyenmai = driver.findElement(By.xpath("//li[@id='tin-khuyen-maiflashsale']"));
		click_khuyenmai.click();
		return;
	}
	public static void click_khuyenmaihot() {
		WebElement click_khuyenmaihot = driver.findElement(By.xpath("//li[@id='khuyen-mai-hot']"));
		click_khuyenmaihot.click();
		return;
	}
	//search phone
	public static void input_and_search_item(String para) throws Exception {
		WebElement send_text = driver.findElement(By.xpath("//input[@id='kwd']"));
		send_text.clear();
		send_text.sendKeys(para);
		driver.findElement(By.xpath("//button[@class='search']")).click();
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

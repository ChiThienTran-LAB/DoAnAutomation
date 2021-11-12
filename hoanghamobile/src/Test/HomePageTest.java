package Test;

import org.testng.annotations.Test;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import Utils.ExcelUtils;
import Astractclass.Astractclass;
import Listener.Listener;
import POM.HomePage;
@Listeners (Listener.class)
public class HomePageTest extends Astractclass {
	//POM
	HomePage objHomePage;
	
	//khai bao du lieu
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\hoanghamobile\\src\\resources\\data.xlsx";
	
	private static final String sheet_name_1 = "Check_Top_Title";
	private static final String sheet_name_2 = "Check_Menu";
	private static final String sheet_name_4 = "Check_4_Menu";
	private static final String sheet_name_5 = "Check_Search";
	private static final String sheet_name_6 = "Check_Thuong_Hieu";
	
	private static final int COL_1 = 1;
	private static final int COL_2 = 2;
	private static final int COL_3 = 3;
	private static final int COL_4 = 4;
	
	
	private static final String Status_Passed = "PASSED";
	private static final String Status_Failed = "FAILED";
		
	@SuppressWarnings("static-access")
	@Test(priority = 1,enabled = true, groups = {"head_menu"})
	public void HomePage_MenuTop_Check() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_1);
		objHomePage.chan_qc();
		for(int x=1;x<=ex.getRowUsed();x++) {
			String tc = ex.getCellData(x, COL_1);
			String data = ex.getCellData(x, COL_2);
			String mongdoi = ex.getCellData(x, COL_3);
			objHomePage.click_top_menu(data);
			String thucte = objHomePage.lay_tt_goc();
			if(thucte.equals(mongdoi)==true) {
				System.out.println("TC " + tc +" PASSED");
				ex.setCellData(x, COL_4, Status_Passed);
			}
			else {
				System.out.println("TC " + tc +" FAILED");
				ex.setCellData(x, COL_4, Status_Failed);
				System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
			}
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 2, enabled = true)
	public void check_dienthoai() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(1, COL_1);
		objHomePage.click_phone();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(1, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(1, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(1, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 3, enabled = true)
	public void check_dongho() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(2, COL_1);
		objHomePage.click_watch();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(2, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(2, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(2, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 4, enabled = true)
	public void check_laptop() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(3, COL_1);
		objHomePage.click_laptop();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(3, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(3, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(3, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 5, enabled = true)
	public void check_tablet() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(4, COL_1);
		objHomePage.click_tablet();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(4, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(4, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(4, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 6, enabled = true)
	public void check_amthanh() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(5, 1);
		objHomePage.click_loatainghe();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(5, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(5, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(5, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 7, enabled = true)
	public void check_smarthome() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(6, COL_1);
		objHomePage.click_smarthome();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(6, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(6, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(6, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 8, enabled = true)
	public void check_phukien() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(7, COL_1);
		objHomePage.click_phukien();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(7, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(7, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(7, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 9, enabled = true)
	public void check_dochoicn() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(8, COL_1);
		objHomePage.click_dochoicongnghe();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(8, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(8, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(8, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 10, enabled = true)
	public void check_maytroi() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(9, COL_1);
		objHomePage.click_khosanphamcu();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(9, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(9, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(9, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 11, enabled = true)
	public void check_suachua() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(10, COL_1);
		objHomePage.click_dichvusuachua();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(10, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(10, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(10, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 12, enabled = true)
	public void check_simthe() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(11, COL_1);
		objHomePage.click_simthe();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(11, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(11, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(11, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 13, enabled = true)
	public void check_tintuc() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(12, COL_1);
		objHomePage.click_tintuc();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(12, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(12, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(12, COL_4, Status_Failed);
		}
		objHomePage.back_trangchu();
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 14, enabled = true)
	public void check_flashsale() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(13, COL_1);
		objHomePage.click_khuyenmai();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(13, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(13, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(13, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(groups = {"menu_2"}, priority = 15, enabled = true)
	public void check_CTKM() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_2);
		String tc = ex.getCellData(14, COL_1);
		objHomePage.click_khuyenmaihot();
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(14, COL_3);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(14, COL_4, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			System.out.println("MD: "+ mongdoi + "TT: " + thucte);
			ex.setCellData(14, COL_4, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}

	//check các link liên kết đến hoanghamoblie.com	
	@SuppressWarnings("static-access")
	@Test (groups = {"4_nut_nho"}, priority = 16, enabled = true)
	public void check_fb() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_4);
		objHomePage.chon_facebook();
		String mongdoi = ex.getCellData(1, COL_2);
		String thucte = objHomePage.get_title_opend_tab();
		if(thucte.equals(mongdoi)==true) { 
			ex.setCellData(1, COL_3, Status_Passed); 
		}
		else {
			ex.setCellData(1, COL_3, Status_Failed);
			System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test (groups = {"4_nut_nho"}, priority = 17, enabled = true)
	public void check_youtube() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_4);
		objHomePage.chon_youtube();
		String mongdoi = ex.getCellData(2, COL_2);
		String thucte = objHomePage.get_title_opend_tab();
		if(thucte.equals(mongdoi)==true) { 
			ex.setCellData(2, COL_3, Status_Passed); 
		}
		else {
			ex.setCellData(2, COL_3, Status_Failed);
			System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test (groups = {"4_nut_nho"}, priority = 18, enabled = true)
	public void check_instagram() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_4);
		objHomePage.chon_instagram();
		String mongdoi = ex.getCellData(3, COL_2);
		String thucte = objHomePage.get_title_opend_tab();
		if(thucte.equals(mongdoi)==true) { 
			ex.setCellData(3, COL_3, Status_Passed); 
		}
		else {
			ex.setCellData(3, COL_3, Status_Failed);
			System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test (groups = {"4_nut_nho"}, priority = 19, enabled = true)
	public void check_tiktok() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_4);
		objHomePage.chon_tiktok();
		String mongdoi = ex.getCellData(4, COL_2);
		String thucte = objHomePage.get_title_opend_tab();
		if(thucte.equals(mongdoi)==true) { 
			ex.setCellData(4, COL_3, Status_Passed); 
		}
		else {
			ex.setCellData(4, COL_3, Status_Failed);
			System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(priority = 20,enabled = true, groups = {"search"})
	public void check_search_items() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_5);
		String data = ex.getCellData(1, COL_2);
		objHomePage.input_and_search_item(data);
		String thucte = objHomePage.lay_tt_goc();
		String mongdoi = ex.getCellData(1, COL_3);
		if(thucte.equals(mongdoi)==true) {
			ex.setCellData(1, COL_4, Status_Passed);
		}
		else {
			ex.setCellData(1, COL_4, Status_Failed);
			System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(priority = 21,enabled = true, groups = {"hang_sx"})
	public void check_hangsx() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_6);
		for(int i=1;i<=ex.getRowUsed();i++) {
			String data = ex.getCellData(i, COL_2);
			objHomePage.click_hang_sx(data);
			String thucte = objHomePage.lay_tt_goc();
			String mongdoi = ex.getCellData(i, COL_3);
			if(thucte.equals(mongdoi)==true) {
				ex.setCellData(i, COL_4, Status_Passed);
			}
			else {
				ex.setCellData(i, COL_4, Status_Failed);
				System.out.println("Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
			}
			ex.closeandsaveFile(path_file);
		}
	}
	
}







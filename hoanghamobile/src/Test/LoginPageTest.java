package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Astractclass.Astractclass_2;
import Listener.Listener;
import Utils.ExcelUtils;
import POM.LoginPage;
@Listeners (Listener.class)
public class LoginPageTest extends Astractclass_2 {
	//POM
	LoginPage objLoginPage;
	//khai bao data
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\hoanghamobile\\src\\resources\\data.xlsx";
	
	private static final String sheet_name = "Check_Login";
	private static final String Status_Passed = "PASSED";
	private static final String Status_Failed = "FAILED";

	
	@SuppressWarnings("static-access")
	@Test(priority = 0, enabled = true, groups = {"login"})
	public void LGP_01() throws Exception {
		objLoginPage.chan_qc();
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name);
		String tc = ex.getCellData(1, 1);
		String data = ex.getCellData(1, 2);
		objLoginPage.login_01(data);
		objLoginPage.click_login();
		String thucte = objLoginPage.kq_login_1_2().getText();
		String mongdoi = ex.getCellData(1, 4);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(1, 5, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
			ex.setCellData(1, 5, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(priority = 1, enabled = true, groups = {"login"})
	public void LGP_02() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name);
		String tc = ex.getCellData(2, 1);
		String data = ex.getCellData(2, 2);
		objLoginPage.login_02(data);
		objLoginPage.click_login();
		String thucte = objLoginPage.kq_login_1_2().getText();
		String mongdoi = ex.getCellData(2, 4);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(2, 5, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
			ex.setCellData(2, 5, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	
	@SuppressWarnings("static-access")
	@Test (priority = 2, enabled = true, groups = {"login"})
	public void LGP_03() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name);
		String tc = ex.getCellData(3, 1);
		String data = ex.getCellData(3, 2);
		String data1 = ex.getCellData(3, 2);
		String data2 = ex.getCellData(3, 3);
		objLoginPage.login_successfully(data1, data2);
		objLoginPage.click_login();
		String thucte = objLoginPage.kq_login_successfully().getText();
		String mongdoi = ex.getCellData(3, 4);
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(3, 5, Status_Passed);
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
			ex.setCellData(3, 5, Status_Failed);
		}
		ex.closeandsaveFile(path_file);
	}
	
	
	

	
	
}
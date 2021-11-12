package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.TabletPage;
import Astractclass.Astractclass;
import Utils.ExcelUtils;
import Listener.Listener;

@Listeners (Listener.class)
public class TabletPageTest extends Astractclass {
	//POM
	TabletPage objSmartHomePage;
	
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\hoanghamobile\\src\\resources\\data.xlsx";
	
	private static final String sheet_name = "Check_Tablet";
	private static final String Status_Passed = "PASSED";
	private static final String Status_Failed = "FAILED";
	
	@SuppressWarnings("static-access")
	@Test (priority = 22, enabled = true, groups = {"tablet"})
	public void check_thuonghieu() throws Exception {
	ExcelUtils ex= new ExcelUtils();
	ex.setExcelFile(path_file, sheet_name);
	objSmartHomePage.tablet_page();
	
	for(int x =1; x<=ex.getRowUsed();x++) {
		String tc = ex.getCellData(x, 1);
		String data = ex.getCellData(x, 2);
		String mongdoi = ex.getCellData(x, 3);
		objSmartHomePage.hower();
		objSmartHomePage.click_sx(data);
		String thucte = objSmartHomePage.get_tt_nsx();
		if(thucte.equals(mongdoi)==true) {
			System.out.println("TC " + tc +" PASSED");
			ex.setCellData(x, 4, Status_Passed);	
		}
		else {
			System.out.println("TC " + tc +" FAILED");
			ex.setCellData(x, 4, Status_Failed);
			System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
		}
		objSmartHomePage.back_web();
	}
	ex.closeandsaveFile(path_file);
}
}

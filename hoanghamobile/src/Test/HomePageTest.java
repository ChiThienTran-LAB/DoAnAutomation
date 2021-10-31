package Test;

import org.testng.annotations.Test;
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
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\data.xlsx";
	private static final String sheet_name = "Check_ThuongHieu";
	private static final String sheet_name_2 = "Check_Menu";
	private static int COL_DATA = 2;
	private static int COL_MONGDOI = 4;
	private static int COL_KETQUA = 5;
	private static String Status_Passed = "PASSED";
	private static String Status_Failed = "FAILED";
	
	@SuppressWarnings("static-access")
	@Test(priority = 0,enabled = false)
	public void chonthuonghieu() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name);
		int size_row = ex.getRowUsed();
		objHomePage.chan_pc(); // chặn quảng cáo
		for(int i = 1; i<=size_row; i++)
		{
			String data_1 = ExcelUtils.getCellData(i,COL_DATA);
			String mongdoi = ExcelUtils.getCellData(i,COL_MONGDOI);
			String thucte = objHomePage.get_thuonghieu(data_1);
			if(thucte.equals(mongdoi)==true) {
				ExcelUtils.setCellData(i, COL_KETQUA, Status_Passed);
			}
			else {
				ExcelUtils.setCellData(i, COL_KETQUA, Status_Failed);
			}
		}
	}	
	@SuppressWarnings("static-access")
	@Test(priority = 0)
	public void click_test() throws Exception {
		ExcelUtils.setExcelFile(path_file,"Check_Title");
		objHomePage.chan_pc();
		for(int x=1;x<=ExcelUtils.getRowUsed();x++) {
			String data = ExcelUtils.getCellData(x, 2);
			String mongdoi = ExcelUtils.getCellData(x, 4);
			objHomePage.click_tt(data);
			String thucte = objHomePage.lay_tt();
			if(thucte.equals(mongdoi)==true) {
				ExcelUtils.setCellData(x, 5, Status_Passed);
			}
			else {
				ExcelUtils.setCellData(x, 5, Status_Failed);
			}
		}
//		objHomePage.click_tt("Tuyển dụng");
//		String kq = objHomePage.lay_tt();
//		System.out.println("Page title: "+kq);
	}
	@SuppressWarnings("static-access")
	@Test(priority = 1,enabled = false)
	public void chon_menu() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_2);
		for(int i=1;i<=ex.getRowUsed();i++) { //chạy toàn bộ row
			String data_1 = ExcelUtils.getCellData(i,COL_DATA); //điện thoại
			String mongdoi = ExcelUtils.getCellData(i,COL_MONGDOI);	//Điện thoại di động giá rẻ, chính hãng - Hoàng Hà Mobile
			String thucte =objHomePage.get_menu(mongdoi); //lấy title của menu đó VD: Điện thoại di động giá rẻ, chính hãng - Hoàng Hà Mobile
			if(thucte.equals(mongdoi)==true) { //so sánh kết quả
				ExcelUtils.setCellData(i, COL_KETQUA, "PASSED"); //đưa vào chữ PASSED nếu kết quả là true
			}
			else {
				ExcelUtils.setCellData(i, COL_KETQUA, "Failed"); // đưa vào chữ Failed nếu kết quả là false
			}
			
		}
		
	}
}








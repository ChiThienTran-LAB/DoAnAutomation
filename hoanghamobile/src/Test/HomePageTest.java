package Test;

import org.testng.annotations.Listeners;
import Utils.ExcelUtils;
import Astractclass.Astractclass;
import Listener.Listener;
import POM.HomePage;
import org.testng.annotations.Test;

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
				ExcelUtils.setCellData(i, COL_KETQUA, "PASSED");
			}
			else {
				ExcelUtils.setCellData(i, COL_KETQUA, "Failed");
			}
		}
	}	
	@Test(priority = 1)
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








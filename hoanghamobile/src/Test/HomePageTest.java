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
	private static final String path_file = "D:\\DOAN\\DoAnAutomation\\hoanghamobile\\src\\resources\\data.xlsx";
	
	private static final String sheet_name = "Check_ThuongHieu";
	private static final String sheet_name_2 = "Check_Menu";
	private static final String sheet_name_3 = "Check_Title";
	
	private static final int COL_DATA = 2;
	private static final int COL_MONGDOI = 3;
	private static final int COL_KETQUA = 4;
	
	private static final String Status_Passed = "PASSED";
	private static final String Status_Failed = "FAILED";
	
	@SuppressWarnings("static-access")
	@Test(priority = 0,enabled = false)
	public void chonthuonghieu() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name);
		int size_row = ex.getRowUsed();
		objHomePage.chan_qc(); // chặn quảng cáo
		for(int i = 1; i<=size_row; i++)
		{
			String data_1 = ExcelUtils.getCellData(i,COL_DATA);
			String mongdoi = ExcelUtils.getCellData(i,COL_MONGDOI);
			objHomePage.get_thuonghieu(data_1);
			String thucte = "";
			if(thucte.equals(mongdoi)==true) {
				ExcelUtils.setCellData(i, COL_KETQUA, Status_Passed);
			}
			else {
				ExcelUtils.setCellData(i, COL_KETQUA, Status_Failed);
			}
		}
	}	
	@SuppressWarnings("static-access")
	@Test(priority = 0,enabled = true)
	public void HomePage_MenuTop_Check() throws Exception {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcelFile(path_file, sheet_name_3);
		int rows = ex.getRowUsed();
		objHomePage.chan_qc();
		for(int x=1;x<rows;x++) {
			String tc = ex.getCellData(x, 1);
			String data = ex.getCellData(x, COL_DATA);
			String mongdoi = ex.getCellData(x, COL_MONGDOI);
			objHomePage.click_top_menu(data);
			String thucte = objHomePage.lay_tt();
			if(thucte.equals(mongdoi)==true) {
				System.out.println("TC " + tc +" PASSED");
				ex.setCellData(x, COL_KETQUA, Status_Passed);
			}
			else {
				System.out.println("TC " + tc +" FAILED");
				ex.setCellData(x, COL_KETQUA, Status_Failed);
				System.out.println("Du lieu xet: "+data + " Mong doi: "+ mongdoi + " KQ Thuc Te: " +thucte);
			}
		}
		ex.closeandsaveFile(path_file);
	}
	@SuppressWarnings("static-access")
	@Test(priority = 1, enabled = true)
	public void Check_menu_duoi() throws Exception {
		ExcelUtils ex= new ExcelUtils();
		ex.setExcelFile(path_file,sheet_name_2);
		int rows = ex.getRowUsed();
		//objHomePage.chan_qc();
		objHomePage.back_trangchu();
		for(int i=1;i<rows;i++) { //chạy toàn bộ row
			String tc = ex.getCellData(i, 1);
			String data = ex.getCellData(i,COL_DATA); //điện thoại
			String mongdoi = ex.getCellData(i,COL_MONGDOI);	//Điện thoại di động giá rẻ, chính hãng - Hoàng Hà Mobile
			objHomePage.click_second_menu(data); 
			String thucte = objHomePage.lay_tt(); //lấy title của menu đó VD: Điện thoại di động giá rẻ, chính hãng - Hoàng Hà Mobile
			if(thucte.equals(mongdoi)==true) { //so sánh kết quả
				System.out.println("TC " + tc +" PASSED");
				System.out.println(thucte);
				ex.setCellData(i, COL_KETQUA, Status_Passed); //đưa vào chữ PASSED nếu kết quả là true
			}
			else {
				System.out.println("TC " + tc +" FAILED");
				ex.setCellData(i, COL_KETQUA, Status_Failed); // đưa vào chữ Failed nếu kết quả là false
				System.out.println("Du lieu xet: " + data + " Mong doi: " + mongdoi + " KQ Thuc Te: " + thucte);
			}
			
		}
		ex.closeandsaveFile(path_file);
	}
}








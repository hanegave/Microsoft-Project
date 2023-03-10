package GenericLiberaries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class contaions resualble method to perform operations on Excel workbook
 * @author Vaibhav
 *
 */

public class ExcelUtility {
	private Workbook wb;
	public void excelInitialization(String excelPath) { 
		FileInputStream fis = null;
		 try {
			fis= new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 try {
			wb= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * this method is used to fetch the single data from excel
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String FetchDataFromExcel(String SheetName, int rowNum, int cellNum) {
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/**
	 * This method used to fetch the multiple data from excel
	 * @param sheetName
	 * @return
	 */
	
	public List<String> FetchDataFromExcel(String sheetName){
		List<String> dataList= new ArrayList<>();
		Sheet sheet= wb.getSheet(sheetName);
		for(int i=0; i<4; i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			dataList.add(data);
		}
		return dataList;
	}
	/**
	 * this method used to close the workbook
	 */
	public void closeExcel() {
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

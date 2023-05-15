package SeleniumMamla;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFrom_Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./smruti.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(0).getLastCellNum();
		String row1=" ";
		for (int i = 0; i <=row; i++) {
			
			String slno=wb.getSheet("Sheet1").getRow(0).getCell(i).getStringCellValue();
			String empId=wb.getSheet("Sheet1").getRow(1).getCell(i).getStringCellValue();
			String name=wb.getSheet("Sheet1").getRow(2).getCell(i).getStringCellValue();
			String Adhar=wb.getSheet("Sheet1").getRow(3).getCell(i).getStringCellValue();
			String pan=wb.getSheet("Sheet1").getRow(4).getCell(i).getStringCellValue();
			 System.out.println(slno+ " " +empId+ " " +name+ " " +Adhar+ " " +pan);
		
		}
		
	}

}

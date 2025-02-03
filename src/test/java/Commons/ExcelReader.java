package Commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String [] [] credentials = new String [100] [100];
	int i = 0,j=0;

public String readExcelSheet(int rowvalue, int colvalue) throws IOException {
	
		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/testdata.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Iterator<Row> row = sheet.rowIterator();
		
		while(row.hasNext()) {
			
			Row currRow = row.next();
			Iterator<Cell> cell = currRow.cellIterator();
			
			while(cell.hasNext()) {
				Cell currCell = cell.next();
				i=currCell.getRowIndex();
				j=currCell.getColumnIndex();				
				credentials[i][j] = currCell.getStringCellValue();
			}
		}
		workbook.close();
		String cellvalue = credentials[rowvalue][colvalue];
		return cellvalue;
	}

public String getusername(int rownumber) throws IOException {
	String username = null;	
	username = readExcelSheet(rownumber, 0);
	LoggerLoad.info("Username is:"+username);
	return username;	
}

public String getpassword(int rownumber) throws IOException {
	String password = null;	
	password = readExcelSheet(rownumber, 1);
	LoggerLoad.info("Password is:"+password);
	return password;	
}

}
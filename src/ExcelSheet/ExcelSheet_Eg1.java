package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Eg1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile =new File("C:\\Users\\HP\\Documents\\Book3.xlsx");
     String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
     System.out.println("Value is "+value);
		
	}
}

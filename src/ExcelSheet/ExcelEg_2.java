package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg_2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile =new File("C:\\Users\\HP\\Documents\\Book4.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//String cell type
     Cell myCell1 = mySheet.getRow(0).getCell(0);
	 System.out.println(myCell1.getCellType());
	 
	 String myValue1 = myCell1.getStringCellValue();
     System.out.println(myValue1);	
	System.out.println("=================================");
	
	//Boolean cell value
	Cell myCell2 = mySheet.getRow(0).getCell(1);
	System.out.println(myCell2.getCellType());
	
	boolean myValue2 = myCell2.getBooleanCellValue();
	System.out.println(myValue2);
	
	System.out.println("=================================");
	
	//numeric cell value
	Cell myCell3 = mySheet.getRow(5).getCell(2);
	System.out.println(myCell3.getCellType());
	
	double myValue3 = myCell3.getNumericCellValue();
	System.out.println(myValue3);
	System.out.println("=================================");
	
	
	
	}

}

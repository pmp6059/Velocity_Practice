package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg_5 {
	 static CellType isBlank;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File myfile=new File("C:\\Users\\HP\\Documents\\Book4.xlsx");
		   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		   
		   //Outer for-->rows-->0-1
		for(int row = 0;row<=9;row++)
		{
			//inner for-->0-2
			for(int cell = 0;cell<=4;cell++)
			{
			 CellType type = mySheet.getRow(row).getCell(cell).getCellType();
			 if(type==CellType.STRING) {
				String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
				System.out.print(value +" ");
				}
	 
			 else if(type==CellType.NUMERIC) {
				 double value = mySheet.getRow(row).getCell(cell).getNumericCellValue();
				 System.out.print(value +" ");
				 }
			 
			 else if(type==CellType.BOOLEAN) 
			 {
		    boolean value = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
				 System.out.print(value +" ");
			 }
			 
			 else if(type==isBlank)
			 {
				System.out.print(" "); 
			 }
			 
			System.out.println();	 
			}
		} 
	}
}

package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg_6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 File myfile=new File("C:\\Users\\\\HP\\Documents\\Book4.xlsx");
		   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		 
		   int totalNoofRows = mySheet.getLastRowNum();
		   System.out.println("Total no of rows in sheet are "+totalNoofRows);
		   
		  short lastCellNo = mySheet.getRow(0).getLastCellNum();
		  
		 int totalNoofCells = lastCellNo-1;
		  System.out.println("Total cells in sheet are "+totalNoofCells);
		  System.out.println();
		  
		  
		  for(int row=0;row<=totalNoofRows;row++)
		  {		  
			  for(int cell=0;cell<=totalNoofCells;cell++)
			  {
				 Cell myCell = mySheet.getRow(row).getCell(cell);
				CellType type = myCell.getCellType();
	       
				
	             if(type==CellType.STRING)
				 {
					 System.out.print(myCell.getStringCellValue()+" ");
				 }
		  
				 else if(type==CellType.NUMERIC)
				 {
					 System.out.println(myCell.getNumericCellValue()+" ");
				 }
				 else if(type==CellType.BOOLEAN)
				 {
                System.out.println(myCell.getBooleanCellValue()+" ");
				 }
				
				 else if(type==CellType._NONE)
				 {
					 System.out.println("Blank");
				 } 
			  }
			 System.out.println();
		  }
	}

}

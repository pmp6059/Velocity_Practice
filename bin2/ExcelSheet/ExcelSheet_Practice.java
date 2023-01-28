package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Practice
{public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     File myfile=new File("C:\\Users\\HP\\Documents\\Book4.xlsx");
	     Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	     
	    Cell Type = mySheet.getRow(0).getCell(1);
        System.out.println(Type.getCellType());
        
        String Value1 = Type.getStringCellValue();
        System.out.println(Value1);
        
        System.out.println("=====================");
	     
        for(int row = 0;row<=9;row++)
        {
        	for(int cell = 0;cell<=4;cell++)
        	{
        		Cell myCell = mySheet.getRow(row).getCell(cell);
        	    CellType Type1 = myCell.getCellType();
        	    
        	    if(Type1==CellType.STRING)
        	    {
        	       System.out.println(myCell.getStringCellValue()+" ");
        	    }
        	    
        	    else if(Type1==CellType.NUMERIC)
        	    {
        	    	System.out.println(myCell.getNumericCellValue()+ " ");
        	    }
        	    
        	    else if(Type1==CellType.BOOLEAN)
        	    {
        	    	System.out.println(myCell.getBooleanCellValue()+ " ");
        	    }
        	   
        	}
        	 System.out.println();
        	
        }

}

}

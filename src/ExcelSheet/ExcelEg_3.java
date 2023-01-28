package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg_3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\\\HP\\Documents\\Book4.xlsx");
	   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	
	//how to read whole row--> Cell is varying and row is constant
	   for(int i=0;i<=6;i++)
	   {
		  String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();
		   System.out.print(myValue+" ");
	   }
	   System.out.println();
	   System.out.println("=============================");
	   
	 //how to read whole cell(Column)--> here row is varying and cell is constant
	for(int i = 0;i<=4;i++)
	{
		String myValue = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(myValue);
	}
	System.out.println("=============================");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

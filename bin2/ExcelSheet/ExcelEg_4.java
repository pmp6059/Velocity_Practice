package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg_4 {

 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 File myfile=new File("C:\\Users\\\\HP\\Documents\\Book4.xlsx");
	   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
	   //read all same type of data from excel
	   //Outer for loop-->rows-->0-2
   
	for(int row=0;row<=9;row++)
	{
		//inner for loop-->cells-->
		for(int cell = 0;cell<=1;cell++)
		{
			//read all data from sheet
		String myvalue = mySheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.print(myvalue+" ");
		}
		System.out.println();
	}
	System.out.println("====================");
	for(int row=1;row<=9;row++) 
	{
		//inner for loop-->cell
		for(int cell = 2;cell<=3;cell++) 
		{
			double myValue1 = mySheet.getRow(row).getCell(cell).getNumericCellValue();
			System.out.print(myValue1+" ");
		}
		System.out.println();
	}
	System.out.println("====================");
	
	for(int row = 0;row<=0;row++) {
		for(int cell = 0;cell<=6;cell++) {
			String myValue2 = mySheet.getRow(row).getCell(cell).getStringCellValue();
			System.out.print(myValue2+" ");
		}
		
	}
 }

}

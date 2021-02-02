package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel (String excelfile) throws IOException {
		
		//open workbook and add pathway
				XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelfile+".xlsx");
				
				XSSFSheet page = wb.getSheetAt(0);
				
				int RowCount = page.getLastRowNum();
				System.out.println(RowCount);
				
				int ColumnCount = page.getRow(0).getLastCellNum();
				System.out.println(ColumnCount);
				
				String [] [] data = new String [RowCount] [ColumnCount];
				
				for (int i = 1; i <= RowCount; i++) {
					XSSFRow row = page.getRow(i);
					
					for (int j = 0; j < ColumnCount; j++) {
						XSSFCell cell = row.getCell(j);
						
						String CellValue = cell.getStringCellValue();
						System.out.println(CellValue);
						
						//Copy Paste first line from under @DataProvider
						data [i-1][j]= CellValue;
						
					}
				}
		
		
				return data;
				
		
		
		
		}
		
		
	}



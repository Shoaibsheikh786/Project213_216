package com.insurance.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	static File file;
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sheet;
	static Cell cell;
    static String[] data;
	public static String[] readExcelFile() {
		file = new File("./ExcelFiles/ageOfBuilding.xlsx");
		try {
			fis=new FileInputStream(file);
			wb=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		sheet=wb.getSheetAt(0);
		data=new String[sheet.getLastRowNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{  
			Row row=sheet.getRow(i);

			data[i]=row.getCell(0).toString();
			
		}
		return data;
		
		
	}
	


}

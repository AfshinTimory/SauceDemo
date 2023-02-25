package ParticeProject.tests;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ApachiDemo {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\Afshin Timory\\Desktop\\Names.xlsx";
        FileInputStream input = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int NumRow = sheet.getLastRowNum();
        XSSFRow row = sheet.getRow(1);
        for (int i = 0; i<=NumRow; i++){
            System.out.println();
            int NumCell = sheet.getRow(i).getLastCellNum();
            for (int j = 0; j < NumCell; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"       ");


            }
        }

        Iterator iterator = sheet.iterator();
        while (iterator.hasNext()){
            XSSFRow rowd = (XSSFRow) iterator.next();
            Iterator cellIterator = rowd.cellIterator();
            while (cellIterator.hasNext()){
                
            }
        }





    }
}

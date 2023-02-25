package ParticeProject.tests;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WrtitingToExcelFile {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet3");

        Object info[][] = {{"ID", "Name", "LastName"},
                {1, "Karim", "Bagheri"},
                {2, "Ahmad", "Mohammady"},
                {3, "Maroof", "Sharifi"}


        };

        int row = info.length;
        int col = info[0].length;

        int r;
        for (r = 0; r < row; r++) {
            XSSFRow createrow = sheet.createRow(r);

        for (int c = 0; c < info[r].length; c++) {
            XSSFCell creatCell = createrow.createCell(c);

            Object value = info[r][ c];
            if(value instanceof String)
                creatCell.setCellValue((String) value);
            if(value instanceof Integer)
                creatCell.setCellValue((Integer)value);
        }



    }
        FileOutputStream outputStream = new FileOutputStream("information.xlsx");
        workbook.write(outputStream);

        outputStream.close();
        System.out.println("file has been created sucessfully");
}}

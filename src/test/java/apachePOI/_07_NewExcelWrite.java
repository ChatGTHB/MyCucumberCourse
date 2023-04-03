package apachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Page 1");

        Row newRow = sheet.createRow(0);
        Cell newCell= newRow.createCell(0);
        newCell.setCellValue("Hello World!");

        String path = "src/test/java/apachePOI/resource/NewExcel.xlsx";

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Transactions completed.");
    }
}

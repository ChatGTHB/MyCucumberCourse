package apachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/apachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream fileReadingConnection = new FileInputStream(path);

        Workbook studyBook = WorkbookFactory.create(fileReadingConnection);

        Sheet studyPage = studyBook.getSheet("Sheet1");

        Row row = studyPage.getRow(0);

        Cell cell= row.getCell(0);

        System.out.println(cell);
    }
}

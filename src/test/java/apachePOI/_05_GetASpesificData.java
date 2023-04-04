package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

public class _05_GetASpesificData {
    public static void main(String[] args) {
        /**
         * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
         * bulup ve sonucun döndürülmesi için metod kullanınız.
         * src/test/java/ApachePOI/resources/LoginData.xlsx
         */


        Scanner input = new Scanner(System.in);
        System.out.print("Enter searched work : ");
        String searchedWord = input.nextLine();

        String rotatingResult = findFromExcel(searchedWord);
        System.out.println("rotatingResult = " + rotatingResult);

    }

    private static String findFromExcel(String searchedWord) {
        String willReturn = "";
        String path = "src/test/java/apachePOI/resources/LoginData.xlsx";
        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchedWord)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    willReturn+=sheet.getRow(i).getCell(j) + "\t";
                }
            }
        }
        return willReturn;
    }
}

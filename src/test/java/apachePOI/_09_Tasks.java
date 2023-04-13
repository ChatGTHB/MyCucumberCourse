package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09_Tasks {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan istediği kolon sayısını aldıktan sonra
         * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
         * bir fonksiyonda ArrayListe çevirerek mainden yazdırınız
         * src/test/java/ApachePOI/resources/ApacheExcel2.xlsx
         */

        String path = "src/test/java/apachePOI/resources/ApacheExcel2.xlsx";
        String sheetName="testCitizen";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of columns you want : ");
        int column= input.nextInt();

       List< List<String>> rotatingResults = getData(path,sheetName,column);

        for (int i = 0; i < rotatingResults.size(); i++) {
            for (int j = 0; j < rotatingResults.get(i).size(); j++) {
                System.out.print(rotatingResults.get(i).get(j)+"\t");
            }
            System.out.println();
        }
       // System.out.println("rotatingResults = " + rotatingResults);
    }

    public static List<List<String>> getData(String path,String sheetName,int column) {

        List< List<String>> table=new ArrayList<>();

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            List<String>row=new ArrayList<>();
                for (int j = 0; j < column; j++) {
                    row.add(sheet.getRow(i).getCell(j).toString());
                }
                table.add(row);
        }
        return table;
    }
}

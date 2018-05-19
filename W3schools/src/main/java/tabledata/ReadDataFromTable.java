package tabledata;

import base.CommonAPI;
import reporting.TestLogger;

import java.util.List;

public class ReadDataFromTable extends CommonAPI {

     public void readData(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         List<String> list = getTextFromWebElements(".w3-table-all.notranslate tr");
         //String cellData = getTextByCss(".w3-table-all.notranslate tr:nth-child(3) td:nth-child(2)");
         for(int i=0; i<list.size(); i++) {
             System.out.println(list.get(i));
         }
     }
}

package testcelldata;

import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import tabledata.ReadDataFromTable;

public class TestReadDataFromTable extends ReadDataFromTable {

    @Test
    public void read(){
        ApplicationLog.epicLogger("");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readData();
    }
}

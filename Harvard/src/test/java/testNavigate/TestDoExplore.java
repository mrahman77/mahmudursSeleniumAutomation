package testNavigate;

import base.CommonAPI;
import goNavigate.DoExplore;
import org.testng.annotations.Test;
import reporting.TestLogger;


@Test
public class TestDoExplore extends DoExplore {
    public void testPlayArround() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playArround();
    }
}

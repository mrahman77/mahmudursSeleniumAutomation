package testNavigate;

import googleSheets.AutomationTest;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class TestGoogleSheets extends AutomationTest {
    public void tgs() throws IOException {
    verifyProfileInfo();
    }
}

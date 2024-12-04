package tests;

import common.MyScreenRecorder;
import common.PageBase;
import common.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.P01_LoginPage;

public class TC01_LoginPage extends TestBase {


    String userUserName = "Admin";
    String userPassword = "admin123";


    @Test(priority = 1, description = "Enter login data")
    public void enterLoginCred() throws Exception {

        // action
        new P01_LoginPage(driver).enterUserName(userUserName).enterPassword(userPassword).clickLogin();


    }



}

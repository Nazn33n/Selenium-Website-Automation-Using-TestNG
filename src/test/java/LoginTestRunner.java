import Nazneen.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;
    @Test
    public void doLogin() throws IOException {
        loginPage=new LoginPage(driver);
        driver.get("https://restaurant.quicklyservices.com/account/login");
        boolean isLogoutFound= loginPage.DoLogin("itsnazn33n@gmail.com", "Naz@1234");
        Assert.assertEquals(isLogoutFound,true);
    }
}


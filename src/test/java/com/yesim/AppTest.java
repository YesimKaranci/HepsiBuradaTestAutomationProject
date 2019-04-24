package com.yesim;

import com.yesim.base.BaseTest;
import com.yesim.page.LoginPage;
import org.junit.Test;

public class AppTest extends BaseTest
{

    @Test
    public void successLogin() {
        new LoginPage(driver).login("asdf@gmail.com","sdfqwegh");  }

 @Test
    public void ProductSearch() {
        new LoginPage(driver).ProductSearch("iPhone");  }


}

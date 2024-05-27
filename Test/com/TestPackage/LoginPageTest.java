package com.TestPackage;

import org.testng.annotations.Test;
import com.BasePackage.BaseClass;
import com.ObjectPage.LoginPage;


public class LoginPageTest extends BaseClass{
	
	@Test (priority=1)
	public void UserLogin() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.clickAllowEmulator();
		LP.RefreshAppData();
		PleaseWaitForFortySeconds();
		LP.Login("Soba.nonso","3456");
		PleaseWaitForFiveSeconds();
	}
}

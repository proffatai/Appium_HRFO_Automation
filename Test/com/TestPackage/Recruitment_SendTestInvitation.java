package com.TestPackage;

import org.testng.annotations.Test;
import com.ObjectPage.SendInvitation;

import com.ObjectPage.LoginPage;
import com.ObjectPage.Recruitment;
import com.ObjectPage.HomeScreen;
import com.ObjectPage.SelectModule;

public class Recruitment_SendTestInvitation extends LoginPageTest{

	@Test (priority=1)
	public void Recruitment_sendInvitation() throws InterruptedException {
		
		
		
		
		LoginPage LP = new LoginPage(driver);
		LP.clickAllowEmulator();
		LP.RefreshAppData();
		PleaseWaitForFortySeconds();
		LP.Login("Soba.nonso","3456");
		
		HomeScreen HS = new HomeScreen(driver);
		HS.clickHRFO();
		
		SelectModule sm =new SelectModule(driver);
		sm.clickRecruitment();
		
		Recruitment recruit = new Recruitment (driver);
		recruit.sendTestInvitation();
		
		SendInvitation sendInvite= new SendInvitation(driver);
		sendInvite.invite("Scholars school", "Imokun street", "Poka", "Epe", "08125565477", "Book and Pencil", "Babban Gona", "Null");
		 
	}
}

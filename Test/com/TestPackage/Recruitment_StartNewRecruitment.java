package com.TestPackage;

import org.testng.annotations.Test;
import com.ObjectPage.StartNewRecruitment;

import com.ObjectPage.Recruitment;
import com.BasePackage.BaseClass;
import com.ObjectPage.HomeScreen;
import com.ObjectPage.LoginPage;
import com.ObjectPage.SelectModule;

public class Recruitment_StartNewRecruitment extends BaseClass{

	
	@Test (priority=1)
	public void UserLogin() throws InterruptedException {	
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
		recruit.startNewRecruitment();
		
		StartNewRecruitment newRecruit= new StartNewRecruitment(driver);
		newRecruit.dontAssign();
		 
	}
	
	
	
	
	
	
	
	
}

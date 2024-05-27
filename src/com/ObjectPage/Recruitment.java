package com.ObjectPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Recruitment {
	private AndroidDriver driver;
	
	public Recruitment(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Start New Recruitment']")
	private WebElement startRecruit;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send Test Invitation']")
	private WebElement sendTestInvite;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Insert Candidate Details']")
	private WebElement insertCandidate;
	

	@AndroidFindBy(id="com.babbangona.agricos:id/btn_select_sub_module_next")
	private WebElement next;
	
	public void startNewRecruitment() throws InterruptedException {
		startRecruit.click();
		next.click();
	}
	
	public void sendTestInvitation() throws InterruptedException {
		sendTestInvite.click();
		next.click();
	}
	
	
	public void InsertCandidateDetails() throws InterruptedException {
		insertCandidate.click();
		next.click();
	}
	
}

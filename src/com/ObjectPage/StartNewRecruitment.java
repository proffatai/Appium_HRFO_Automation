package com.ObjectPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StartNewRecruitment {
	private AndroidDriver driver;
	
	public StartNewRecruitment(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	@AndroidFindBy(id="com.babbangona.agricos:id/et_first_name")
	private WebElement Firstname;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_last_name")
	private WebElement Lastname;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_middle_name")
	private WebElement Middlename;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_contact_number")
	private WebElement PhoneNumber;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_email")
	private WebElement Email;
	
	
	@AndroidFindBy(id="com.babbangona.agricos:id/btn_select_community_next")
	private WebElement next;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/materialButtonOk")
	private WebElement Yes;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/materialButtonNo")
	private WebElement No;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/assignPersonnelMessageMaterialTextView")
	private WebElement message;
	
	public void dontAssign() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text (\"Aba Malam\"))")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text (\"WebView\"))")).click();
		next.click();
		No.click();
	}
	
	public void Assign() throws InterruptedException {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text (\"Aba Malam\"))")).click();
		next.click();
		Yes.click();
	}
	
	public void verifyDetails() throws InterruptedException {
		Assert.assertEquals(message.getText(),"Success!");
	}
	
	
}

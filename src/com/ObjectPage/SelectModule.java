package com.ObjectPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectModule {
	private AndroidDriver driver;
	
	public SelectModule(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Recruitment']")
	private WebElement recruitment;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Screening']")
	private WebElement Screening;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Interview']")
	private WebElement Interview;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Staff Registration']")
	private WebElement staffReg;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sync']")
	private WebElement Sync;
	

	@AndroidFindBy(id="com.babbangona.agricos:id/next_btn")
	private WebElement next;
	
	public void clickRecruitment() throws InterruptedException {
		recruitment.click();
		next.click();
	}
	
	public void clickScreening() throws InterruptedException {
		Screening.click();
		next.click();
	}
	
	
	public void clickInterview() throws InterruptedException {
		Interview.click();
		next.click();
	}
	
	
	public void clickStaffReg() throws InterruptedException {
		staffReg.click();
		next.click();
	}
	
	
	public void clickSync() throws InterruptedException {
		Sync.click();
		next.click();
	}
}

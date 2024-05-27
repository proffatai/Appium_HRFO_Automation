package com.ObjectPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen {
	private AndroidDriver driver;
	
	public HomeScreen(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='HR FO']")
	private WebElement hrfo;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/next_btn")
	private WebElement next;
	
	public void clickHRFO() throws InterruptedException {
		hrfo.click();
		next.click();
	}
}

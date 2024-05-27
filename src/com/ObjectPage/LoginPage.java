package com.ObjectPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	private AndroidDriver driver;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement WhileUsingAppButton;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private WebElement AllowButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Allow']")
	private WebElement AllowButtonMobile;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/img_hamburger_menu")
	private WebElement HamburgerMenuButton;
	
	@AndroidFindBy(id="android:id/title")
	private WebElement RefreshDataButton;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/adminLogin")
	private WebElement AdminLoginButton;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Username']")
	private WebElement UserName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement Password;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/btn_login")
	public WebElement LogIn;
	
	
	
	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void clickAllowMobile() throws InterruptedException {
		
		for (int i=0;i<3;i++) {
			WhileUsingAppButton.click();
		}
		
		Thread.sleep(1000);
		for (int i=0;i<2;i++) {
			AllowButtonMobile.click();
		}
	
		AdminLoginButton.click();
		Thread.sleep(1000);
	}
	
	public void clickAllowEmulator() throws InterruptedException {
		
		for (int i=0;i<5;i++) {
			AllowButton.click();
		}
		Thread.sleep(1000);
		AdminLoginButton.click();
		Thread.sleep(5000);
	}
	
	
	public void RefreshAppData() throws InterruptedException {
		HamburgerMenuButton.click();
		RefreshDataButton.click();
		
	}
	
	public void Login(String username, String password) throws InterruptedException {
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LogIn.click();
	}
	
}

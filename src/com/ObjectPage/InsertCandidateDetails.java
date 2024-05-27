package com.ObjectPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InsertCandidateDetails {
	private AndroidDriver driver;
	
	public InsertCandidateDetails(AndroidDriver driver) {
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
	
	
	@AndroidFindBy(id="com.babbangona.agricos:id/btn_submit")
	private WebElement submit;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/textview_success")
	private WebElement success;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/textView_event_location_succeccfully")
	private WebElement successMessage;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/ok")
	private WebElement Ok;
	
	public void setFirstname(String firstname) throws InterruptedException {
		Firstname.sendKeys(firstname);
		driver.hideKeyboard();
	}
	
	public void setLastname(String lastname) throws InterruptedException {
		Lastname.sendKeys(lastname);
		driver.hideKeyboard();
	}
	
	public void setMiddlename(String middlename) throws InterruptedException {
		Middlename.sendKeys(middlename);
		driver.hideKeyboard();
	}
	
	public void setPhonenumber(String number) throws InterruptedException {
		PhoneNumber.sendKeys(number);
		driver.hideKeyboard();
	}
	
	public void setEmail(String email) throws InterruptedException {
		Email.sendKeys(email);
		driver.hideKeyboard();
	}
	
	
	public void fillDetails(String firstname,String lastname,String middlename,String number,String email) throws InterruptedException {
		setFirstname(firstname);
		setLastname(lastname);
		setMiddlename(middlename);
		setPhonenumber(number);
		setEmail(email);
		submit.click();
		verifyDetails();
		Thread.sleep(2000);
		Ok.click();
		
	}
	
	public void verifyDetails() throws InterruptedException {
		Assert.assertEquals(success.getText(),"Success!");
		Assert.assertEquals(successMessage.getText(),"The candidate information has been saved successfully");
	}
	
	
}

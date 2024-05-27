package com.ObjectPage;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;




public class SendInvitation {
	private AndroidDriver driver;
	
	public SendInvitation(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	@AndroidFindBy(id="com.babbangona.agricos:id/test_date_picker")
	private WebElement testDate;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"30 June 2023\"]")
	private WebElement day;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement OK_day;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/test_start_date_picker")
	private WebElement testStartTime;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/mdtp_ok")
	private WebElement OK_time;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_location_name")
	private WebElement locationName;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_location_address")
	private WebElement address;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_landmark")
	private WebElement landmark;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_recruitment_info_community_name")
	private WebElement community;

	@AndroidFindBy(id="com.babbangona.agricos:id/et_contact_number")
	private WebElement number;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_item_to_bring")
	private WebElement items;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_organization_name")
	private WebElement organizationName;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/et_other_information")
	private WebElement otherInfo;
	
	@AndroidFindBy(id="com.babbangona.agricos:id/btn_enter_recruitment_info_next")
	private WebElement next;
	

	public void scroll() {
		// Get the size of the screen
        Dimension size = driver.manage().window().getSize();
        int screenWidth = size.getWidth();
        int screenHeight = size.getHeight();

        // Define the starting and ending points for the swipe gesture
        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.8); // 80% from the top
        int endX = screenWidth / 2;
        int endY = (int) (screenHeight * 0.2); // 20% from the top

        // Perform the swipe gesture
        String swipeCommand = String.format("mobile:shell", "input swipe %d %d %d %d", startX, startY, endX, endY);
        driver.executeScript(swipeCommand);

	}
	public void setDate() throws InterruptedException {
		testDate.click();
		day.click();
		OK_day.click();
	}
	
	public void setStartTime() throws InterruptedException {
		testStartTime.click();
		OK_time.click();
	}
	
	public void setLocation(String location) throws InterruptedException {
		locationName.sendKeys(location);
		driver.hideKeyboard();
	}
	public void setAddress(String Address) throws InterruptedException {
		address.sendKeys(Address);
		driver.hideKeyboard();
	}
	
	public void setLandmark(String Landmark) throws InterruptedException {
		landmark.sendKeys(Landmark);
		driver.hideKeyboard();
	}
	
	
	public void setCommunity(String Community) throws InterruptedException {
		community.sendKeys(Community);
		driver.hideKeyboard();
	}
	public void setNumber(String Number) throws InterruptedException {
		System.out.println("Inside setNumber method");
		number.sendKeys(Number);
		driver.hideKeyboard();
	}
	
	public void setItems(String Items) throws InterruptedException {
		items.sendKeys(Items);
		driver.hideKeyboard();
	}
	
	public void setOrganizationName(String OrgName) throws InterruptedException {
		organizationName.sendKeys(OrgName);
		driver.hideKeyboard();
	}
	public void setOtherInfo(String Information) throws InterruptedException {
		otherInfo.sendKeys(Information);
		driver.hideKeyboard();
	}
	
	public void invite(String location,String address,String landmark,String community,String number,String items,String orgName,String info) throws InterruptedException {
		setDate();
		setStartTime();
		setLocation(location);
		setAddress(address);
		setLandmark(landmark);
		setCommunity(community);
		Thread.sleep(2000);
		System.out.println("Starting to scroll");
		scroll();
		System.out.println("After scrolling");
		Thread.sleep(2000);
		setNumber(number);
		setItems(items);
		setOrganizationName(orgName);
		setOtherInfo(info);
		next.click();
		Thread.sleep(5000);
		
	}
}

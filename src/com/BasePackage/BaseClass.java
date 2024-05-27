package com.BasePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
		public AndroidDriver driver;
		public AppiumDriverLocalService service;
		
		
		@BeforeTest
		public void ConfigAppium() throws MalformedURLException {
			
			service = new AppiumServiceBuilder ().withAppiumJS(new File("//Users//proffatai//.nvm//versions//node//v14.19.0//lib//node_modules//appium//build//lib//main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
//service.start();	
			
			UiAutomator2Options options = new UiAutomator2Options();
			
			options.setApp("//Users//proffatai/Documents//Appium (AgricOS HRFO)//src//resources//AgricOs v1.5.20-STAGING.apk");
			options.setDeviceName("API DEMOS"); 
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90000));
		}
		
		
		@AfterTest
		public void TearDown() {
			driver.quit();
			service.stop();
		}
	
	
		public void PleaseWaitForFortySeconds() throws InterruptedException {
			Thread.sleep(40000);
		}
		
		public void PleaseWaitForFiveSeconds() throws InterruptedException {
			Thread.sleep(50000);
		}
		
		
}

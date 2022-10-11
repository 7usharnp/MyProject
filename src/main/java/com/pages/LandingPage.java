package com.pages;

import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
}

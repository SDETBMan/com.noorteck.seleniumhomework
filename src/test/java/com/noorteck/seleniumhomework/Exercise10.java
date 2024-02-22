package com.noorteck.seleniumhomework;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise10 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//Navigate to website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Under New Windows Section:
			//a. In search field, enter 'selenium (software)', then click search icon.
		
		WebElement searchField = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		WebElement searchIcon = driver.findElement(By.className("wikipedia-search-button"));
		
		searchField.sendKeys("selenium (software)");
		
		searchIcon.click();
		
		
				//1. Under Search results click first result 'selenium (software)'
		
		WebElement result = driver.findElement(By.linkText("Selenium (software)"));
		result.click();
		
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().window(parentWindow);
		searchField.clear();
		
		Thread.sleep(2000);
		
			//b. In search field, enter eBay then click search icon.
		
		searchField.sendKeys("eBay");
		searchIcon.click();
		
				//1. Under Search results click first result eBay
		
		WebElement result1 = driver.findElement(By.linkText("EBay"));
		result1.click();
		
		driver.switchTo().window(parentWindow);
		searchField.clear();
		
		Thread.sleep(2000);
		
			//c. In search field, enter Target Corporation then click search icon.
		
		searchField.sendKeys("Target Corporation");
		searchIcon.click();
		
				//1. Under Search results click first result Target Corporation
		
		WebElement firstResult = driver.findElement(By.linkText("Target Corporation"));
		firstResult.click();
		
		driver.switchTo().window(parentWindow);
		searchField.clear();
		
		Thread.sleep(2000);
		
			//d. In search field, enter Google then click search icon.
		
		searchField.sendKeys("Google");
		searchIcon.click();
		
				//1. Under Search results click first result Google
		
		WebElement firstResult1 = driver.findElement(By.linkText("Google"));
		firstResult1.click();
		
		driver.switchTo().window(parentWindow);
		searchField.clear();
		
		Thread.sleep(2000);
		
		
			//e. In search field, enter Yahoo! then click search icon.
		
		searchField.sendKeys("Yahoo!");
		searchIcon.click();
		
				//1. Under Search results click first result Yahoo!
		
		WebElement firstResults = driver.findElement(By.linkText("Yahoo!"));
		firstResults.click();
		
		Thread.sleep(2000);
		
		//Switch control to window that has page title as 'Selenium (software)-Wikipedia'
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("Window IDS: " + allWindows);
		
		for(String window : allWindows) {
			
			System.out.println("Window ID: " + window);
			
			//switch control to one of the window
			driver.switchTo().window(window);
			
			//now retrieve page title
			
			String currentPageTitle = driver.getTitle();
			
			Thread.sleep(2000);
		
		//a click website link
			
		if(currentPageTitle.equals("Selenium (software) - Wikipedia")) {
		
		WebElement seleniumHomePage = driver.findElement(By.xpath("//a[@href='https://selenium.dev/']"));
		seleniumHomePage.click();
		
		Thread.sleep(2000);
		
		String seleniumPageTitle = driver.getTitle();
		System.out.println("Verify Title: " + seleniumPageTitle);
		
		WebElement docuLink = driver.findElement(By.xpath("//a[@href='/documentation']"));
		docuLink.click();
		
		String documentationPageTitle = driver.getTitle();
		System.out.println("Verify Title: " + documentationPageTitle);
		
		if(documentationPageTitle.equals("The Selenium Browser Automation Project")) {
			System.out.println("Wooow, once I am done here I will read all the available documents");
		}else {
			System.out.println("I am still going to read all the available documents.");
		}
		
		driver.close();
		
		Thread.sleep(2000);
		
		//Switch control to page title - eBay - Wikipedia
		
		if(currentPageTitle.equals("eBay - Wikipedia")) {
			
		WebElement eBayHomePage = driver.findElement(By.xpath("//a[@href='https://www.ebay.com']"));
		eBayHomePage.click();
		
		//Verify page title is equal to Electronics, Cars, Fashion, Collectibles & More | eBay
		
		String eBayPageTitle = driver.getTitle();
		System.out.println("Verify Title: " + eBayPageTitle);
		
		Thread.sleep(2000);
		
		//Retrieve all the values from the All Category dropdown, check how many times
		//the & character appears in the text and print which category contains & character
		//in its String
		
		WebElement allCatDropDown = driver.findElement(By.id("gh-cat"));
		
		Select selectObj = new Select(allCatDropDown);
		
		List<WebElement> ebayList = selectObj.getOptions();
		
		for (WebElement ebay : ebayList) {

			String ebayStr = ebay.getText();
			System.out.println(ebayStr);

			if (ebayStr.contains("&")) {
				System.out.println(ebayStr);
				ebay.click();
				
		Thread.sleep(2000);
		
		//Verify & appeared more than 6 times
		
		int count = 0;
		
		for(int i = 0; i < ebayStr.length(); i++) {
			if(ebayStr.charAt(i) == '&') {
				count++;
			}
		}
		
		//If true, print TESTCASE PASSED
		//If false, print TESTCASE FAILED
		
		if(count > 6) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		//switch control to window that has page title Target Corporation - Wikipedia
		
		if(currentPageTitle.equals("Target Corporation - Wikipedia")) {
		
		WebElement targetHomePage = driver.findElement(By.xpath("//a[@href='https://www.target.com']"));
		targetHomePage.click();
		
		}
		
		//Verify page title is equal to Target: Expect More. Pay Less.
		
		String targetPageTitle = driver.getTitle();
		System.out.println("Verify Title: " + targetPageTitle);
		
		Thread.sleep(2000);
		
		//
		
		
		
		tearDown();
		}
	}
  }
}
}
}
}

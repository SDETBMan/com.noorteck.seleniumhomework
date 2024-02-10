package com.noorteck.seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		
		Thread.sleep(2000);
		//Locate username and enter value
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		
		Thread.sleep(1000);
		
		//Locate password and enter value
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		
		Thread.sleep(1000);
		
		//Xpath locator
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		Thread.sleep(2000);
		
		//Retrieve Header Text verify header is Dashboard
		
		WebElement headerElement = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
		String headerDash = headerElement.getText();
		Thread.sleep(2000);
		
		//Verify if header says "Dashboard"
		if(headerDash.equals("Dashboard")) {
			System.out.println("Header text verified as Dashboard");
		}else {
			System.out.println("Header text failed verification");
		
		}
		
		Thread.sleep(2000);
		//Close the browser
		
		tearDown();
		
	}

}

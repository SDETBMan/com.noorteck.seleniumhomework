package com.noorteck.seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		//Register new user scenario
		
		setUp();
		
		//Navigate to hyperlink
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		
		//Click register link
		WebElement regLnk = driver.findElement(By.className("ico-register"));
		regLnk.click();
		Thread.sleep(2000);
		
		//Verify page title is nopCommerce demo store. Register.
		
		
		//Fill out personal details-gender
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(2000);
		
		//First name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Brian");
		Thread.sleep(2000);
		
		//Last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Padgett");
		Thread.sleep(2000);
		
		//Dob day
		WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
		Select selectObj = new Select(dayDropDown);
		selectObj.selectByValue("11");
		Thread.sleep(2000);
		
		//Dob month
		WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
		Select selectObj1 = new Select(monthDropDown);
		selectObj1.selectByValue("11");
		Thread.sleep(2000);
		
		//Dob year
		WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
		Select selectObj2 = new Select(yearDropDown);
		selectObj2.selectByValue("1985");
		Thread.sleep(2000);
		
		//Email
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("bpemail@gmail.com");
		Thread.sleep(2000);
		
		//Company name
		WebElement coName = driver.findElement(By.id("Company"));
		coName.sendKeys("Bman SDET");
		Thread.sleep(2000);
		
		//Uncheck newsletter checkbox
		WebElement uncheck = driver.findElement(By.id("Newsletter"));
		uncheck.click();
		Thread.sleep(2000);
		
		//Enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		//Confirm password
		WebElement confirmPswrd = driver.findElement(By.id("ConfirmPassword"));
		confirmPswrd.sendKeys("123456");
		Thread.sleep(2000);
		
		//Click register
		WebElement clickReg = driver.findElement(By.id("register-button"));
		clickReg.click();
		Thread.sleep(2000);
		
		//Enter username
		//WebElement userName = driver.findElement(By.id(""));
		//userName.click();
		//Thread.sleep(2000);
		
		//Verify registration completed. If message says: "Your registration completed!!!"
		//if yes, print TESTCASE PASSED
		//If no, print TESTCASE FAILED
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String register = confirmationText.getText();

		if (register.contains("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(2000);
		tearDown();
		
		
		
		
	}

}

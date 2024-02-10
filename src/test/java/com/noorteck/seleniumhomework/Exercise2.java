package com.noorteck.seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		// Register new user in Mercury Tours page

		setUp();

		// Navigate to hyperlink:
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);

		// Click REGISTER link
		WebElement registerBtn = driver.findElement(By.linkText("REGISTER"));
		Thread.sleep(2000);

		registerBtn.click();
		Thread.sleep(2000);

		// Verify title page is Mercury Tours

		Thread.sleep(2000);

		// Enter first name
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Brian");
		Thread.sleep(2000);

		// Enter last name
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Padgett");
		Thread.sleep(2000);

		// Enter phone number
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("8675309");
		Thread.sleep(2000);

		// Enter email
		WebElement email = driver.findElement(By.name("userName"));
		email.sendKeys("bpemail@gmail.com");
		Thread.sleep(2000);

		// Enter address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 main st");
		Thread.sleep(2000);

		// Enter City
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Riverton");
		Thread.sleep(2000);

		// Enter state
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Utah");
		Thread.sleep(2000);

		// Enter zip
		WebElement zip = driver.findElement(By.name("postalCode"));
		zip.sendKeys("84065");
		Thread.sleep(2000);

		// Enter user name
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("BMAN");
		Thread.sleep(2000);

		// Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		Thread.sleep(2000);

		// Re enter password/confirm
		WebElement password1 = driver.findElement(By.name("confirmPassword"));
		password1.sendKeys("123456");
		Thread.sleep(2000);

		// Click submit button
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(2000);

		// Retrieve text confirmation message and check if confirmation message contains
		// following phrase: "Thank you for registering."
		// If yes, print TESTCASE PASSED
		// If no, print TESTCASE FAILED
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String register = confirmationText.getText();

		if (register.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(2000);
		tearDown();
	}
}

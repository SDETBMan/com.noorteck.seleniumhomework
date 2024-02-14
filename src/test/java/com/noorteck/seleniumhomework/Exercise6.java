package com.noorteck.seleniumhomework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//Navigate to hyperlink
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Verify page title is Alerts
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("Alerts")) {
			System.out.println("Verified");
		}else {
			System.out.println("Not verified");
		}

		Thread.sleep(2000);
		
		//Click Alert with Textbox
		WebElement clickAlert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		clickAlert.click();
		
		Thread.sleep(2000);
		
		//Click the button to demonstrate the Promptbox Button/Enter name in Alert Text Field
		//Click Ok button
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptBox.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Brian");
		alert.accept();
		
		Thread.sleep(2000);
		
		//Verify message contains phrase: "How are you today"
		WebElement contains = driver.findElement(By.id("demo1"));
		
		
		System.out.println("Is TextField Displayed?: " + contains.isDisplayed());
		
		Thread.sleep(2000);
		
		//Refresh the page
		WebElement refresh = driver.findElement(By.tagName("body"));
		refresh.sendKeys(Keys.F5);
		
		Thread.sleep(2000);
		
		//Click Alert with OK and Cancel
		WebElement okCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		okCancel.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("Brian");
		alert2.accept();
		
		Thread.sleep(2000);
		
		//Verify the text in alert contains Press a Button !
		WebElement contains1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		
		Alert alert3 = driver.switchTo().alert();
		
		String alertText = alert.getText();
		
		boolean containsPhrase = alertText.contains("Press a Button !");
			
		if(containsPhrase) {
			alert3.dismiss();
		}else {
			alert3.accept();
		}
		
		WebElement message = driver.findElement(By.id("message_id"));
		String messageText = message.getText();
		boolean containsDesiredPhrase = messageText.contains("Press a Button !");
		System.out.println("Message verification result: " + containsDesiredPhrase);
		
		Thread.sleep(2000);
		
		tearDown();
		
	}

}

package com.noorteck.seleniumhomework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class Exercise12 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		doubleClickAction();
		
		tearDown();
		
	}
		
		
		public static void doubleClickAction() throws InterruptedException {
			
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Click Double-Click Me To See Alert button
		
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(button).build().perform();
		
		//Get the text and verify the text contains You double clicked
		
		Alert alertObj = driver.switchTo().alert();
		
		String text = alertObj.getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		
		alertObj.accept();
		
		//If it does then print TESTCASE PASSED
		
		if(text.contains("You double clicked")) {
			System.out.println("TESTCASE PASSED");
		
		//Otherwise print TESTCASE FAILED
		
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		//Close the browser.
		
		
			
		
		
	}

}

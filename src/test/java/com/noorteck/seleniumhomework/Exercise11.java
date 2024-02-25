package com.noorteck.seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class Exercise11 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		rightClickAction();
		copyClickAction();
		
		
		tearDown();
		
	}
	
	public static void rightClickAction() {
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		//Click Right Click me button
		
		WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));

		Actions actions = new Actions(driver);
		
		actions.contextClick(rightClick).build().perform();
		
		
		
	}
	public static void copyClickAction() { 
		
		//Click Copy

		WebElement copy = driver.findElement(By.className("context-menu-icon-copy"));
		copy.click();
		
	
		
		//Get the text and verify the text contains copy
		
		WebElement copyMessage = driver.findElement(By.id(""));
		
		String messageStr = copyMessage.getText();
		
		System.out.println(messageStr);
		
		//a. If it does then print TESTCASE PASSED
		
		
		
		//b. Otherwise print TESTCASE FAILED
		
		
		
		//Close the browser.
		

		
	}
		

	}



package com.noorteck.seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise4 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//Navigate to site
		
		driver.get("https://www.dummyticket.com/");
		
		//Click BUY TICKET link
		
		WebElement buyTicket = driver.findElement(By.linkText("BUY TICKET"));
		buyTicket.click();
		
		
		//Verify the page title is Dummy ticket for applying visa - Verifiable flight reservation for
		//embassy
		
		String ticketPageTitle = driver.getTitle();
		System.out.println(ticketPageTitle);
		
		
		//Select Dummy ticket and hotel – USD $35.00
		
		WebElement dumTicketHotel = driver.findElement(By.id("product_3186"));
		dumTicketHotel.click();
		
		
		//Verify the message displayed under Choose the Correct option contains: Dummy ticket and
		//hotel
		
		String confMessage = "Dummy ticket and hotel";
		System.out.println(confMessage);
		
		//For Passenger Detail Section
		//a. Enter first name
		
		WebElement firstName = driver.findElement(By.id("travname"));
		firstName.sendKeys("Brian");
		
		
		//b. Enter Last name
		
		WebElement lastName = driver.findElement(By.id("travlastname"));
		lastName.sendKeys("Padgett");
		
		
		//c. Set date of birth September 19 1970
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.click();
		
		//Month
		WebElement monthDrop = driver.findElement(By.className("ui-datepicker-month"));
		monthDrop.click();
		
		Select selectMonth = new Select(monthDrop);
		
		selectMonth.selectByVisibleText("Sep");
		
		//Year
		WebElement yearDrop = driver.findElement(By.className("ui-datepicker-year"));
		yearDrop.click();
		
		Select selectYear = new Select(yearDrop);
		
		selectYear.selectByVisibleText("1970");
		
		//Day
		WebElement day = driver.findElement(By.linkText("19"));
		day.click();
		
		//d. Select Gender
		
		WebElement gender = driver.findElement(By.id("sex_1"));
		gender.click();
		
		
		//For Travel Details Section
		//a. For Trip type select Round trip
		
		WebElement roundTrip = driver.findElement(By.id("traveltype_2"));
		roundTrip.click();
		
		
		//b. Enter From city/Origin
		
		WebElement fromCity = driver.findElement(By.id("fromcity"));
		fromCity.sendKeys("Tampa");
		
		
		//c. Enter To City/Destination
		
		WebElement toCity = driver.findElement(By.id("tocity"));
		toCity.sendKeys("San Diego");
		
		//d. Enter Departure date March 20, 2024
		
		WebElement departDate = driver.findElement(By.id("departon"));
		departDate.click();
		
		WebElement monthDrop1 = driver.findElement(By.className("ui-datepicker-month"));
		monthDrop1.click();
		
		Select selectMonth1 = new Select(monthDrop1);
		
		selectMonth1.selectByVisibleText("Mar");
		
		WebElement yearDrop1 = driver.findElement(By.className("ui-datepicker-year"));
		yearDrop1.click();
		
		Select selectYear1 = new Select(yearDrop1);
		
		selectYear1.selectByVisibleText("2024");
		
		WebElement day1 = driver.findElement(By.linkText("20"));
		day1.click();
		
		Thread.sleep(2000);
		
		//e. Enter Return Date August 25, 2024
		
		WebElement returnDate = driver.findElement(By.id("returndate"));
		returnDate.click();
		
		WebElement monthDrop2 = driver.findElement(By.cssSelector("select[aria-label='Select month']"));
		monthDrop2.click();
		
		Select selectMonth2 = new Select(monthDrop2);
		
		selectMonth2.selectByVisibleText("Aug");
		
		WebElement yearDrop2 = driver.findElement(By.className("ui-datepicker-year"));
		yearDrop1.click();
		
		Select selectYear2 = new Select(yearDrop2);
		
		selectYear2.selectByVisibleText("2024");
		
		WebElement day2 = driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
		day2.click();
		
		Thread.sleep(2000);
		
		//f. Enter Additional Notes
		
		WebElement notes = driver.findElement(By.id("notes"));	
		notes.sendKeys("Here's some notes");
		
		//For Delivery Option Section
		//a. For What is the dummy ticket for ? field. Select Prank a friend option
		
		WebElement deliveryOption = driver.findElement(By.id("select2-reasondummy-container"));
		deliveryOption.click();
		
		WebElement prankFriend = driver.findElement(By.id("select2-reasondummy-result-6swk-6"));
		prankFriend.click();
		
		Thread.sleep(2000);
		
		//b. For Receive the dummy ticket question select Email
		
		WebElement receiveOption = driver.findElement(By.id("deliverymethod_1"));
		receiveOption.click();
		
		
		//For Billing Details Section
		//a. Enter Name
		
		WebElement billingName = driver.findElement(By.id("billname"));
		billingName.click();
		
		
		//b. Enter Phone
		
		WebElement billingPhone = driver.findElement(By.id("billing_phone"));
		billingPhone.click();
		
		
		//c. Enter Email Address
		
		WebElement billingEmail = driver.findElement(By.id("billing_email"));
		billingEmail.click();
		
		
		//d. For Country, Select Costa Rica
		
		WebElement countryTextField = driver.findElement(By.id("select2-billing_country-container"));
		countryTextField.click();
		
		WebElement countrySelect = driver.findElement(By.id("select2-billing_country-result-us1k-CR"));
		countrySelect.click();
		
		
		//e. Enter street address
		//i. 123 way drive
		
		WebElement streetAddress = driver.findElement(By.id("billing_address_1"));
		streetAddress.sendKeys("123 way drive");
		
		
		//ii. Apt 303
		
		WebElement aptSuite = driver.findElement(By.id("billing_address_2"));
		aptSuite.sendKeys("Apt 303");
		
		//f. Enter City Reston
		
		WebElement city = driver.findElement(By.id("billing_city"));
		city.sendKeys("Reston");
		
		
		//g. Select State Virginia
		
		//WebElement state = driver.findElement(By.id("select2-billing_state-container"));
		//state.sendKeys("Alajuela");
		
		
		//h. Enter zip code
		
		WebElement zip = driver.findElement(By.id(""));
		zip.sendKeys("33511");
		
		
		//Click Proceed to PayPal
		
		
		
		
		//Click Cancel and return to KTINI
		
		
		
		
		//Verify the page title is Basket - Dummy ticket
		
		
		
		
		//Verify page displays following message: Your order was cancelled.
		
		
		
		
		//Retrieve the confirmation text message and check if the confirmation text message equals to
		
		
		
		
		//Your order was cancelled.
		
		
		
		
		//a. If it does then print TESTCASE PASSED
		
		
		
		
		//b. Otherwise print TESTCASE FAILED
		
		
		
		
		//Close the browser.
		
		
		
		tearDown();
		
		
	}

}

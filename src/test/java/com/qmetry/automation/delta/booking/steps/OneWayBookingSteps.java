package com.qmetry.automation.delta.booking.steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qmetry.automation.delta.bookingPages.BookingPage;
import com.qmetry.automation.utility.ExtentReport;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.AbstractTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;


public class OneWayBookingSteps {
	/*
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	*/
	
	/*
	@Before
	public void setup() {
		
	
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		
	}
*/





	@QAFTestStep(description = "User is on Delta Booking Page")
	public void navigateToDeltaBookingPage() {
		//test = extent.createTest("Validate user can navigate to Delta Booking Page");
		BookingPage bookingpage = new BookingPage();
		bookingpage.invoke();
		bookingpage.waitForPageToLoad();
		
		
		if(bookingpage.getBook().isPresent()) {
			System.out.println("USER IS ON DELTA BOOKING PAGE");
			//test.log(Status.PASS,"Script successfully clicked on From Link");
		}
		
	}

	@QAFTestStep(description = "User clicks on From Link")
	public void clickOnFromLink() throws InterruptedException {
		//test = extent.createTest("Verify From Link");
		BookingPage bookingpage = new BookingPage();
		
		bookingpage.getFrom().waitForVisible();
		bookingpage.getFrom().waitForPresent();
		bookingpage.getFrom().waitForVisible();
		bookingpage.getFrom().waitForEnabled();
		bookingpage.getFrom().waitForVisible();
		bookingpage.getFrom().click();
		
		if(bookingpage.getAirPortSearchTextBox().isPresent()) {
			System.out.println("USER SUCCESSFULLY CLICK ON FROM LINK.I HOPE YOU CAN SEE THIS MESSAGE");
			//test.log(Status.PASS,"Script successfully clicked on From Link");
		} else {
			//test.log(Status.FAIL,"Script failed to click on From Link");
		}
		
			
		
	
	}

	@QAFTestStep(description = "User enters departure airport {dAirPort}")
	public void clickOnFromLink(String dAirPort) {
		//test = extent.createTest("Validate User can click on From Link");

	}

	@QAFTestStep(description = "User selects departure airport from search results")
	public void selectDepartureAirportFromList() {
		//test = extent.createTest("Validate user can select departure airport from the airport List");

	}

	@QAFTestStep(description = "User clicks on To link")
	public void clickOnToLink() {
		//test = extent.createTest("Validate user can click on 'To' link");

	}

	@QAFTestStep(description = "User enters destination airport {aAirPort}")
	public void enterDestinationAirport(String aAirPort) {
		//test = extent.createTest("Validate user can enter destination airport");

	}

	@QAFTestStep(description = "User selects destination airport from search results")
	public void selectDestinationAirportFromList() {
		//test = extent.createTest("Validate user can select destination airport from the list");

	}

	@QAFTestStep(description = "User selects trip type 'oneway'")
	public void selectOneWayTrip() {

	}

	@QAFTestStep(description = "User selects departure date '02/05/2022'")
	public void selectDepartureDate() {

	}

	@QAFTestStep(description = "User selects number of passenger '2'")
	public void selectNumberOfPassenger() {

	}

	@QAFTestStep(description = "User clicks on search button")
	public void clickOnSearchButton() {

	}

	@QAFTestStep(description = "list of flights should generate")
	public void generateListOfFlights() {

	}



}

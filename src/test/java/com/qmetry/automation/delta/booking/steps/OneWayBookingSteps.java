package com.qmetry.automation.delta.booking.steps;

import org.junit.runner.RunWith;

import com.qmetry.qaf.automation.step.QAFTestStep;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import testUtility.TestBase;

public class OneWayBookingSteps extends TestBase {

	@QAFTestStep(description = "User is on Delta Booking Page")
	public void navigateToDeltaBookingPage() {
		
	}
	
	@QAFTestStep(description = "User clicks on From Link")
	public void clickOnFromLink() {

	}

	@QAFTestStep(description = "User enters departure airport {dAirPort}")
	public void clickOnFromLink(String dAirPort) {

	}

	@QAFTestStep(description = "User selects departure airport from search results")
	public void selectDepartureAirportFromList() {

	}

	@QAFTestStep(description = "User clicks on To link")
	public void clickOnToLink() {

	}

	@QAFTestStep(description = "User enters destination airport {aAirPort}")
	public void enterDestinationAirport(String aAirPort) {

	}

	@QAFTestStep(description = "User selects destination airport from search results")
	public void selectDestinationAirportFromList() {

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

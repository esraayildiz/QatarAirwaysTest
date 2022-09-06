package com.qatar.airways.base;

import com.qatar.airways.pages.FlightDetailPage;
import com.qatar.airways.pages.FlightSearchPage;
import com.qatar.airways.pages.FlightSearchResultPage;
import com.qatar.airways.pages.HomePage;
import com.qatar.airways.pages.TripSummaryPage;
import com.thoughtworks.gauge.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepImplementation {

    HomePage homePage = new HomePage();
    FlightSearchPage flightSearchPage = new FlightSearchPage();
    FlightSearchResultPage flightSearchResultPage = new FlightSearchResultPage();
    FlightDetailPage flightDetailPage = new FlightDetailPage();
    TripSummaryPage tripSummaryPage = new TripSummaryPage();

    @Step("Open and check the app")
    public void appControl() {
        assertTrue(homePage.isAppOpen());
    }

    @Step("Click Skip")
    public void skip() throws InterruptedException {
        homePage.skip();
    }

    @Step("Go to Book")
    public void switchBookTab() {
        homePage.goToBookingPage();
    }

    @Step("Select One Way trip type")
    public void selectOneWay() {
        flightSearchPage.selectTripOption();
    }

    @Step("Select Berlin as departure airport")
    public void selectDeparture() {
        flightSearchPage.selectDepartureAirport();
    }

    @Step("Select Istanbul as destionation airport")
    public void selectDestination() {
        flightSearchPage.selectDestinationAirport();
    }

    @Step("Select Trip Date after 7 days")
    public void selectFlyDay() {
        flightSearchPage.selectTripDate();
    }

    @Step("Click the search button")
    public void selectFlySearch() {
        flightSearchPage.clickSearch();
    }

    @Step("Check flight selection page")
    public void checkPageIsLoad() {
        flightSearchResultPage.checkPageIsLoad();
    }

    @Step("Select random flight")
    public void selectRandomFlight() {
        flightDetailPage.selectRandomFlight();
    }

    @Step("Select economy class")
    public void selectEconomyClass() {
        flightDetailPage.selectEconomyClass();
    }

    @Step("Check the trip time is correct")
    public void checkFlightDateIsCorrect() {
        final String flightTime = tripSummaryPage.getFlightTime();
        assertEquals("07.30", flightTime);
    }

}

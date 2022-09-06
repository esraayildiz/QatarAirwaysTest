package com.qatar.airways.pages;

import com.qatar.airways.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightSearchPage extends BaseTest {

    private final By oneWayTrip = By.xpath("//android.widget.LinearLayout[@content-desc=\"One-way\"]/android.widget.TextView");
    private final By departureAirport = By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_holder_city_name_text_view");
    private final By berlinText = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.m.qr:id/rvmp_item_ond_selection_list_text_view_holder\"])[1]");
    private final By destinationAirport = By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_select_destination_text_view");
    private final By cityKey = By.xpath("//android.widget.TextView[@resource-id=\"com.m.qr:id/textinput_placeholder\"]");
    private final By istanbulText = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.m.qr:id/rvmp_item_ond_selection_list_text_view_holder\"])[2]");
    private final By tripDate = By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_departure_date_holder");
    private final By tripDay = By.xpath("(//android.widget.TextView[@resource-id=\"com.m.qr:id/rvmp_booking_calendar_day_text_view\"])[17]");
    private final By bookingConfirmation = By.id("com.m.qr:id/fragment_calendar_confirm_button");
    private final By flightSearchButton = By.id("com.m.qr:id/rvmp_booking_search_flights_button");

    private WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 10);

    public FlightSearchPage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(oneWayTrip));
    }

    public void selectTripOption() {
        appiumDriver.findElement(oneWayTrip).click();
    }

    public void selectDepartureAirport() {
        appiumDriver.findElement(departureAirport).click();
        appiumDriver.findElement(cityKey).click();
        appiumDriver.findElement(departureAirport).sendKeys("Berlin");
        appiumDriver.findElement(berlinText).click();
    }

    public void selectDestinationAirport() {
        appiumDriver.findElement(destinationAirport).click();
        appiumDriver.findElement(cityKey).click();
        appiumDriver.findElement(cityKey).sendKeys("Istanbul");
        appiumDriver.findElement(istanbulText).click();
    }

    public void selectTripDate() {
        appiumDriver.findElement(tripDate).click();
        appiumDriver.findElement(tripDay).click();
    }

    public void clickSearch() {
        appiumDriver.findElement(bookingConfirmation).click();
        appiumDriver.findElement(flightSearchButton).click();
    }

}

package com.qatar.airways.pages;

import com.qatar.airways.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TripSummaryPage extends BaseTest {

    private final By flightBoundType = By.id("com.m.qr:id/flight_bound_type");
    private final By flightTime = By.id("com.m.qr:id/from_time");

    private WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 10);

    public TripSummaryPage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(flightBoundType));
    }

    public String getFlightTime() {
        return appiumDriver.findElement(flightTime).getText();
    }
}

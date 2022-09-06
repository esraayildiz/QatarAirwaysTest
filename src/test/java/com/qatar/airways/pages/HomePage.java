package com.qatar.airways.pages;

import com.qatar.airways.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage extends BaseTest {

    private final By skipButton = By.id("com.m.qr:id/skip_button");
    private final By onboardingSkip = By.id("com.m.qr:id/onboarding_skip_button");
    private final By consentDecline = By.id("com.m.qr:id/push_consent_decline");
    private final By bookTab = By.xpath("//android.widget.FrameLayout[@content-desc=\"Book\"]/android.widget.FrameLayout/android.widget.ImageView");

    private WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 10);

    public HomePage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(skipButton));
    }

    public void skip() {
        appiumDriver.findElement(skipButton).click();
        webDriverWait.until(elementToBeClickable(onboardingSkip)).click();
        appiumDriver.findElement(onboardingSkip).click();
        webDriverWait.until(elementToBeClickable(consentDecline)).click();
        appiumDriver.findElement(consentDecline).click();
        appiumDriver.findElement(bookTab).click();
    }

    public void goToBookingPage() {
        appiumDriver.findElement(bookTab).click();
    }

    public boolean isAppOpen() {
        return appiumDriver.findElement(skipButton).isDisplayed();
    }
}

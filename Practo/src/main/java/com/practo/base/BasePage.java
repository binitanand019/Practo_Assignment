package com.practo.base;

import generics.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


/**
 * Created by binitanand on 23/10/17.
 */
public abstract class BasePage {

    public Logger log = Logger.getLogger(this.getClass());
    public long timeout = Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, timeout);
    }
    public void checkElementIsPresent(WebElement element) {
        boolean present = Utility.verifyElementIsPresent(wait, element);
        Assert.assertTrue(present, "FAIL:Element is not present");
        log.info("PASS:Element is present");
    }
}

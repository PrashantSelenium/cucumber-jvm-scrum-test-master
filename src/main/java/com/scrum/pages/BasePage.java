package com.scrum.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.scrum.WebDriverSingleton;

/**
 * @author Andrii.Dzynia
 */
public class BasePage {

  public WebDriver getDriver() throws IOException {
    return WebDriverSingleton.getInstance();
  }
}

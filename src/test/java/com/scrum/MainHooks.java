package com.scrum;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;

/**
 * Cucumber hooks are executed before or after each scenario
 * @author Sai.Krishna
 */
public class MainHooks {

  @Before
  public void prepare() {
  }

  @After
  public void takeScreenShot(Scenario result) throws IOException {
    result.embed(getScreenShotBytes(), "image/png");
  }

  private byte[] getScreenShotBytes() throws WebDriverException, IOException {
    if(WebDriverSingleton.getInstance() instanceof TakesScreenshot){
      return ((TakesScreenshot) WebDriverSingleton.getInstance()).getScreenshotAs(OutputType.BYTES);
    }
    return new byte[]{};
  }

}


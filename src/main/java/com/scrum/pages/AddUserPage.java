package com.scrum.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.scrum.data.User;

/**
 * @author Andrii.Dzynia
 */
public class AddUserPage extends BasePage {
  public void openAddUserPage() throws IOException {
    getDriver().get("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php");
  }

  public void submitUser(User user) throws IOException {
    getDriver().findElement(By.name("memberID")).sendKeys(user.userName);
    getDriver().findElement(By.name("password")).sendKeys(user.password);
    getDriver().findElement(By.name("confirmPassword")).sendKeys(user.password);
    getDriver().findElement(By.name("email")).sendKeys(user.email);
    getDriver().findElement(By.name("saveChanges")).click();
  }

}

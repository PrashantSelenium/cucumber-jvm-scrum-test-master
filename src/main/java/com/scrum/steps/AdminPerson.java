package com.scrum.steps;

import java.io.IOException;

import com.scrum.pages.AddUserPage;
import com.scrum.pages.HomePage;
import com.scrum.pages.LoginPage;

/**
 * @author Andrii.Dzynia
 */
public class AdminPerson {

  private LoginPage loginPage = new LoginPage();

  public LoginPage atLoginPage() {
    if (loginPage == null) {
     loginPage = new LoginPage();
    }
    return loginPage;
  }

  public HomePage atHomePage() {
    return new HomePage();
  }

  public void login() throws IOException {
    atLoginPage().open();
    atLoginPage().fillForm("admin", "admin");
    atLoginPage().clickSignInButton();
  }

  public AddUserPage atAddUser() {
    return new AddUserPage();
  }
}

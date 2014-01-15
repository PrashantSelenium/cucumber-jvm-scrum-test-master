package com.scrum.behavior.admin;

import static junit.framework.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;

import com.scrum.data.User;
import com.scrum.pages.AddUserPage;

/**
 * Created with IntelliJ IDEA.
 * User: alpa
 * Date: 23/04/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class AdminAssert extends AddUserPage {

    @SuppressWarnings("deprecation")
	public void checkThatEditUserPageOpened(User user) throws IOException {
        assertTrue(getDriver().findElement(By.tagName("body")).getText().contains("Edit Member '" + user.userName + "'"));
    }
}

package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(name= "user_name")
private WebElement userNameTxt;

@FindBy(name= "user_password")
private WebElement userPasswordTxt;

@FindBy(id="submitButton")
private WebElement loginBtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void loginAction(String userName,String password)
{
	userNameTxt.sendKeys(userName);
	userPasswordTxt.sendKeys(password);
	loginBtn.click();
}
}

package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {

	@FindBy(id="dtlview_Organization Name")
	private WebElement checkOrganizationName;
	
	
	public OrganizationInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkOrganizationName()
	{
		return checkOrganizationName.getText();
	}
}

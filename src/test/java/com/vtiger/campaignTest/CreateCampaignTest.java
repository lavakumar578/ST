package com.vtiger.campaignTest;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sdet34l1.genericUtlity.BaseClass;
import com.sdet34l1.genericUtlity.XlsxUtility;
import com.vtiger.objectRepository.CampaignInfromationPage;
import com.vtiger.objectRepository.CampaignPage;
import com.vtiger.objectRepository.CreateCampaignPage;




public class CreateCampaignTest extends BaseClass {
	
	
	CampaignPage campaignPage;
	CreateCampaignPage createCampaignPage;
	CampaignInfromationPage campaignInfromationPage;
	@Test(groups="sanity")
	public void createCampaignTest() throws IOException
	{
	String actual=XlsxUtility.getDataFromExcelSheet("campaign", 2, 1)+randomNum;
	campaignPage=new CampaignPage(driver);
	createCampaignPage=new CreateCampaignPage(driver);
	campaignInfromationPage=new CampaignInfromationPage(driver);
	
	homePage.clickCampaign(driver, driverUtility);
	campaignPage.createCampaignIcon();
	createCampaignPage.enterCampaignName(actual);
	
	createCampaignPage.saveButton();
	String expected=campaignInfromationPage.checkCampaignNameinformation();
	System.out.println(expected);
	javaLangUtility.assetionThroughIfCondition(actual, expected, "campaign");

}
}

package com.LeadModule.TC_51_to_TC_55;

import org.testng.annotations.Test;
import com.sdet34l1.genericUtlity.BaseClass;
import com.sdet34l1.genericUtlity.XlsxUtility;
import com.vtiger.objectRepository.LeadPage;

public class TC_53_SearchLeadByClickingOnFaxTest extends BaseClass{
	LeadPage leadPage;
	@Test(groups= {"sanity","regression"})
	public void tC_53_SearchLeadByClickingOnFaxTest() 
	{
		leadPage=new LeadPage(driver);
		homePage.clickLeads();
		leadPage.goToAdvancedSearchIcon();
		leadPage.addFirstAndSecondDropDown(XlsxUtility.getDataFromExcelSheet("fax",1 , 1), XlsxUtility.getDataFromExcelSheet("fax",1 , 2));	
		leadPage.sendkeys(XlsxUtility.getDataFromExcelSheet("fax",1 , 3));
		leadPage.searchButton();
		String result=leadPage.getresult();
		javaLangUtility.printStatement(result);	
	}
}

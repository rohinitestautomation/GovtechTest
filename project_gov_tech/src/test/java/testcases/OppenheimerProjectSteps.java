package testcases;

import net.thucydides.core.annotations.Step;


public class OppenheimerProjectSteps {
	OppenheimerProjectPage OPPage;
	

	
	@Step("Step for verifying the ButtonColor")
	public void verifyColourOfButton() 
	{
		OPPage.verifyButtonColour();
		
	}
	@Step("Step for verifying the Text on Button")
	public void verifyTextOnButton()
	{
		OPPage.verifyButtonText();
	}
	@Step("Step for verifying the button click and display element")
	public void verifyClickOnButton()
	{
		OPPage.verifyButtonClick();
		
	}
	
	@Step("Step for upload csv file")
	public void uploadCsvFile() 
	{
		OPPage.uploadfile();
		
	}
	
}

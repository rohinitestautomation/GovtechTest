package userstories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import testcases.OppenheimerProjectSteps;

@RunWith(SerenityRunner.class)
public class OppProjectTestUploadFile extends PageObject {

	@Managed
	WebDriver driver;

	@Steps
	OppenheimerProjectSteps Steps;

	@Test
	public void oppenheimerProject() {

		driver.get("http://localhost:8080/");

		Steps.uploadCsvFile();
		

	}

}

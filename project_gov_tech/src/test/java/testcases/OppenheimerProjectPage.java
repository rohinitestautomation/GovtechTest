package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OppenheimerProjectPage extends PageObject {

	public void verifyButtonColour() // Step for verifying the button on the
										// screen be red-colored
	{

		String buttonColor = getDriver().findElement(By.cssSelector(".btn-block")).getCssValue("background-color");
		System.out.println("Button color: " + buttonColor);

	}

	public void verifyButtonText()// The text on the button must be exactly
									// “Dispense Now”
	{

		WebElement buttonText = getDriver().findElement(By.xpath("//a[contains(text(),'Dispense Now')]"));
		String ExpectedText = buttonText.getText();
		Assert.assertEquals("Dispense Now", ExpectedText);
		System.out.println(ExpectedText);

	}

	public void verifyButtonClick()// Step after clicking on the button, it
									// should direct me to a page with a text
									// that says “Cash dispensed
	{

		getDriver().findElement(By.linkText("Dispense Now")).click();
		WebElement text = getDriver().findElement(By.xpath("//div[@id='app']/div/main/div/div/div"));
		String ExpectedText = text.getText();
		Assert.assertEquals("Cash dispensed", ExpectedText);
		System.out.println(ExpectedText);
	}

	public void uploadfile() // Uploading CSV file via UI  
	{
		WebElement uploadBox = getDriver().findElement(By.className("custom-file-input"));
		uploadBox.sendKeys("/Users/rohini/Desktop/clerkdata.csv");

	}
}

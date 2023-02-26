package org.POM_TestCases;

import java.time.Duration;
import java.util.Properties;

import org.POM_Pages.PushPaAssignmentWickipedeaSource;
import org.genericMethods.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PushpaAssignmentWickiPediaSourceTC {
	GenericMethods gm = new GenericMethods();
	WebDriver driver = null;
	Properties prop = gm.getProp();

	@BeforeMethod
	public void OpenWikiWithPushpa() {
		GenericMethods gm = new GenericMethods();
		driver = gm.startUP(prop.getProperty("Browsername"), prop.getProperty("URLWicki"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void verifyMovieInformation() {

		PushPaAssignmentWickipedeaSource obj = new PushPaAssignmentWickipedeaSource(driver);
		Assert.assertEquals(obj.getCountryName(), "India", "Contry Name is not matched");
		Reporter.log("country name is =" + obj.getCountryName());
		Assert.assertEquals(obj.getReleaseDate(), "17 December 2021", "Release date is not matched");
		Reporter.log("release date is =" + obj.getReleaseDate());
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();

	}
}

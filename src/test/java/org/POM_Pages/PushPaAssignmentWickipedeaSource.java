package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class PushPaAssignmentWickipedeaSource {

	// WebElements

	@FindBy(xpath = "/html/body/div/div/div[3]/main/div[2]/div[3]/div/table/tbody/tr[12]/td/div/ul/li")
	private WebElement releaseDate;

	@FindBy(xpath = "/html/body/div/div/div[3]/main/div[2]/div[3]/div/table/tbody/tr[14]/td")
	private WebElement country;

	// constructor

	public PushPaAssignmentWickipedeaSource(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// page action methods.

	public String getReleaseDate() {
		return releaseDate.getText();
	}

	public String getCountryName() {
		return country.getText();
	}

}

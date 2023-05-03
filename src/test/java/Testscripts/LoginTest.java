package Testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.PredefinedActions;
import Pages.DisplayPage;
import Pages.LoginPage;
import Pages.SearchNumber;

public class LoginTest extends TestBase {

	@Test
	public void verifySuccesfulLogin() {
		System.out.println("STEP - Launch Chrome Browser & Hit url");
		// PredefinedActions.start("http://vcargo.managedservice.in/admin/homepage\r\n"
		// + "");

		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = LoginPage.getObject();
		loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");

		System.out.println("VERIFY - home page is displayed");
		String expetedTitle = "THÉA Virtual Cargo";
		String actualTitle = loginPage.getPageTitle();

		Assert.assertEquals(actualTitle, expetedTitle,
				"Expected title was " + expetedTitle + " but actual title was " + actualTitle);

	}

	@Test
	public void verifyDisplayPage() {
		System.out.println("STEP - Launch Chrome Browser & Hit url");
		// PredefinedActions.start("http://vcargo.managedservice.in/admin/homepage\r\n"
		// + "");

		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = LoginPage.getObject();
		loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");

		System.out.println("VERIFY - home page is displayed");
		String expetedTitle = "THÉA Virtual Cargo";
		String actualTitle = loginPage.getPageTitle();

		Assert.assertEquals(actualTitle, expetedTitle,
				"Expected title was " + expetedTitle + " but actual title was " + actualTitle);
		System.out.println("STEP - To check Forward Trip is selected or not");
		DisplayPage displayPage = DisplayPage.getObject();
		String isForwardTripSelected = displayPage.checkForwardTripSelected();
		System.out.println("Forward Trip Selected?" + isForwardTripSelected);
		assertEquals(isForwardTripSelected, "true");

		System.out.println("VERIFY - To check Vehicles | Forward Trips In-Progress is displayed ");
		String expectedText = "Vehicles | Forward Trips In-Progress";
		String actualText = displayPage.getForwardTripText();
		System.out.println("Text:" + actualText);
		assertEquals(actualText, expectedText);
		System.out.println("Vehicles | Forward Trips In-Progress is Displayed");
		System.out.println("STEP - Clean up - Close browser");
	}
		@Test
		public void verifySearch() {
			System.out.println("STEP - Launch Chrome Browser & Hit url");
			// PredefinedActions.start("http://vcargo.managedservice.in/admin/homepage\r\n"
			// + "");

			System.out.println("STEP - Enter valid login credentials");
			LoginPage loginPage = LoginPage.getObject();
			loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");
			
			System.out.println("Search number in search tab");
			SearchNumber searchNumber = SearchNumber.getObject();
			searchNumber.enterNumber("RJ14jk1239");
			
			System.out.println("VERIFY- If the data is displayed or not");
			
			
			
		}
		
		
		
	}



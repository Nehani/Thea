package Testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SearchNumber;

public class SearchNumberTest extends TestBase {
	@Test
	public void verifySearchNumber() throws InterruptedException {
		
		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = LoginPage.getObject();
		loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");
		
		//loginPage.enterVehichleNumberAndSearch("mdh90k");
		
		SearchNumber searchNumber = SearchNumber.getObject();
		searchNumber.enterNumber("afdsasf");
		Thread.sleep(5000);
		searchNumber.enterEnterKey();
		//searchNumber.clickOnSearch();
			
		Thread.sleep(5000);
		assertTrue(loginPage.isTableBlank());
	
	
	
	}
	
}

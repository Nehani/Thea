package Testscripts;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class SearchNumberTest extends TestBase {
	@Test
	public void verifySearchNumber() {
		
		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = LoginPage.getObject();
		loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");
	
		
	
	
	
	}
	
}

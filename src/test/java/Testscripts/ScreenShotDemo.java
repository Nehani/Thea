package Testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.PredefinedActions;
import Pages.LoginPage;
import Utility.PropertyFileOperations;

public class ScreenShotDemo {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		PropertyFileOperations fileOperations = new PropertyFileOperations(".//config//Settings");
		String url = fileOperations.getValue("url");
		driver = PredefinedActions.startTemp(url);

		LoginPage loginPage = LoginPage.getObject();
		loginPage.login(fileOperations.getValue("username"), fileOperations.getValue("password"));
	}

	@Test
	public void m1() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcFile, new File("./FailedTest/1.jpg"));
		}catch (IOException e){
			e.getStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		PredefinedActions.closeBrowser();
	}

}
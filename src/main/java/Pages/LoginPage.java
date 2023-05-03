package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PredefinedActions;

public class LoginPage extends PredefinedActions {
	private static LoginPage loginPage;

	@FindBy(id = "email")
	private WebElement userNameElement;

	@FindBy(id = "password")
	private WebElement passwordElement;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr")
	private List <WebElement> tableRows;
	
	@FindBy(xpath="//*[@id=\\\"root\\\"]/section/section/main/div/div[2]/div[1]/div[1]/div/div/div/span/span/span[1]/input")
	private WebElement vehicleSearchElement;
	
	@FindBy(xpath="//span[@class='anticon anticon-search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[text()='No Data']")
	private WebElement noDataElement;

	// @FindBy(css = "div.organization-logo.shadow>img")
	// private WebElement logo;

	// @FindBy(css = "")
	// private WebElement usernameErrorElement;

	// @FindBy(css = "")
	// private WebElement pwdErrorElement;

	public LoginPage() {

	}

	public static LoginPage getObject() {
		if (loginPage == null)
			loginPage = new LoginPage();
		PageFactory.initElements(driver, loginPage);
		return loginPage;
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginBtn();
	}

	public void enterUsername(String username) {
		// driver.findElement(By.id("txtUsername")).sendKeys(username);

		// WebElement e = getElement("id", "txtUsername", false);
		// setText(e,username);
		// setText("id", "txtUsername", false,username);
		// userNameElement.sendKeys(username);

		setText(userNameElement, username);
	}

	public void enterPassword(String password) {
		// driver.findElement(By.id("txtPassword")).sendKeys(password);
		setText(passwordElement, password);
	}

	public void clickOnLoginBtn() {
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		clickOnElement(submitBtn, false);
	}

	// public boolean isUsernameErrorMessageDisplayed() {
	// return isElementDisplayed(usernameErrorElement);
	// }

	public boolean isPasswordErrorMessageDisplayed() {
		return isElementDisplayed(passwordElement);
	}
	
	public void enterVehichleNumberAndSearch(String vehicleNumber) {
		setText(vehicleSearchElement, vehicleNumber);
		clickOnElement(searchButton,true);
	}
		
	public int countTableRows() {
		return getElementCountFromWebElementList(tableRows, false);
	}
	
	public boolean isTableBlank() {
		return isElementDisplayed(noDataElement);
	}
}

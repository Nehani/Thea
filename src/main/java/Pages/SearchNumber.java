package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PredefinedActions;

public class SearchNumber extends PredefinedActions {
	private static SearchNumber searchNumber;

	@FindBy(xpath = "//*[@id=\"root\"]/section/section/main/div/div[2]/div[1]/div[1]/div/div/div/span/span/span[1]/input")
	private WebElement searchElement;

	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr")
	private List<WebElement> verifyData;
	
	@FindBy(xpath="//span[@class='anticon anticon-search']")
	private WebElement searchButton;

	private SearchNumber() {

	}

	public static SearchNumber getObject() {
		if (searchNumber == null)
			searchNumber = new SearchNumber();
		PageFactory.initElements(driver, searchNumber);
		return searchNumber;
	}

	public void enterNumber(String number) {
		setText(searchElement, number);
	}
	
	public void clickOnSearch() {
		clickOnElement(searchButton, false);
	}
	
	public void enterEnterKey() {
		enterEnterKey(searchElement);
	}
	// public List<String> verifyData() {
	// return isElementDisplayed(WebElement,true) ;
	
	

}

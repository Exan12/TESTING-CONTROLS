package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is used to find the address of the Elements which are presnt in HomePage
 * @author Kiran
 *
 */
public class HomePage {
	
	// Declaration
	@FindBy(linkText = "Home")
	private WebElement HomeButton;
	
	@FindBy(linkText = "Create New")
	private WebElement CreateNewButton;
	
	@FindBy(id = "Search_Data")
	private WebElement SearchNameTxtField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement FindButton;
	
	@FindBy(xpath = "//button[text()='EDIT']")
	private WebElement EditButton;
	
	@FindBy(xpath = "//button[text()='DETAILS']")
	private WebElement DetailsButton;
	
	@FindBy(xpath = "//button[text()='DELETE']")
	private WebElement DeleteButton;
	
	@FindBy(id = "FirstName")
	private WebElement FirstNameTxtField;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTxtField;
	
	@FindBy(id = "EnrollmentDate")
	private WebElement EnrollmentDateTxtField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement CreateButton;
	
	// Initianization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public WebElement getCreateNewButton() {
		return CreateNewButton;
	}

	public WebElement getSearchNameTxtField() {
		return SearchNameTxtField;
	}

	public WebElement getFindButton() {
		return FindButton;
	}

	public WebElement getEditButton() {
		return EditButton;
	}

	public WebElement getDetailsButton() {
		return DetailsButton;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public WebElement getFirstNameTxtField() {
		return FirstNameTxtField;
	}

	public WebElement getLastNameTxtField() {
		return LastNameTxtField;
	}

	public WebElement getEnrollmentDateTxtField() {
		return EnrollmentDateTxtField;
	}

	public WebElement getCreateButton() {
		return CreateButton;
	}
	
	public WebElement getHomeButton() {
		return HomeButton;
	}
	
// Business Library Logics
	
	/**
	 * This Method is used to Create The Student
	 * @param firstname
	 * @param lastname
	 * @param enrollmentdate
	 */
	public void createStudent(String firstname,String lastname,String enrollmentdate)
	{
		HomeButton.click();
		CreateNewButton.click();
		FirstNameTxtField.sendKeys(firstname);
		LastNameTxtField.sendKeys(lastname);
		EnrollmentDateTxtField.sendKeys(enrollmentdate);
		CreateButton.click();
	}

}

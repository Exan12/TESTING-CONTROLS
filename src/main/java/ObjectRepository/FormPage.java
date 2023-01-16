package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverLibrary;

/**
 * This Class is used to find tthe address of the Elements present in FormPage
 * @author Kiran
 *
 */
public class FormPage {
	
	WebDriver driver;
	WebDriverLibrary wLib = new WebDriverLibrary();
	
	// Declaration
	@FindBy(linkText = "Form")
	private WebElement FormLink;
	
	@FindBy(id = "firstname")
	private WebElement FirstName;
	
	@FindBy(id = "lastname")
	private WebElement LastName;
	
	@FindBy(xpath = "//label[normalize-space()='Married']")
	private WebElement MaritalStatus_Married;
	
	@FindBy(xpath = "//label[normalize-space()='Single']")
	private WebElement MaritalStatus_Single;
	
	@FindBy(xpath = "//label[normalize-space()='Divorced']")
	private WebElement MaritalStatus_Divorced;
	
	@FindBy(xpath = "//label[normalize-space()='Dancing']")
	private WebElement Hobby_Dancing;
	
	@FindBy(xpath = "//label[normalize-space()='Reading']")
	private WebElement Hobby_Reading;
	
	@FindBy(xpath = "//input[@value='cricket']")
	private WebElement Hobby_Cricket;
	
	@FindBy(id = "datepicker")
	private WebElement DateOfBirth;
	
	@FindBy(xpath = "//select[@id='sel1']")
	private WebElement Country;
	
	@FindBy(xpath = "//option[text()='India']")
	private WebElement Country_India;
	
	@FindBy(id = "phonenumber")
	private WebElement PhoneNumber;
	
	@FindBy(id = "username")
	private WebElement UserName;
	
	@FindBy(id = "email")
	private WebElement Email;
	
	@FindBy(id = "comment")
	private WebElement AboutYourself;
	
	@FindBy(id = "pwd")
	private WebElement Password;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement Submit;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement Month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement Year;
	
	@FindBy(linkText = "ui-state-default")
	private WebElement Date;
	
	// Initialization
	public FormPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public WebElement getFormLink() {
		return FormLink;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getMaritalStatus_Married() {
		return MaritalStatus_Married;
	}

	public WebElement getMaritalStatus_Single() {
		return MaritalStatus_Single;
	}

	public WebElement getMaritalStatus_Divorced() {
		return MaritalStatus_Divorced;
	}

	public WebElement getHobby_Dancing() {
		return Hobby_Dancing;
	}

	public WebElement getHobby_Reading() {
		return Hobby_Reading;
	}

	public WebElement getHobby_Cricket() {
		return Hobby_Cricket;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getCountry_India() {
		return Country_India;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getAboutYourself() {
		return AboutYourself;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	public WebElement getDateOfBirth() {
		return DateOfBirth;
	}
	
	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getDate() {
		return Date;
	}
	
	
// Business Library Logics

	/**
	 * This Method is used to create the Student Form
	 * @param firstname
	 * @param lastname
	 * @param phonenumber
	 * @param username
	 * @param email
	 */
	public void createStudentForm(String firstname,String lastname,String phonenumber,String username,String email)
	{
		FormLink.click();
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		MaritalStatus_Married.click();
		Hobby_Cricket.click();
		Country.click();
		wLib.handleDropDown("India", Country);
		DateOfBirth.click();
		wLib.handleDropDown("Apr",Month);
		wLib.handleDropDown("1993", Year);
		PhoneNumber.sendKeys(phonenumber);
		UserName.sendKeys(username);
		Email.sendKeys(email);
		AboutYourself.sendKeys("HELLO WORLD! HOW ARE YOU GUYS......");
		Password.sendKeys("ashu@143!");
		Submit.click();
	}
	
}

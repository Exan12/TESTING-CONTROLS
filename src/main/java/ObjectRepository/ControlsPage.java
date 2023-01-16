package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLibraries.WebDriverLibrary;

/**
 * This class is used to find the address of the WebElemnets Present in this page
 * @author Kiran
 *
 */
public class ControlsPage {
	
	WebDriverLibrary wLib = new WebDriverLibrary();
	
	// Declaration
	@FindBy(linkText = "Controls")
	private WebElement ControlsLink;
	
	@FindBy(id = "draggable")
	private WebElement DragMeToMyTarget;
	
	@FindBy(id = "droppable")
	private WebElement DropHere;
	
	@FindBy(xpath = "//button[text()='Double Click ME !']")
	private WebElement DoubleClickMe;
	
	@FindBy(id = "name")
	private WebElement EnterYourName;
	
	@FindBy(linkText = "uitestpractice.com")
	private WebElement UITestLink;
	
	@FindBy(linkText = "Visit uitest practice")
	private WebElement UiTestTab;
	
	@FindBy(linkText = "Click here to watch videos on C#")
	private WebElement UiNewWindow;
	
	@FindBy(id = "ui-id-1")
	private WebElement MVCFramework;
	
	@FindBy(id = "ui-id-2")
	private WebElement Selenium;
	
	@FindBy(id = "ui-id-3")
	private WebElement CodedUI; 
	
	@FindBy(id = "ui-id-4")
	private WebElement MobileAppTesting;
	
	// Initialization
	public ControlsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// Utilization
	public WebElement getDragMeToMyTarget() {
		return DragMeToMyTarget;
	}

	public WebElement getDropHere() {
		return DropHere;
	}
	
	public WebElement getControlsLink() {
		return ControlsLink;
	}

	public WebElement getDoubleClickMe() {
		return DoubleClickMe;
	}

	public WebElement getEnterYourName() {
		return EnterYourName;
	}

// Business Library Logics
	
	/**
	 * This Method is used to perform the Drag And Drop Operation
	 */
	public void dragAndDrop(WebDriver driver)
	{
		ControlsLink.click();
		wLib.dragAndDropOn(driver,DragMeToMyTarget,DropHere);
	}
	
	/**
	 * This Method is used to perform Double Click Operation
	 * @param driver
	 * @return
	 */
	public String doubleClickMe(WebDriver driver)
	{
		ControlsLink.click();
		wLib.doubleClickOn(driver, DoubleClickMe);
		String Text = wLib.getAlertText(driver);
		System.out.println(Text);
		wLib.acceptAlert(driver);
		return Text;
	}
	
	/**
	 * This Method is used to perform Iframe Operations
	 * @param driver
	 */
	public void iFrame(WebDriver driver)
	{
		ControlsLink.click();
		wLib.scrollAction(driver, EnterYourName);
		UITestLink.click();
		driver.switchTo().frame("iframe_a");
		Reporter.log("Switched to Frame Page",true);
		wLib.dragAndDropOn(driver,DragMeToMyTarget,DropHere);
		driver.switchTo().defaultContent();
		Reporter.log("Switched to Main WebPage",true);
	}
	
	/**
	 * This Method is used to open the Url in New Tab
	 */
	public void UiTestNewTab()
	{
		ControlsLink.click();
		UiTestTab.click();
		Reporter.log("Clicked on the Link",true);
	}
	
	/**
	 * This Method is used to Switch New Window
	 * @param driver
	 */
	public void UITestNewWindow(WebDriver driver)
	{
		UiNewWindow.click();
	    wLib.switchToWindow(driver,"MDFWKBwE");
	    Reporter.log("Switched to New Window",true);
	    driver.findElement(By.id("video-title")).click();
	    wLib.switchToWindow(driver, "uitestpractice");
	    Reporter.log("Switched to Parent Window",true);
	   
	}
	
	/**
	 * This Method is used to get the Text of the Accordian Controls
	 * @param driver
	 * @return
	 */
	public String AccordianControl(WebDriver driver)
	{
		/*MVCFramework.click();
		String Text1 = driver.findElement(By.id("accordian1")).getText();
		System.out.println(Text1);
		return Text1;*/
		
		Selenium.click();
		String Text2 = driver.findElement(By.id("accordian2")).getText();
		System.out.println(Text2);
		return Text2;
	}
}

package GenericLibraries;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class consists of the Prequiste methods to start the testScript
 * @author Kiran
 *
 */
public class BaseClass {

	public JavaLibrary jLib = new JavaLibrary();
	public ExcelFileLibrary eLib = new ExcelFileLibrary();
	public PropertyFileLibrary pLib = new PropertyFileLibrary();
	public WebDriverLibrary wLib = new WebDriverLibrary();
	public WebDriver driver = null;
	public static WebDriver sDriver = null;

	@BeforeSuite(groups = {"smokeSuite","regressionSuite"})
	public void bsConfigration()
	{
		Reporter.log("- - - DataBase Connected Succesfully - - -",true);
	}

	//@Parameters("browser")
	//@BeforeTest
	
	@BeforeClass(groups = {"smokeSuite","regressionSuite"})
	public void bcConfigration() throws Throwable
	{
		String BROWSER = pLib.getpropertyfile("browser");
		String URL = pLib.getpropertyfile("url");

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else
		{
			Reporter.log(" - - - Invalid Browser Name - - - ",true);
		}
		
		sDriver = driver;
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
	}
	
	@BeforeMethod(groups = {"smokeSuite","regressionSuite"})
	public void bmConfigration() throws Throwable
	{
		
		Reporter.log(" - - - Logged Into The Application Succesfully - - - ",true);
	}

	@AfterMethod(groups = {"smokeSuite","regressionSuite"})
	public void amConfigration()
	{
		Reporter.log(" - - - Logged Out From The Application Succesfully - - - ",true);
	}

	@AfterTest
	@AfterClass(groups = {"smokeSuite","regressionSuite"})
	public void acConfigration() throws Throwable
	{
		String BROWSER = pLib.getpropertyfile("browser");
		driver.quit();
		Reporter.log(" - - - "+BROWSER+" Has Closed Succesfully - - - ",true);
	}

	@AfterSuite(groups = {"smokeSuite","regressionSuite"})
	public void asConfigration()
	{
		Reporter.log("- - - DataBase Closed Succesfully - - - ");
	}
}

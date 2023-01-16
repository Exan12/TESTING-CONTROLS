package TestingControls;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.FormPage;

/**
 * This class is used to test the Form is Created Or Not
 * @author Kiran
 *
 */

@Listeners(GenericLibraries.ListenersImplementationLibrary.class)

public class CreateFormTest extends BaseClass{
	
	@Test
	public void createFormTest()
	{
		FormPage fp = new FormPage(driver);
		fp.createStudentForm("Suma", "Iyengar", "945878962", "SumaHifi", "suma@gmail.com");
		Reporter.log("Created Student Form Succesfully",true);
	}

}

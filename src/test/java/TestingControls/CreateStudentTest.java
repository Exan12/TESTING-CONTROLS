package TestingControls;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.HomePage;

/**
 * This Class is used to Test the HomePage Elements
 * @author Kiran
 *
 */
public class CreateStudentTest extends BaseClass{
	
	@Test
	public void createstudentTest()
	{
		HomePage hp = new HomePage(driver);
		hp.createStudent("RATNA", "KIRAN", "45789");
		Reporter.log("Created Student Succesfully",true);
	}

}

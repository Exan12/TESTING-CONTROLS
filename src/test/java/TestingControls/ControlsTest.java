package TestingControls;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.ControlsPage;

/**
 * This Class is used to perform
 * @author Kiran
 *
 */
public class ControlsTest extends BaseClass{

	@Test
	public void dragAndDropTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing Drag And Drop Operation
		cp.dragAndDrop(driver);
		Reporter.log("Drag and Drop Operation done Successfully",true);
	}

	@Test
	public void doubleClickTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing Double Click Operation
		cp.doubleClickMe(driver);
		Reporter.log("Double Click Operation Done Succesfully",true);
	}

	@Test
	public void IFrameTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing Iframe Operation
		cp.iFrame(driver);
		Reporter.log("IFrame operation Done Succesfully",true);
	}
	
	@Test
	public void UiTestNewTabTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing New Tab Operation
		cp.UiTestNewTab();
		Reporter.log("New Tab Operation done Succesfully",true);
	}
	
	@Test
	public void UiNewWindowTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing New Window Operation
		cp.UITestNewWindow(driver);
		Reporter.log("New Window Operation done Succesfully",true);
	}
	
	@Test
	public void AccordianControlTest()
	{
		ControlsPage cp = new ControlsPage(driver);
		// Performing Accordian Control Operations
		cp.AccordianControl(driver);
		Reporter.log("Accordian Control Operations done Succesfully",true);
	}

}

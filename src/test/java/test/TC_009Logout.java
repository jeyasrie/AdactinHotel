package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.Home;
import page.WelcomeAdactin;

public class TC_009Logout extends ProjectSpecification {
	
	@BeforeTest
	public void set()
	{
		testName="logout Test";
		testDescription="Testing the logout function";
		testAuthor="Jeyasri";
		testCategory="Smoke Testing"; 
	}
	@Test
	public void LOGOUT_test()
	{
		Home homeObj=new Home(driver);
		homeObj.EnterUName("vihansankar")
		.EnterUPassword("vihan123")
		.ClickLoginButton();
		WelcomeAdactin WA=new WelcomeAdactin(driver);
		WA.Click_LogoutButton();
	}

}

package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.ChangePasswordPage;
import page.Home;
import page.WelcomeAdactin;

public class TC_008Changepassword  extends ProjectSpecification {
	@BeforeTest
	public void setup()
	{
		sheetname="Changepassword";
		testName="change password Test";
		testDescription="Testing the Change password function";
		testAuthor="Jeyasri";
		testCategory="Smoke Testing"; 
	}
	
	@Test(dataProvider="readdata")
	public void change_PasswordTest(String current_pwd,String new_passwd,String confirmpass,String TestType,String expected)
	{
		Home homeObj=new Home(driver);
		homeObj.EnterUName("vihansankar")
		.EnterUPassword("vihan123")
		.ClickLoginButton();
		
		WelcomeAdactin WA=new WelcomeAdactin(driver);
		WA.Click_changePassword();
		
		ChangePasswordPage CPP=new ChangePasswordPage(driver);
	    CPP.Enter_currentpassword(current_pwd)
	    .Enter_Newpassword(new_passwd)
	    .Enter_Repassword(confirmpass)
	    .Click_submit1()
	    .validate_chanepassword(TestType, expected);
		
	}

}

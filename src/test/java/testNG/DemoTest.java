package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Change done in local C 
public class DemoTest {
	
	@BeforeMethod(alwaysRun=true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups="Regression")
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	
	@Test(groups="Sanity")
	public void editCustomer() {
		Reporter.log("editCustomer",true);
	}
	
	@Test(groups="Regression")
	public void searchCustomer() {
		Reporter.log("searchCustomer",true);
	}
	
	@Test(groups="Sanity")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}

}

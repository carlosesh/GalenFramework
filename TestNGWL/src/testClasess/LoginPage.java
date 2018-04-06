package testClasess;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseSuite;
import data.TestData;

public class LoginPage extends BaseSuite {
  
	@Test(dataProvider="validTest", dataProviderClass=TestData.class)
  public void validLogin(String username, String password, String message){
		Assert.assertTrue(loginPF().welcomeHeader());
		loginPF().clickLoginBtn();
		Assert.assertTrue(loginPF().loginHeader());
		loginPF().typeUsernameFld(username);
		loginPF().typePasswordFld(password);
		loginPF().clickLoginBtn();
		Assert.assertEquals(loginPF().getSucessMsg(), message);
  }
	
	@Test(dataProvider="wrongTest", dataProviderClass=TestData.class)
	  public void invalidLogin(String username, String password, String message){
		Assert.assertTrue(loginPF().welcomeHeader());
		loginPF().clickLoginBtn();
		Assert.assertTrue(loginPF().loginHeader());
		loginPF().typeUsernameFld(username);
		loginPF().typePasswordFld(password);
		loginPF().clickLoginBtn();
		Assert.assertEquals(loginPF().getLoginErrMsg(), message);	
	}
}

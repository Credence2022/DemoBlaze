package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass
{
	@Test
	public void verifyLogInTab() throws InterruptedException
	{
		lp.logIn();
		lp.userName();
		lp.passWord();
		lp.logInButton();
		Assert.assertEquals(lp.welcomeText(), "Welcome group4");
		
	}
	

}

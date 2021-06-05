package Objects;

import java.util.Random;

public class loginRegisterObjs {

	public String noThanksButton="//button[contains(text(),'No thanks')]";
	public String noThanksButtona="//button[@id='wzrk-confirm']";
			
	public String accountButton="//div[contains(text(),'Account')]";
	public String accountButtona="//div[contains(text(),'الحساب')]";
	
	public String createanaccountbutton="//a[contains(text(),'إنشاء حساب')]";
	public String createanaccountbuttona="//a[@class='CustomerPopup-signUpButton']";
	public String firstname="Testfirst";
	public String lastname="Testlast";
	Random randomGenerator = new Random();
	int randonnumber = randomGenerator.nextInt(10001);
	public String email="test"+randonnumber+"@gmail.com";
	public String password="123456789qQ!";
	public String firstName="firstName";
	public String lastName="lastName";
	public String Password="password";
	public String createAccountButton="//button[contains(text(),'Create Account')]";
	public String createAccountButtona="//button[contains(text(),'إنشاء حساب')]";
	public String arabic="//a[@class='SiteNavigation-languageLink']";
	

	
}


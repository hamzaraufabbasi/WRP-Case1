package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Helpers.DriverBase;
import Objects.Hometocheckoutobjs;
import Objects.Others;
import Objects.loginRegisterObjs;


public class Testcasesarabic extends DriverBase  {
	
		Others othersobj = new Others();
		loginRegisterObjs lrobj = new loginRegisterObjs();
		Hometocheckoutobjs hcobj = new Hometocheckoutobjs();
		  public static SoftAssert softAssertionforHomeVerification= new SoftAssert();
		  public String emailverification= lrobj.email;
		  public String name;
		@BeforeSuite(groups={"AS-SmokeTestwithBFB"})
		public void BeforeSuit () throws InterruptedException 
		{	
		
		driver = new ChromeDriver();
		System.setProperty(othersobj.Chrome, othersobj.Browserpath);
		
		driver.get(othersobj.URL);
		driver.manage().window().maximize();
		
		}
		
		
		
		
		  @Test(groups={""}) 
		  
		  public void T00_arabic_clickPopUp_noThanksButton () throws
		  InterruptedException { othersobj.customwait(5000);//we can also put explicit wait
		  driver.findElement(By.xpath(lrobj.noThanksButton)).click();
		  
		  
		  }
		 
		  @Test(groups={""}) 
		  
		  public void T00_arabic_switcharabiclang() throws
		  InterruptedException { 
		  driver.findElement(By.xpath(lrobj.arabic)).click();
		  
		  
		  }
		  
 @Test(groups={""}) 
		  
		  public void T00_arabic_xclickPopUp_noThanksButton () throws
		  InterruptedException { othersobj.customwait(10000);//we can also put explicit wait
		  driver.findElement(By.xpath(lrobj.noThanksButtona)).click();
		  
		  
		  }
		
		@Test(groups={""})
		public void T01_arabic_clickAccountButton () throws InterruptedException 
		{			
			Actions  actions = new Actions(driver); 
			WebElement Execute =  driver.findElement(By.xpath(lrobj.accountButtona));
			othersobj.customwait(1000);
			actions.moveToElement(Execute);
			othersobj.customwait(1000);
			actions.build().perform();
			driver.findElement(By.xpath(lrobj.createanaccountbuttona)).click();
		
		}
		
		@Test(groups={""})
		public void T02_arabic_fillregistrationform () 
		{			
			driver.findElement(By.name(lrobj.firstName)).sendKeys(lrobj.firstname);
			driver.findElement(By.name(lrobj.lastName)).sendKeys(lrobj.lastname);
			driver.findElement(By.name("email")).sendKeys(lrobj.email);
			driver.findElement(By.name(lrobj.Password)).sendKeys(lrobj.password);
			driver.findElement(By.xpath(lrobj.createAccountButtona)).click();
			
			
		}

		@Test(groups={""})
		public void T03_arabic_openeditpage() throws InterruptedException
		
		{othersobj.customwait(5000);
		driver.findElement(By.xpath(hcobj.accountButton2a)).click();
			driver.findElement(By.xpath(hcobj.editButtona)).click();
		
			
		}
		
		
		
		

		@Test(groups={""})
		public void T04_arabic_clickeditbutton() throws InterruptedException
		
		{othersobj.customwait(5000);
	
			driver.findElement(By.xpath(hcobj.editButtonab)).click();
			
		}
		
		@Test(groups={""})
		public void T05_arabic_emaildisableverification() throws InterruptedException
		
		{othersobj.customwait(2000);
			
		othersobj.customwait(2000);
		String emailverification =	driver.findElement(By.name("email")).getAttribute("disabled");
		Assert.assertTrue(emailverification.contains(""));
			 
	//	Assert.assertFalse(driver.findElement(By.xpath("//div[@class='MyAccountPage-emailWrapper MyAccountPage-cell']//span[@class='MyAccountPage-value']")).isSelected(), "button is Enabled.");

			
		}
		
		@Test(groups={""})
		public void T06_arabic_emailVerification() throws InterruptedException
		
		{othersobj.customwait(2000);
			String email=driver.findElement(By.xpath(hcobj.emailverification)).getAttribute("value");
			System.out.println(email);
			System.out.println(lrobj.email);
			assertTrue(email.contains(lrobj.email));

		}
		
		@Test(groups={""})
		public void T07_arabic_hoverClothingNavigationOption() throws InterruptedException
		
		{
			
			Actions  actions = new Actions(driver); 
			WebElement Execute =  driver.findElement(By.xpath(hcobj.clothinga));
			othersobj.customwait(2000);
			actions.moveToElement(Execute);
			othersobj.customwait(2000);
			actions.build().perform();
			WebElement  element=driver.findElement(By.xpath(hcobj.allclothinga));  
		      JavascriptExecutor ex=(JavascriptExecutor)driver;
		      ex.executeScript("arguments[0].click()", element);
			
}

		
		@Test(groups={""})
		public void T08_arabic_clickingAnItempant() throws InterruptedException
		
		{
			
			driver.findElement(By.xpath(hcobj.itema)).click();		
}

		@Test(groups={""})
		public void T09_arabic_gettingitem1name() throws InterruptedException
		
		{
			othersobj.customwait(2000);
			 name= driver.findElement(By.xpath(hcobj.itemname)).getText();
			
			
			System.out.println(name);
			
}		

			

		@Test(groups={""})
		public void T11_arabic_selectsize() throws InterruptedException
		
		{
			driver.findElement(By.xpath(hcobj.sizedropdown)).click();
			Thread.sleep(4000);//we can also put explicit wait
			Actions selectoption = new Actions(driver); selectoption.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
			
}	
		
		@Test(groups={""})
		public void T12_arabic_clickaddtobagbtn() throws InterruptedException
		
		{
		
			driver.findElement(By.xpath(hcobj.addtobagbtn)).click();	
			othersobj.customwait(5000);
			
}		
		
		
		@Test(groups={""})
		public void T13_arabic_clickbagbuttontoviewcart() throws InterruptedException
		
		{
		
			driver.findElement(By.xpath(hcobj.clickbagbtn)).click();	
			
			
}				

		@Test(groups={""})
		public void T14_arabic_verifyitemname() throws InterruptedException
		
		{
		
			   String nameincart = driver.findElement(By.xpath(hcobj.itemnameoncart)).getText();
			      System.out.println(nameincart);
			      System.out.println(name);
			      Assert.assertTrue(nameincart.contains(name));	
			
			
}	

		@Test(groups={""})
		public void T15_arabic_clickbagbuttontoviewcart() throws InterruptedException
		
		{
		
			driver.findElement(By.xpath(hcobj.securecheckouta)).click();	
			othersobj.customwait(5000); //we can also put explicit wait
			
}		
		@Test(groups={""})
		public void T16_arabic_fillform() throws InterruptedException
		
		{driver.findElement(By.id("mobileNumber")).sendKeys(hcobj.number);
			//driver.findElement(By.name(hcobj.mobno)).sendKeys(hcobj.number);
			driver.findElement(By.xpath(hcobj.sizedropdown)).click();
			Thread.sleep(4000);//we can also put explicit wait
			Actions selectoption = new Actions(driver); selectoption.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
			othersobj.customwait(3000);//we can also put explicit wait
			driver.findElement(By.name("city")).sendKeys(hcobj.area);
			driver.findElement(By.name("street")).sendKeys(hcobj.streename);
			
			//we can also put explicit wait
}		
		@Test(groups={""})
public void T17_arabic_clickcontinuebtn() throws InterruptedException
		
		{
			/* driver.findElement(By.xpath(hcobj.continuebutton)).click(); */
			
			  WebElement cntbtn=driver.findElement(By.xpath(hcobj.continuebutton));
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()", cntbtn);
			  System.out.println("clicked continue button") ;
			  othersobj.customwait(7000);
}		
		
		@AfterMethod
		public void invokeScreenshotMethod(ITestResult res)
		{
		if (ITestResult.FAILURE==res.getStatus()){
		try{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./SSoferrorsforarabic/"+System.currentTimeMillis()+".png"));
		
		}
		
		catch (IOException e)
		 
		{
		 
		System.out.println(e.getMessage());
		 
		    }}}
		
		@AfterSuite(groups={""})
		public void AfterSuit () throws InterruptedException 
		{
		System.out.println("Arabic Testrun is complete.");
			driver.quit();
		}
		
}

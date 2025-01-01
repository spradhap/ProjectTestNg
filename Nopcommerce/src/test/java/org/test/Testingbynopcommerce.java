package org.test;

import java.io.IOException;

import org.bsae.Baseclassmy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pom.Pom;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testingbynopcommerce extends Baseclassmy{
	
	public static Pom page;	
	
	
    @Test(priority=1)
    public static  void Initializationofbrowser() throws IOException {
		getDriver(excelRead(0, 0));
	
    }
	
    
	@Test(priority=2)
	public  void Applicationurllanched() throws IOException   {
		getUrl(excelRead(0, 2));
        
	}
	
	@Test(priority=3)
	public void Register() throws IOException {
		
		page = new Pom();
		
		 WebElement register = page.getRegister();

		register.click();
		
		WebElement getgender = page.getgender();
		
		getgender.click();
		
		WebElement getfristname = page.getfristname();
		
		getfristname.sendKeys(excelRead(1, 3));
		
		WebElement getlastname = page.getlastname();
		
		getlastname.sendKeys(excelRead(1, 4));
	
		WebElement getdate = page.getdate();
		
		getdate.sendKeys(excelRead(4, 5));
		
		WebElement getmonth = page.getmonth();
		
		getmonth.sendKeys(excelRead(8, 6));
		
		WebElement getyear = page.getyear();
		
		getyear.sendKeys(excelRead(2, 7));
		
		WebElement getemail = page.getemail();
		
		getemail.sendKeys(excelRead(1, 8));
		
		WebElement getpassword = page.getpassword();
		
		getpassword.sendKeys(excelRead(1, 9));
		
		WebElement getconfirmpassword = page.getconfirmpassword();
		
		getconfirmpassword.sendKeys(excelRead(1, 9));
		
		WebElement getresgisterclick = page.getresgisterclick();
		
		getresgisterclick.click();
		
	}
		
	
	
		
		@Test(priority=4)
		public void loginfuctional() throws IOException {
			
			WebElement getlogin = page.getlogin();
			
			getlogin.click();
			
			WebElement getemaillogin = page.getemaillogin();
			
			getemaillogin.sendKeys(excelRead(1, 8));
		
		    WebElement getpasswordlogin = page.getpasswordlogin();
		    
		    getpasswordlogin.sendKeys(excelRead(1, 9));
			
		    WebElement rememberMe = page.getRememberMe();
		    
		    rememberMe.click();
		    
		    WebElement getloginbutton = page.getloginbutton();
		    
		    getloginbutton.click();
		    
		}
		    
	
		@Test(priority=5)
		public void searching() throws IOException {
			
			WebElement getsearching = page.getsearching();
			
			getsearching.sendKeys(excelRead(1, 10),Keys.ENTER);
			
			WebElement getaddcart1 = page.getaddcart1();
			
			getaddcart1.click();
			
           threadsleep(5000);
           
			WebElement getaddcart2 = page.getaddcart2();
			
			getaddcart2.click(); 
			
			threadsleep(5000);
			
			WebElement getshopping = page.getshopping();
			
			getshopping.click();
			
			threadsleep(10000);
			
			WebElement getiagree = page.getiagree();
			getiagree.click();
			
			threadsleep(5000);
			
			WebElement getcheckout = page.getcheckout();
			getcheckout.click();
			
		}
			
			

		@Test(priority=6)
		public void billingaddress() throws IOException {
			
			
			WebElement getbillingfristname = page.getbillingfristname();
			getbillingfristname.clear();
			getbillingfristname.sendKeys(excelRead(1, 3));
			
			WebElement getbillinglastname = page.getbillinglastname();
			getbillinglastname.clear();
			getbillinglastname.sendKeys(excelRead(1, 4));
			
			WebElement getbillingemail = page.getbillingemail();
			getbillingemail.clear();
			getbillingemail.sendKeys(excelRead(1, 8));
			
			WebElement getbillingcountryid = page.getbillingcountryid();
			getbillingcountryid.sendKeys(excelRead(6, 11));
			
		    WebElement getbillingcity = page.getbillingcity();
		    getbillingcity.sendKeys(excelRead(1, 12));
			
		    WebElement getbillingaddress1 = page.getbillingaddress1();
		    getbillingaddress1.sendKeys(excelRead(1, 13));
		    
		    WebElement getpincode = page.getpincode();
		    getpincode.sendKeys(excelRead(1, 14));
		    
		    WebElement getbillingphonenumber = page.getbillingphonenumber();
		    getbillingphonenumber.sendKeys(excelRead(1, 15));
		    
		    threadsleep(10000);
		    
		    WebElement getbillingContinue = page.getbillingContinue();
		    getbillingContinue.click();
		    
		}
		    
		    
		@Test(priority=7)
		public void shippingmethod() throws IOException {
			
			threadsleep(5000);
			
			WebElement getshippingbutton = page.getshippingbutton();
			getshippingbutton.click();
			
			threadsleep(5000);
			
			WebElement getshippingcontinue = page.getshippingcontinue();
			getshippingcontinue.click();
			 
		}
		
		@Test(priority=8)
		public void paymentmethod() throws IOException {
			
		
			threadsleep(5000);
			
			WebElement getpaymethodbutton = page.getpaymethodbutton();
			getpaymethodbutton.click();
			
			threadsleep(5000);
			
			WebElement getpaymethodcontinue = page.getpaymethodcontinue();
			getpaymethodcontinue.click();
		
		 
			threadsleep(10000); 
			
			WebElement getpaymethodinform = page.getpaymethodinform();
			
			getpaymethodinform.click();
		
		     
		}
		
			@Test(priority=9)
			public void confirm() throws IOException {
				
				threadsleep(10000);
				
				WebElement getconfirm = page.getconfirm();
				
				getconfirm.click();
				
		
		        threadsleep(5000);
		        
		        WebElement getconsoluntext = page.getconsoluntext();
		        String text = getconsoluntext.getText();
		        System.out.println(text);
		        
		        
		        WebElement getsuccesfulltext = page.getsuccesfulltext();
		        String text3 = getsuccesfulltext.getText();
		        System.out.println(text3);
		        
		     
		        threadsleep(5000);
		        
		        WebElement getthankyou = page.getthankyou();
		        getthankyou.click();
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

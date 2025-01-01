package org.pom;

import org.bsae.Baseclassmy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Baseclassmy {

	public Pom() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement register;

	public WebElement getRegister() {

		return register;
	}
	
	@FindBy(id = "gender-male")
	private WebElement male;

	public WebElement getgender() {

		return male;
	}
	
	@FindBy(id = "FirstName")
	private WebElement name;

	public WebElement getfristname() {

		return name;
	}
	
	@FindBy(id = "LastName")
	private WebElement name1;

	public WebElement getlastname() {

		return name1;
	}
	
	@FindBy(name = "DateOfBirthDay")
	private WebElement date;

	public WebElement getdate() {

		return date;
	}
	
	@FindBy(name = "DateOfBirthMonth")
	private WebElement month;

	public WebElement getmonth() {

		return month;
	}
	
	@FindBy(name = "DateOfBirthYear")
	private WebElement year;

	public WebElement getyear() {

		return year;
	}
	
	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getemail() {

		return email;
	}
	
	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getpassword() {

		return password;
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	public WebElement getconfirmpassword() {

		return confirmpassword;
	}
	
	@FindBy(id = "register-button")
	private WebElement resgister;

	public WebElement getresgisterclick() {

		return resgister;
	}
	
	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement login;

	public WebElement getlogin() {

		return login;
	}
	
	@FindBy(id = "Email")
	private WebElement email1;

	public WebElement getemaillogin() {

		return email1;
	}
	
	@FindBy(id = "Password")
	private WebElement pass;

	public WebElement getpasswordlogin() {

		return pass;
	}
	
	@FindBy(id = "RememberMe")
	private WebElement RememberMe;

	public WebElement getRememberMe() {

		return RememberMe;
	}
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement button;

	public WebElement getloginbutton() {

		return button;
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement search;

	public WebElement getsearching() {

		return search;
	}
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement add;

	public WebElement getaddcart1() {

		return add;
	}
	
	@FindBy(id = "add-to-cart-button-4")
	private WebElement add1;

	public WebElement getaddcart2() {

		return add1;
		
	}
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shop;

	public WebElement getshopping() {

		return shop;
	}
	
	
	
	
	@FindBy(name = "termsofservice")
	private WebElement check;

	public WebElement getiagree() {

		return check;
	}
	
	@FindBy(id = "checkout")
	private WebElement out;

	public WebElement getcheckout() {

		return out;
	}
	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement frist;

	public WebElement getbillingfristname() {

		return frist;
	}
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement last;

	public WebElement getbillinglastname() {

		return last;
	}
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement lee;

	public WebElement getbillingemail() {

		return lee;
	}
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country;

	public WebElement getbillingcountryid() {

		return country;
	}
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;

	public WebElement getbillingcity() {

		return city;
	}
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address;

	public WebElement getbillingaddress1() {

		return address;
	}
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pin;

	public WebElement getpincode() {

		return pin;
	}
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phone;

	public WebElement getbillingphonenumber() {

		return phone;
	}
	
	@FindBy(xpath = "(//button[@class='button-1 new-address-next-step-button'])[1]")
	private WebElement bill;

	public WebElement getbillingContinue() {

		return bill;
	}
	
	@FindBy(id = "shippingoption_1")
	private WebElement ship;

	public WebElement getshippingbutton() {

		return ship;
	}
	
	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
	private WebElement shipp;

	public WebElement getshippingcontinue() {

		return shipp;
	}
	
	@FindBy(id = "paymentmethod_0")
	private WebElement pay;

	public WebElement getpaymethodbutton() {

		return pay;
	}
	
	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
	private WebElement payment;

	public WebElement getpaymethodcontinue() {

		return payment;
	}
	
	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
	private WebElement inf;

	public WebElement getpaymethodinform() {

		return inf;
	}
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement conf;

	public WebElement getconfirm() {

		return conf;
		
		
	}
	
	@FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
	private WebElement you;

	public WebElement getthankyou() {

		return you;
	}
	
	
	
	
	
	@FindBy(xpath = "//h1[text()='Thank you']")
	private WebElement cons;

	public WebElement getconsoluntext() {

		return cons;
	}
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement succ;

	public WebElement getsuccesfulltext() {

		return succ;
	}
	
	@FindBy(xpath = "//a[text()='Click here for order details.']")
	private WebElement ord;

	public WebElement getorderclickdetails() {

		return ord;
	}
	
	@FindBy(xpath = "(//button[@class='button-1 new-address-next-step-button'])[1]")
	private WebElement ord1;

	public WebElement getnewcontueeeee() {

		return ord1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

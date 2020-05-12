package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.seleniumhq.jetty9.http.HttpParser.State;

public class ConsumerExtraPage 
{
	@FindBy(id="loginuser")
	private WebElement email;
	
	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(id="btnlogin")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul[2]/li[3]/a/img")
	private WebElement myorders;
	
	@FindBy(xpath="//*[@id=\"cartspin\"]/div[2]/div[1]/ul/li[2]")
	private WebElement nonper;
	
	@FindBy(id="generateInvoice")
	private WebElement invoice;
	
	@FindBy(id="navbardrop")
	private WebElement user;
	
	@FindBy (xpath="//a[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//*[@id=\"editModal\"]/div[4]/div[2]/div[2]/div/div")
	private WebElement addpref;
	
	@FindBy(id="Vegetables")
	private WebElement veg;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="id=\"contactupdate\"")
	private WebElement edit;
	
	@FindBy(xpath="//*[@id=\"__blaze-root\"]/div/nav/div/a/img")
	private WebElement logo;
	
	// Shipping Address
	@FindBy(xpath="//*[@id=\"editModal\"]/div[5]/div[1]/div[2]/div/div")
	private WebElement addr;
	
	@FindBy(id="txtaddr")
	private WebElement txtaddr;
	
	@FindBy(id="address")
	private WebElement editaddr;
	
	@FindBy(id="txtstate")
	private WebElement state;
	
	@FindBy(id="txtdistrict")
	private WebElement dist;
	
	@FindBy(id="txtpin")
	private WebElement pin;
	
	@FindBy(id="txtnearby")
	private WebElement near;
	
	@FindBy(id="newshipadd")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"editModal\"]/div[5]/div[4]/div[2]/div[7]/span[3]")
	private WebElement editclk;
	
	@FindBy(id="updateshipadd")
	private WebElement update;
	
	@FindBy(xpath="//div/button[text()=\"OK\"]")
	private WebElement editok;
	
	@FindBy(xpath="//*[@id=\"editModal\"]/div[5]/div[4]/div[2]/div[7]/span[2]")
	private WebElement del;
	
	@FindBy(id="productTypes")
	private WebElement ptype;
	
	@FindBy(id="mypreferance")
	private WebElement Clickfilter;
	
	@FindBy(xpath="//*[@id=\"allchecked1\"]")
	private WebElement ptypeselect;
	
	@FindBy(id="state")
	private WebElement fstate;
	
	@FindBy(id="district")
	private WebElement fdist;
	
	@FindBy(xpath="//*[@id=\"editpreferenceinfo\"]/div/div/div[2]/div[4]/div/div/div")
	private WebElement fupdate;
	
	@FindBy(xpath="/html/body/div[5]/button[2]")
	private WebElement fok;
	
	@FindBy(xpath="//*[@id=\"removepreference\"]")
	private WebElement clear;
	
	@FindBy(xpath="//div/a[@href=\"/register\"]")
	private WebElement signup;
	
	@FindBy(id="txtuserfirst")
	private WebElement uname;
	
	@FindBy(id="txttin")
	private WebElement tin;
	
	@FindBy(id="txtemail")
	private WebElement mail;
	
	@FindBy(id="txtphone")
	private WebElement phone;
	
	@FindBy(id="txtpassword")
	private WebElement pwd;
	
	@FindBy(id="conftxtpassword")
	private WebElement cpwd;
	
	@FindBy(id="acceptTerms")
	private WebElement terms;
	
	@FindBy(id="btnregister")
	private WebElement signbtn;
	
	@FindBy(id="userlogout")
	private WebElement slogout;
	
	public ConsumerExtraPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginEmail(String un)
	{
		email.sendKeys(un);
	}
	
	public void ClcikFilterBtn() throws InterruptedException
	{
		Clickfilter.click();
		Thread.sleep(2000);
	}
	
	public void LoginPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void LoginButton() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(2000);
	}
	
	public void Myorder()
	{
		myorders.click();
	}
	
	public void NonPerishable() throws InterruptedException
	{
		nonper.click();
		Thread.sleep(2000);
	}
	
	public void Invoice()
	{
		invoice.click();
	}
	
	public void Username() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
	}
	
	public void Preferences() throws InterruptedException
	{
		addpref.click();
		Thread.sleep(1000);
	}
	
	public void Profile() throws InterruptedException
	{
		profile.click();
		Thread.sleep(2000);
	}
	
	public void Vegetables() throws InterruptedException
	{
		veg.click();
		Thread.sleep(1000);
	}
	
	public void Logout() throws InterruptedException
	{
		logout.click();
		Thread.sleep(2000);
	}
	
	public void EditPhone()
	{
		edit.click();
	}
	
	public void FalcaLogo() throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
	}
	
	// Shipping address
	
	public void ClickAddAddress() throws InterruptedException
	{
		addr.click();
		Thread.sleep(2000);
	}
	
	public void AddAddress() throws InterruptedException
	{
		txtaddr.sendKeys("BmRoad Bangalore");
		Thread.sleep(2000);
	}
	
	public void EditAddress() throws InterruptedException
	{
		editaddr.clear();
		Thread.sleep(1000);
		editaddr.sendKeys("BmRoad Bengaluru");
		Thread.sleep(2000);
	}
	
	public void State() throws InterruptedException
	{
		state.sendKeys("Karnataka");
		Thread.sleep(2000);
	}
	
	public void Dist() throws InterruptedException
	{
		dist.sendKeys("Bangalore");
		Thread.sleep(2000);
	}
	
	public void Pin() throws InterruptedException
	{
		pin.sendKeys("560085");
		Thread.sleep(2000);
	}
	
	public void NearBy() throws InterruptedException
	{
		near.sendKeys("bank");
		Thread.sleep(2000);
	}
	
	public void SubmitBtn() throws InterruptedException
	{
		submit.click();
		Thread.sleep(2000);
	}
	
	public void ClickEditBtn() throws InterruptedException
	{
		editclk.click();
		Thread.sleep(2000);
	}
	
	public void UpdateEdit() throws InterruptedException
	{
		update.click();
		Thread.sleep(3000);
	}
	
	public void Editok() throws InterruptedException
	{
		editok.click();
		Thread.sleep(1000);
	}
	
	public void Deletebtn() throws InterruptedException
	{
		del.click();
		Thread.sleep(2000);
	}
	
	public void Fcategory() throws InterruptedException
	{
		ptype.sendKeys("Vegetables");
		Thread.sleep(2000);
	}
	
	public void FcategorySelect() throws InterruptedException
	{
		ptypeselect.click();
		Thread.sleep(2000);
	}
	
	public void Fstate() throws InterruptedException
	{
		fstate.sendKeys("Karnataka");
		Thread.sleep(2000);
	}
	
	public void Fdistrict() throws InterruptedException
	{
		fdist.sendKeys("Bangalore");
		Thread.sleep(2000);
	}
	
	public void Fupdatet() throws InterruptedException
	{
		fupdate.click();
		Thread.sleep(2000);
	}
	
	public void FokBtn() throws InterruptedException
	{
		fok.click();
		Thread.sleep(2000);
	}
	
	public void Fclear() throws InterruptedException
	{
		clear.click();
		Thread.sleep(2000);
	}
	
	public void NewSignUp() throws InterruptedException
	{
		signup.click();
		Thread.sleep(2000);
	}
	
	public void UserName() throws InterruptedException
	{
		uname.sendKeys("AutomationTesting");
		Thread.sleep(2000);
	}
	
	public void GST() throws InterruptedException
	{
		tin.sendKeys("1234567890");
		Thread.sleep(2000);
	}
	
	public void Email() throws InterruptedException
	{
		mail.sendKeys("falcauser@gmail.com");
		Thread.sleep(2000);
	}
	
	public void Phone() throws InterruptedException
	{
		phone.sendKeys("9620473366");
		Thread.sleep(2000);
	}
	
	public void password() throws InterruptedException
	{
		pwd.sendKeys("111111");
		Thread.sleep(2000);
	}
	
	public void ConfirmPassword() throws InterruptedException
	{
		cpwd.sendKeys("111111");
		Thread.sleep(2000);
	}
	
	public void AcceptTerms() throws InterruptedException
	{
		terms.click();
		Thread.sleep(2000);
	}
	
	public void SignUpBtn() throws InterruptedException
	{
		signbtn.click();
		Thread.sleep(4000);
	}
	
	public void LogoutNew() throws InterruptedException
	{
		slogout.click();
		Thread.sleep(3000);
	}
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span [text()='Shopping Cart']") private WebElement ShoppingCart;
	@FindBy(xpath="//a [text()='iPhone']") private WebElement Iphone;
	@FindBy(xpath="//a [text()='Apple']") private WebElement BrandName;
	@FindBy(xpath="//span[text()='My Account']") private WebElement MyAcc;
	@FindBy(xpath="//a[text()='Login']") private WebElement Loginoption;
	@FindBy(xpath="//input[@name='email']") private WebElement Emailadd; 
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement loginbtn;
	@FindBy(xpath="//h2") private WebElement MyAccountpage;
	
	
	
	public HomePage (WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);				
				
	}	
	
	public String verifyTitle()
	{
		
		String Pagetitle=driver.getTitle();
		System.out.println(Pagetitle+"######");
		return Pagetitle;
		
	}
	
	
	public boolean verifyshoppingCartIcon()
	{
		boolean icon=ShoppingCart.isDisplayed();
		return icon;
		
	}
	
	public void ClickonIphone()
	{
		Iphone.click();
		
	}

	public String VerifyBrandName()
	{
		
		String Brand=BrandName.getText();
		return Brand;
	}
	
	public void ClickMyaccountDropdown()
	{
		
		MyAcc.click();
	}
	
	public void ClickLoginOption()
	{
		
		Loginoption.click();
	}
	
    public void EnterEmailAddress(String Emailaddress)
    {
    	
    	Emailadd.sendKeys(Emailaddress);
    }
    
    public void EnterPassword(String Pwd)
    {
    	
    	Password.sendKeys(Pwd);
    }
    
    public void ClickLoginBtn()
    {
    	loginbtn.click();
    	
    }
    
    public String VerifyMyAccountPage()
    {
    	String ActualText=MyAccountpage.getText();
    	System.out.println(ActualText+"5555555");
    	return ActualText;
    }
}

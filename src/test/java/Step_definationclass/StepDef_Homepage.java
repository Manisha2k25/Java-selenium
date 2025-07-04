package Step_definationclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Homepage {
	
	 HomePage hp=new HomePage(DriverFactory.getDriver());
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() throws InterruptedException {
		WebDriver driver=DriverFactory.getDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		//Thread.sleep(10000);
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expected) throws InterruptedException {
		Thread.sleep(1000);
		String actual=hp.verifyTitle();
		Assert.assertEquals(actual, expected);
		
	    
	}

	@Then("shopping cart icon should be displayed")
	public void shopping_cart_icon_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
	    boolean icon=hp.verifyshoppingCartIcon();
	    Assert.assertTrue(icon);
	}

	@Given("User clicks on iphone")
	public void user_clicks_on_iphone() {
	    hp.ClickonIphone();
	}

	@Then("user should be able to see brand name {string}")
	public void user_should_be_able_to_see_brand_name(String expectedname) {
		String ActualName=hp.VerifyBrandName();
		Assert.assertEquals(ActualName, expectedname);
	    
	}

	@When("user click My account dropdown")
	public void user_click_my_account_dropdown() {
	   hp.ClickMyaccountDropdown();
	}

	@When("user click on login option")
	public void user_click_on_login_option() {
	    hp.ClickLoginOption();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String email, String Pass) throws InterruptedException {
	   hp.EnterEmailAddress(email);
	   Thread.sleep(2000);
	   hp.EnterPassword(Pass);
	}
	

	

	@When("user click on Login button")
	public void user_click_on_login_button() {
	   hp.ClickLoginBtn();
	}

	@Then("user should be redirected to the {string} page")
	public void user_should_be_redirected_to_the_page(String Expected) {
	   String Actual=hp.VerifyMyAccountPage();
	   Assert.assertEquals(Actual,Expected);
	}


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//=======================objects==========================
	
	
	@FindBy(linkText= "Log in")
	WebElement LoginLink;
	@FindBy(name= "user_login")
	WebElement UserName;
	@FindBy(id= "password")
	 WebElement password;
	@FindBy(className = "rememberMe")
	 WebElement Checkbox;
	@FindBy(name= "btn_login")
	 WebElement LoginBtn;
	 
	public LoginPage(WebDriver basedriver) {
		
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	//===================methods========================
	public void Login(String UserNameVal, String PassVal) {
	
		
		//step1 click login
		LoginLink.click();
		//step2 enter user name
        UserName.sendKeys(UserNameVal);
        //step 3 enter password
        password.sendKeys(PassVal);
        //step 4 click remember me
        Checkbox.click();
        //step5 login
       LoginBtn.click();
        //step6
        
		
		
	}

}
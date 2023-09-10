package org.sample;
import org.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPagePOM extends Base{
	
	public LoginPagePOM() {
	PageFactory.initElements(driver,this);
}
	@FindBy(id="email")
	private WebElement userName;
	public WebElement getUsername() {
		return userName;
		}
	@FindBy(id="pass")
	private WebElement getPassword;
	public WebElement getPassword() {
		return getPassword;
	}
	@FindBy(id="loginbutton")
	private WebElement getLogin;
	public WebElement getLogin() {
		return getLogin;
	}
}

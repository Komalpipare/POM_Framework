package com.saucedemo.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	//Utilization
	public void SetLogin(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}

}

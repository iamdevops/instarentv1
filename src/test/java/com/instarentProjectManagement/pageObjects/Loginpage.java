package com.instarentProjectManagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;
	public Loginpage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement users;
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement signinButton;
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement usersi;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordi;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement signinButtoni;
	
	@FindBy(xpath="//img[@src='./assets/img/user_area/icons/logout.png']")
	WebElement logoutButton;
	@FindBy(xpath="//img[@src='./assets/img/user_area/icons/logout.png']")
	WebElement logoutButtons;
	
 public void setUsername(String username) {
	 users.sendKeys(username);
 }
 public void setPassword(String passwords) {
	 password.sendKeys(passwords);
 }
 public void clickSignin() {
	 signinButton.click(); 
 }
 public void setUsernamei(String username) {
	 usersi.sendKeys(username);
 }
 public void setPasswordi(String passwords) {
	 passwordi.sendKeys(passwords);
 }
 public void clickSignini() {
	 signinButtoni.click(); 
 }
 public void clickLogout() {
	 logoutButton.click(); 
 }
 public void clickLogouti() {
	 logoutButton.click(); 
 }

}

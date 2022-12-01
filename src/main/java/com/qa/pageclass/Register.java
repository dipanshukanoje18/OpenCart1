package com.qa.pageclass;

import com.qa.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register extends TestBase {

    public Register()
    {
        PageFactory.initElements(driver , this);

    }
    @FindBy(xpath = "//header/nav[1]/div[1]/div[2]/div[1]/a[2]")
    private WebElement register_btn;
    public void clickOnregisterBtn()
    {
        register_btn.click();
    }
    @FindBy(xpath ="//input[@id='input-username']")
    private WebElement user_btn;
    public void writeUser(String username)
    {
        user_btn.sendKeys(username);
    }
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstname_btn;
    public void writeFirst(String firstname)
    {
        firstname_btn.sendKeys(firstname);
    }
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastname_btn;
    public void writelast(String lastname)
    {
        lastname_btn.sendKeys(lastname);
    }
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email_btn;
    public void writeEmail(String email)
    {
        email_btn.sendKeys(email);
    }
    @FindBy(xpath = "//select[@id='input-country']")
    private WebElement drop_btn;
    public void select_country(String country)
    {
        Select s = new Select(drop_btn);
        s.selectByVisibleText(country);
    }
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement pass_btn;
    public void writePass(String password)
    {
        pass_btn.sendKeys(password);
    }


}

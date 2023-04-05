package marchbatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory1 {
		// TODO Auto-generated method stub
WebDriver driver;
//By myaccountlink = By.linkText("My Account");
@FindBy(linkText="My Account")
WebElement myaccountlink;

//By loginlink= By.linkText("Login");
@FindBy(linkText="Login")
WebElement loginlink;

//By enteremail=By.id("input-email");
@FindBy(id="input-email")
WebElement enteremail;

//By enterpassword=By.id("input-password");
@FindBy(id="input-password")
WebElement enterpassword;

//By loginbutton= By.id("//button[@type='submit']");
@FindBy(xpath="//button[@type='submit']")
WebElement loginbutton;


public void clickonmyaccount()
{
	myaccountlink.click();	
}
public void clickonlogin()
{
	loginlink.click();
}
public void clickonenteremail(String username )
{
	enteremail.sendKeys(username);	
}
public void clickonenterpassword(String password)
{
	enterpassword.sendKeys(password);
}
public void clickonloginbutton()
{
	loginbutton.click();	
}
}
	



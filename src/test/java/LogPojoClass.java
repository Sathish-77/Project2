import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPojoClass extends BClass {
public LogPojoClass() {

PageFactory.initElements(driver, this);}
@FindBy(id="nav-link-accountList")
private WebElement lists;

@FindBy(className="a-button-text")

private WebElement create;
@FindBy(id="ap_customer_name")
private WebElement username; 
@FindBy(id="ap_phone_number")
private WebElement mob;
@FindBy(id="ap_email")
private WebElement mail;
@FindBy(id="ap_password")
private WebElement pass;
public WebElement getLists() {
	return lists;
}

public WebElement getCreate() {
	return create;
}
public WebElement getUsername() {
	return username;
}
public WebElement getMob() {
	return mob;
}
public WebElement getMail() {
	return mail;
}
public WebElement getPass() {
	return pass;
}











}

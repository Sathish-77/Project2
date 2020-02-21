import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BClass {
	static WebDriver driver;
public static void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\eclipse-workspace\\Ecom\\src\\test\\java\\driver\\chromedriver.exe");
driver=new ChromeDriver();
System.out.println("Browser Launch");
}
public static  void maximize() {
driver.manage().window().maximize();
System.out.println("Window maximized");}
public static void loadUrl(String value) {
driver.get(value);
}

public static void mouseHover(WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele);
}
public static void select(WebElement ele) {
ele.click();
}
public static void fill(WebElement ele,String value) {
	ele.sendKeys(value);
}






}
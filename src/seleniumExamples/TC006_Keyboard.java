package seleniumExamples;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC006_Keyboard {
public static void main(String args[]) throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("sureshIt");//Enter username by using name element locator
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
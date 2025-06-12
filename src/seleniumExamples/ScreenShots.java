package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class ScreenShots {
	
	
	public static void main(String args[]) throws Exception{
		//Test Steps
	WebDriver driver = new FirefoxDriver();
	try {
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	//----mouseover
	Actions ac  = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("Mouseover completed");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Add Employee123")).click();
	System.out.println("cliked on addemp submenu");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	}
	catch(Exception e)		{
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f1, new File("C:\\Users\\prath\\Testing project\\TestResults.png"));
	  }
	driver.close();
	}
	}


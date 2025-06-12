package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseoverTask {
	public static void main(String args[]) throws Exception {
		WebDriver driver=new FirefoxDriver();//opens browser
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");//enters url
		//enters user name and password
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		//login button
		driver.findElement(By.name("Submit")).click();
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Time"))).perform();//time
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/ul/li[4]/ul/li[1]/a"))).perform();//timesheet
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/ul/li[4]/ul/li[1]/ul/li[2]/a"))).perform();//employee timesheet
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

}

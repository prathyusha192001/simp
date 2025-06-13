package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Alerts {
	public static void main(String args[]) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("sureshIt");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		//Hi i have commented in alerts
	}

}

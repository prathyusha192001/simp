package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class E_Banking_1 {
	public static void main(String args[]) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://ctcorphyd.com/EBanking_build1/");
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/div[2]/ul/li[7]/a")).click();
	driver.findElement(By.name("uid")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/form/input[3]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul/li[9]/a")).click();
	Thread.sleep(3000);
	driver.close();
	}

}

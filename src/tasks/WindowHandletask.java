package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class WindowHandletask {
 public static void main(String args[]) {
	 WebDriver driver= new FirefoxDriver();
	 driver.navigate().to("https://www.amazon.in/s?k=Kids+furnishings");
 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/span/div/div/div[3]/div[2]/a/h2")).click();
 String Main = driver.getWindowHandle();
 driver.switchTo().window(Main);
 
 }
}

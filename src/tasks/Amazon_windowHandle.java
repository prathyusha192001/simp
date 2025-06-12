package tasks;
import org.openqa.selenium.WebDriver;//To acceess webdriver classes & methods
import org.openqa.selenium.firefox.FirefoxDriver;// to access required browser
import org.openqa.selenium.By;


public class Amazon_windowHandle {
	public static void main(String args[]) throws Exception {
  
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.amazon.in/s?i=computers&bbn=976392031&rh=n%3A1388963031https://www.amazon.in/s?i=computers&bbn=976392031&rh=n%3A1388963031");
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div[2]/div[1]/a/h2/span")).click();
//getWindowHandle
String wind1=new String(driver.getWindowHandle());//unnessary to new here
System.out.println(wind1);
Thread.sleep(3000);
driver.switchTo().window(wind1);
	}
	
}
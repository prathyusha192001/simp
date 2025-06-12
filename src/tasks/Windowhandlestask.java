package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Windowhandlestask {
	public static void main(String args[]) throws Exception{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/s?i=computers&bbn=976392031&rh=n%3A1388963031");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div[2]/div[1]/a/h2/span")).click();
		//String main= driver.getWindowHandle();
		Thread.sleep(3000);
		//driver.switchTo().window(main);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[2]/div[1]/a/h2/span")).click();
		Thread.sleep(3000);
		ArrayList<String> Multi= new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Multi.get(0));
		
	}
	

}

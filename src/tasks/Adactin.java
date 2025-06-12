package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;

public class Adactin {
	public static void main(String args[]) throws Exception {
		WebDriver driver=new FirefoxDriver();//opens browser
		Thread.sleep(3000);
		driver.navigate().to("https://adactinhotelapp.com/");//enters url
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Prathyusha19");//enter username
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("6W8XW0");//enter password
		Thread.sleep(3000);
		driver.findElement(By.className("login_button")).click();//click on login button
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();//click on logout link
		Thread.sleep(3000);
		driver.close();//close browser
		
	}

}

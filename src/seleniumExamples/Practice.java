package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice {
	public static void main(String arg[]) throws Exception { 
WebDriver driver= new FirefoxDriver();
driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
driver.manage().window().maximize();
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/nav[2]/div/div[1]/ul/li[2]/a"))).doubleClick().perform();
//ac.moveToElement(driver.findElement(By.linkText("Test Scenario Examples"))).click().perform();
driver.findElement(By.xpath("/html/body/header/div/nav[2]/div/div[1]/ul/li[2]/ul/li[3]/a")).click();
driver.navigate().back();

driver.findElement(By.linkText("This is a link")).click();
driver.findElement(By.name("firstName")).sendKeys("I am good");
driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/p[3]/button[1]")).click();
//Thread.sleep(3000);
//ac.doubleClick(driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/p[3]/button[2]"))).perform();
driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/form[2]/input[2]")).click();

Select st= new Select(driver.findElement(By.id("testingDropdown")));
st.selectByVisibleText("Manual Testing");

//driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[2]/button")).click();
//
//Alert alert = driver.switchTo().alert();
//System.out.println("Alert Text\n" + alert.getText());
//alert.accept();
driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[2]/button")).click();
Thread.sleep(3000);
Alert a= driver.switchTo().alert();
a.accept();
driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[3]/button")).click();
Thread.sleep(3000);
Alert b= driver.switchTo().alert();
b.dismiss();
System.out.println("done");

ac.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"myImage\"]")), driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"))).build().perform();
System.out.println("dragdrop");


	}
	
	}


package seleniumExamples;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC008_WindowHandlers {
public static void main(String args[]) throws Exception {
	WebDriver driver=new FirefoxDriver();
	//w1
	driver.get("file:///C:/Users/prath/Downloads/multiplewindows.html");
	//w2
	driver.findElement(By.id("btn2")).click();
	//w3
	driver.findElement(By.id("btn3")).click();
	//windowHandlers
	ArrayList<String> windinfo= new ArrayList<>(driver.getWindowHandles());
	//navigate to w1
	Thread.sleep(3000);
	driver.switchTo().window(windinfo.get(0));
	driver.switchTo().window(windinfo.get(1));
	driver.close();
	

}
}

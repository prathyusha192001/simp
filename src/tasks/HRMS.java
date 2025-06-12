package tasks;
import org.openqa.selenium.WebDriver;//To acceess webdriver classes & methods
import org.openqa.selenium.firefox.FirefoxDriver;// to access required browser
import org.openqa.selenium.By;//To access object indentification/Element locator methods

public class HRMS {


		public static void main(String args[]) throws Exception {
			//Manual test steps
	//Interface          //Interface implemented class name        
	WebDriver driver=new FirefoxDriver();//opens browser
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");//It will enter url in browser
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("sureshIt");//Enter username by using name element locator
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");//Enter passwors by using name element locator
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();//Click on login button
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();//click on logout 
	Thread.sleep(3000);//wait for some time

	driver.close();//close the browser



		}

	}



package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class Wait {
	
		public static void main(String args[]) throws Exception{
			// Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		//wait for login button avaliable -- explicit wait
		WebDriverWait  wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.
				  elementToBeClickable(
				  driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		
		
		//wait for emp: info: page -- implicit wait;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();
		}
		}


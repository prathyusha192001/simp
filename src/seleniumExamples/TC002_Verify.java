package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC002_Verify {
	String url= "https://ctcorphyd.com/SureshIT/login.php";
	String username="sureshit";
	String password="sureshit";
	String tittle1="OrangeHRM - New Level of HR Management";
	String tittle2="SureshIT";
	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		TC002_Verify v=new TC002_Verify();
		System.out.println("Browser opened");
		driver.navigate().to(v.url);
		//verify page/application title
		if(driver.getTitle().equals(v.tittle1)) {
			System.out.println("title matched");
			System.out.println(driver.getTitle());
		}
		else
		{
			System.out.println("title not matched");
			System.out.println(driver.getTitle());
		}
		//Hardcoded
		//driver.findElement(By.name("txtUserName")).sendKeys("sureshIt");//Enter username by using name element locator
		//driver.findElement(By.name("txtPassword")).sendKeys("sureshit");//Enter passwors by using name element locator
		
		//By using variables
		driver.findElement(By.name("txtUserName")).sendKeys(v.username);//Enter username by using name element locator
		driver.findElement(By.name("txtPassword")).sendKeys(v.password);//Enter passwors by using name element locator
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();//Click on login button
		System.out.println("Login completed");
		if(driver.getTitle().equals(v.tittle2)) {
			System.out.println("Title matched");
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();//click on logout 
		System.out.println("Logot completed");
		Thread.sleep(3000);//wait for some time

		driver.close();//close the browser
		System.out.println("Browser closed");
		
	}
	

}

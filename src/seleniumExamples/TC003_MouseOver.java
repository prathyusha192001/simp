package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC003_MouseOver {
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
		//MouseOver
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		System.out.println("mouseover completed");
		ac.moveToElement(driver.findElement(By.linkText("Add Employee"))).doubleClick().perform();
		Thread.sleep(3000);
		System.out.println("Add employee selected");
		//last name
		Thread.sleep(5000);
		//enter into frame...........
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[2]")).sendKeys("Car");
		//first name
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[3]")).sendKeys("Selenium");
		//Middle name
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[4]")).sendKeys("Hello");
		//nickname
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[5]")).sendKeys("nickk");
		//save button
		driver.findElement(By.className("savebutton")).click();
		//exit from frame
		driver.switchTo().defaultContent();		//logout link
		driver.findElement(By.linkText("Logout")).click();//click on logout 
		System.out.println("Logout completed");
		Thread.sleep(3000);//wait for some time

		driver.close();//close the browser
		System.out.println("Browser closed");
		
	}
	

}

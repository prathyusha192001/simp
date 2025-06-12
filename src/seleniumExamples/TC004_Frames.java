package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC004_Frames {
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
		driver.findElement(By.name("txtUserName")).sendKeys(v.username);//Enter username by using name element locator
		driver.findElement(By.name("txtPassword")).sendKeys(v.password);//Enter passwors by using name element locator
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();//Click on login button
		System.out.println("Login completed");
		//====================================
		//enter into frame
		driver.switchTo().frame("rightMenu");
		
		//click on add button
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[2]")).sendKeys("Car");
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[3]")).sendKeys("Selenium");
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[4]")).sendKeys("Hello");
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[5]")).sendKeys("nickk");
		driver.findElement(By.className("savebutton")).click();
		
		//exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();//click on logout 
		System.out.println("Logot completed");
		Thread.sleep(3000);//wait for some time

		driver.close();//close the browser
		System.out.println("Browser closed");
		
	}
	

}

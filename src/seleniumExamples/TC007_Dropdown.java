package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC007_Dropdown {
	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		//Enter frames
		driver.switchTo().frame("rightMenu");
		//dropdown
		Select st=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/select")));//dropdown
		//st.selectByVisibleText("Emp. ID");//inside drop down
		//st.selectByIndex(2);//another method
		st.selectByValue("0");
		
		driver.findElement(By.name("loc_name")).sendKeys("0481");//searchfor
		driver.findElement(By.xpath("//input[@value='Search']")).click();//search button
		//checkbox
		driver.findElement(By.name("chkLocID[]")).click();//checkbox
		driver.findElement(By.xpath("//input[@value='Delete']")).click();//delete button
		//exit frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}
}

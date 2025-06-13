package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
public class WebTable2 {
	public static void main(String args[]) throws Exception{
		// Test Steps
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/prath/Downloads/WebTable.html");
	Thread.sleep(3000);
	//Count row
	int row = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
	System.out.println(row);
	int col = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
	System.out.println(col);
	ArrayList<WebElement> rcol = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td"));
	System.out.println(rcol.size());
	//Retreve data
		String cell = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[4]/td[2]")).getText();
		System.out.println(cell);
		
		
		//tabledata
		for(int i=1;i<=row;i++) {
			String data= driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data);
		}
	driver.close();
	
	
	
	}
}

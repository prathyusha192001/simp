package seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class WebTable {
	public static void main(String args[]) throws Exception{
		// Test Steps
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/prath/Downloads/WebTable.html");
	Thread.sleep(3000);
	//Count
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
	System.out.println("Row Count is " + row);
	Thread.sleep(3000);
	System.out.println("Col Count is " + col);
	Thread.sleep(3000);
	System.out.println("Row_Col Count is " + row_col);

	//Data -- Cell
	String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	Thread.sleep(3000);
	//Data -- Table
	//  DT Var VV
	for(int i=1; i<=row; i++) {
	String data = driver.findElement(By.
			             xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
	System.out.println(data);
	Thread.sleep(3000);
	}
	driver.quit();
	}
	}



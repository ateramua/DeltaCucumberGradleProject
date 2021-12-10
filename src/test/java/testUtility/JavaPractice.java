package testUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaPractice {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			
			
			
			//Find Webtable Name and print
			
			//th[text()='Company']
			//th[text()='Group']
			//th[text()='Prev Close \(Rs/)']
			//th[text()='Current Price /(Rs/)']
			//th[text()='Company']
			//table[@class='dataTable']/thead/tr[1]/th
			
		//	List<WebElement> element=new ArrayList<WebElement>(); 
			List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr[1]/th"));
			int size = tableHeader.size();
			System.out.println(size);
			
			
			///Prints all header Names
			for (WebElement header:tableHeader) {
				header.getText();
				System.out.println(header.getText());
			} 
			
			
			//Prints the Header if it equals a certain Value
			for (WebElement header:tableHeader) {
				if (header.getText().equalsIgnoreCase("Company")){
					System.out.println(header.getText());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}

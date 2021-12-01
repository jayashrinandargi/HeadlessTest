package GoogleTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
    ChromeDriver driver;
	
	String url="https://www.google.com/?gws_rd=ssl";
	
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\eclipse-workspace\\libs\\chromedriver.exe");
		
	    driver=new ChromeDriver();
	    System.out.println("In the Invoke Browser function");
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    driver.get(url);
	    
	}
	
	
	public void CloseBrowser() {
		
		//driver.close();  quit() is used to exit the browser, end the session, tabs, pop-ups etc.
		driver.quit();  //only the window that has focus is closed. 
		
	}
	

	public void SearchGoogle() {
		
		WebElement userElement = driver.findElement(By.name("q"));
		userElement.sendKeys("Months of the year");
		
		
	}
}

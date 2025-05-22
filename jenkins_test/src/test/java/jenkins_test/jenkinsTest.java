package jenkins_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Demowebshop launched", true);
		
	} 
}

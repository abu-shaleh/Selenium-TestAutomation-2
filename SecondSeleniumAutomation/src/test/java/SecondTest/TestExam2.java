package SecondTest;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestExam2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Prj\\selenium-java-4.7.2\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Hide control by automation
				options.setExperimentalOption("useAutomationExtension", false);
				options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
				WebDriver driver = new ChromeDriver(options);
				// Maximize window size
				driver.manage().window().maximize();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				Select dropdown = new Select(driver.findElement(By.className("custom-select"))); 
				dropdown.selectByValue("1"); 
				Thread.sleep(2000); 
				driver.quit();
			
	}

}

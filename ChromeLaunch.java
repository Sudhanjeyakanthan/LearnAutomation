package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Chrome\\chromedriver.exe");
		System.out.println("Browser launched");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		
		

		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Sudhan");
		

		WebElement searchbutton = driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		searchbutton.click();
		
		driver.manage().window().maximize();
		System.out.println("maximized");

		// driver.quit();
		// System.out.println("Quit");
		// driver.close();

	}

}
